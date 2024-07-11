package com.katalon
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LiverpoolStepDefinitionFile {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I want to write a step with (.*)")
	def I_want_to_write_a_step_with_name(String name) {
		println name
	}

	@When("I check for the (\\d+) in step")
	def I_check_for_the_value_in_step(int value) {
		println value
	}

	@Then("I verify the (.*) in step")
	def I_verify_the_status_in_step(String status) {
		println status
	}

	@Given("I navigate to Liverpool Site")
	def openBrowserAndLaunchSite(){
		//WebUI.openBrowser('')
		WebUI.openBrowser(GlobalVariable.prodURL)
		//WebUI.navigateToUrl(GlobalVariable.prodURL)
	}

	@When("I click login button in homepage")
	def clickOnIniciarSession_hp() {
		WebUI.click(findTestObject('DemoObjects/HomePage/span_Iniciar sesin_hp'))
		WebUI.delay(4)
	}
	@And("I enter a valid username (.*) and valid password (.*)")
	def enterLoginCredentials_hp(String userName , String password) {
		WebUI.setText(findTestObject('DemoObjects/HomePage/input_Correo electrnico_username_login'), userName)
		WebUI.delay(4)
		WebUI.setText(findTestObject('DemoObjects/HomePage/input_Contrasea_password_login'), password)
		WebUI.click(findTestObject('DemoObjects/HomePage/button_Iniciar sesin_login'))
	}

	@Then("I should be able to login successfully and verify the HelloFisrtName in homepage")
	def verifySuccuessfulLogin_hp() {
		WebUI.delay(4)
		WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/span_HolaUser_hp'), 0)
	}
	@And("I enter an invalid username (.*) and valid password (.*)")
	def enterInvalidLoginCredentials_hp(String invaliduserName , String password) {
		WebUI.setText(findTestObject('DemoObjects/HomePage/input_Correo electrnico_username_login'), invaliduserName)
		WebUI.delay(4)
		WebUI.setText(findTestObject('DemoObjects/HomePage/input_Contrasea_password_login'), password)
		WebUI.click(findTestObject('DemoObjects/HomePage/button_Iniciar sesin_login'))
	}
	@Then("I should not be able to login successfully")
	def verifyUnSuccuessfulLogin_hp() {
		WebUI.delay(4)
		WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/span_HolaUser_hp'), 0, FailureHandling.STOP_ON_FAILURE)
	}
}