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

WebUI.navigateToUrl(Url)

WebUI.maximizeWindow()

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/HomePage/Logo_hp'))

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/HomePage/span_Iniciar sesin_hp'))

not_run: WebUI.delay(4)

WebUI.setText(findTestObject('DemoObjects/HomePage/input_Correo electrnico_username_login'), userName)

WebUI.setText(findTestObject('DemoObjects/HomePage/input_Contrasea_password_login'), Password)

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/HomePage/button_Iniciar sesin_login'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/search/Page_Vaso Termo de plstico con tapa rosca  _ccd971/input_Verde Oscuro_mainSearchbar'), 
    SlSearch)

WebUI.sendKeys(findTestObject('Object Repository/search/Page_Vaso Termo de plstico con tapa rosca  _ccd971/input_Verde Oscuro_mainSearchbar'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('search/product2image'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/search/Page_Vaso Termo de plstico con tapa rosca  _ccd971/button_Agregar a mi bolsa'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/search/Page_Vaso Termo de plstico con tapa rosca  _ccd971/input_Verde Oscuro_mainSearchbar'), 
    BTSearch)

WebUI.sendKeys(findTestObject('Object Repository/search/Page_Vaso Termo de plstico con tapa rosca  _ccd971/input_Verde Oscuro_mainSearchbar'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('search/Page_sofa  Liverpool.com.mx/img_Calificaciones_img_0'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/search/Page_Vaso Termo de plstico con tapa rosca  _ccd971/button_Agregar a mi bolsa'))

WebUI.delay(3)

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/search/Page_Sof cama Sofantstico Boxsofa Queen de _c8d0cd/span_2'))

WebUI.delay(3)

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/CartPage/button_Comprar_cart'))

WebUI.delay(3)

ActualOPCPageUrl = WebUI.getUrl()

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/checkoutpage/h4_Confirma tu compra_opc'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/checkoutpage/deliveryAddressHeading_address_opc'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/checkoutpage/label_Cambiar_Address_opc'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/checkoutpage/Forma de Pago_payment_opc'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/checkoutpage/paymentSection_payment_opc'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/checkoutpage/label_Cambiar_payment_opc'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/checkoutpage/productSection_opc'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/checkoutpage/productImage_opc'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/checkoutpage/productName_opc'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/checkoutpage/productprice_opc'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/checkoutpage/totalPrice_opc'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/checkoutpage/promotionSection_opc'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/checkoutpage/button_Comprar para mesa de regalos_opc'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/checkoutpage/button_Mover a Wishlist_opc'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/checkoutpage/button_Eliminar_opc'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/checkoutpage/button_Cupones_opc'))

not_run: CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/checkoutpage/label_Cambiar_payment_opc'))

not_run: CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/checkoutpage/button_Efectivo y Transferencias_payment_opc'))

not_run: CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/checkoutpage/button_Continuar_payment_opc'))

WebUI.delay(4)

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/checkoutpage/button_Finalizar compra_opc'))

WebUI.closeBrowser()

