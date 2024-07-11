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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.liverpool.com.mx/tienda/home')

WebUI.setText(findTestObject('Object Repository/search/Page_Liverpool es parte de mi vida  Liverpo_449aed/input_Toys R Us_mainSearchbar'), 
    'vaso')

WebUI.sendKeys(findTestObject('Object Repository/search/Page_Liverpool es parte de mi vida  Liverpo_449aed/input_Toys R Us_mainSearchbar'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/search/Page_vaso  Liverpool.com.mx/img_Calificaciones_img_0'))

WebUI.click(findTestObject('Object Repository/search/Page_Vaso Termo de plstico con tapa rosca  _ccd971/button_Agregar a mi bolsa'))

WebUI.setText(findTestObject('Object Repository/search/Page_Vaso Termo de plstico con tapa rosca  _ccd971/input_Verde Oscuro_mainSearchbar'), 
    'sofa')

WebUI.sendKeys(findTestObject('Object Repository/search/Page_Vaso Termo de plstico con tapa rosca  _ccd971/input_Verde Oscuro_mainSearchbar'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/search/Page_sofa  Liverpool.com.mx/img_Calificaciones_img_0'))

WebUI.click(findTestObject('Object Repository/search/Page_Sof cama Sofantstico Boxsofa Queen de _c8d0cd/button_Agregar a mi bolsa'))

WebUI.click(findTestObject('Object Repository/search/Page_Sof cama Sofantstico Boxsofa Queen de _c8d0cd/span_2'))

