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

GlobalVariable.Url = Url
GlobalVariable.userName = userName
GlobalVariable.Password = Password
GlobalVariable.addressName = addressName
GlobalVariable.cpCode = cpCode
GlobalVariable.City = City
GlobalVariable.Street = Street
GlobalVariable.ExternalNumber = ExternalNumber
GlobalVariable.Cellphone = Cellphone
GlobalVariable.Telephone = Telephone


WebUI.navigateToUrl('https://www.liverpool.com.mx/tienda/home')

//WebUI.maximizeWindow()
WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/Logo_hp'), 0)

WebUI.click(findTestObject('DemoObjects/HomePage/span_Iniciar sesin_hp'))

not_run: WebUI.delay(4)

WebUI.setText(findTestObject('DemoObjects/HomePage/input_Correo electrnico_username_login'), 'sudha.addepalli6662@gmail.com')

WebUI.setEncryptedText(findTestObject('DemoObjects/HomePage/input_Contrasea_password_login'), 'R2dZ4hvJ2uivgdeNE3/vtQ==')

WebUI.click(findTestObject('DemoObjects/HomePage/button_Iniciar sesin_login'))

not_run: WebUI.delay(4)

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/span_HolaUser_hp'), 0)

//add address
WebUI.click(findTestObject('Object Repository/Page_/i_Hola sudha_icon-arrow_down'))

WebUI.click(findTestObject('Object Repository/Page_/a_Mi Cuenta'))

WebUI.click(findTestObject('Object Repository/Page_Liverpool Mxico/span_Direcciones'))

WebUI.click(findTestObject('Object Repository/Page_Liverpool Mxico/button_Agregar direccin'))

addressName = RandomStringUtils.randomAlphabetic(8)

WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_Direccin de envo_shortName'), addressName)

WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_Alias de la direccin_cp'), '12000')

WebUI.click(findTestObject('Object Repository/Page_Liverpool Mxico/input_Estado_city'))

WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_Estado_city'), 'Mexico')

WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_Colonia_street'), 'santafe')

WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_Calle_numext'), '1232323432')

WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_y calle_cellphone'), '4223423423')

WebUI.setText(findTestObject('Object Repository/Page_Liverpool Mxico/input_text'), '1242342343')

WebUI.click(findTestObject('Object Repository/Page_Liverpool Mxico/button_Guardar'))

WebUI.click(findTestObject('Object Repository/Page_/i_Hola sudha_icon-arrow_down'))

WebUI.click(findTestObject('Object Repository/Page_/a_Mi Cuenta'))

WebUI.click(findTestObject('DemoObjects/myAccount/personalData_myAccount'))

WebUI.click(findTestObject('DemoObjects/myAccount/updatePersonalData_AM'))

//PaternoName = WebUI.getText(findTestObject('AccountManagement/LastName_Account'))
'Genrating random paterno name '
PaternoName = RandomStringUtils.randomAlphabetic(8)

WebUI.clearText(findTestObject('DemoObjects/myAccount/PaternoName_AM'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('DemoObjects/myAccount/PaternoName_AM'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('DemoObjects/myAccount/PaternoName_AM'), PaternoName)

WebUI.click(findTestObject('DemoObjects/myAccount/updatePersonalDetails_AM'))

WebUI.click(findTestObject('DemoObjects/myAccount/personalData_myAccount'))

WebUI.click(findTestObject('DemoObjects/myAccount/updatePersonalData_AM'))

not_run: WebUI.delay(4)

getUpdatedName = WebUI.getText(findTestObject('DemoObjects/myAccount/PaternoName_AM'))

if (getUpdatedName == PaternoName) {
    System.out.println('paterno name is updated')
} else {
    System.out.println('paterno name is not updated')
}

WebUI.closeBrowser()

