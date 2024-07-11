import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.navigateToUrl(Url)

WebUI.maximizeWindow()

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/HomePage/Logo_hp'))

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/HomePage/span_Iniciar sesin_hp'))

//not_run: WebUI.delay(4)
WebUI.setText(findTestObject('DemoObjects/HomePage/input_Correo electrnico_username_login'), userName)

System.out.println()

WebUI.setText(findTestObject('DemoObjects/HomePage/input_Contrasea_password_login'), Password)

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/HomePage/button_Iniciar sesin_login'))

not_run: WebUI.delay(4)

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/HomePage/span_HolaUser_hp'))

//add address
CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_/i_Hola sudha_icon-arrow_down'))

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_/a_Mi Cuenta'))

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Liverpool Mxico/span_Direcciones'))

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Liverpool Mxico/button_Agregar direccin'))

//addressName = RandomStringUtils.randomAlphabetic(8)
WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_Direccin de envo_shortName'), addressName)

WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_Alias de la direccin_cp'), cpCode)

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Liverpool Mxico/input_Estado_city'))

WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_Estado_city'), City)

WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_Colonia_street'), Street)

WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_Calle_numext'), ExternalNumber)

WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_y calle_cellphone'), Cellphone)

WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_text'), Telephone)

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Liverpool Mxico/button_Guardar'))

WebUI.delay(3)

WebUI.verifyTextPresent(addressName, false)

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_/i_Hola sudha_icon-arrow_down'))

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_/a_Mi Cuenta'))

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/myAccount/personalData_myAccount'))

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/myAccount/updatePersonalData_AM'))

/*
 * //PaternoName =
 * WebUI.getText(findTestObject('AccountManagement/LastName_Account'))
 * 'Genrating random paterno name ' PaternoName =
 * RandomStringUtils.randomAlphabetic(8)
 */
WebUI.clearText(findTestObject('DemoObjects/myAccount/PaternoName_AM'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('DemoObjects/myAccount/PaternoName_AM'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('DemoObjects/myAccount/PaternoName_AM'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('DemoObjects/myAccount/PaternoName_AM'), PaternoName)

System.out.println(PaternoName)

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/myAccount/updatePersonalDetails_AM'))

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/myAccount/personalData_myAccount'))

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/myAccount/updatePersonalData_AM'))

not_run: WebUI.verifyOptionPresentByValue(findTestObject('DemoObjects/myAccount/PaternoName_AM'), PaternoName, false, 0)

ActaulPaternoName = WebUI.getAttribute(findTestObject('DemoObjects/myAccount/PaternoName_AM'), 'value')

if (ActaulPaternoName == PaternoName) {
    System.out.println('paterno name is updated')
} else {
    System.out.println('paterno name is not updated')
}

not_run: WebUI.delay(4)

WebUI.closeBrowser()

