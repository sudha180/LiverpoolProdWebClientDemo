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

//import customkeywords.myKeywords as myKeywords
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.prodURL)

WebUI.maximizeWindow()

//asserting header
WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/Logo_hp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/searchTextbox_hp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/a_Mis Compras_hp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/span_Iniciar sesin_hp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/bagIcon_hp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/span_Categoras_hp'), 0)

//banner verification
WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/primaryBanner_hp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/secondaryBanner_hp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/carousel1_hp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/footer_hp'), 0)

WebUI.click(findTestObject('DemoObjects/HomePage/span_Iniciar sesin_hp'))

//WebUI.delay(4)
WebUI.setText(findTestObject('DemoObjects/HomePage/input_Correo electrnico_username_login'), 'sudha.addepalli6662@gmail.com')

WebUI.setEncryptedText(findTestObject('DemoObjects/HomePage/input_Contrasea_password_login'), 'R2dZ4hvJ2uivgdeNE3/vtQ==')

WebUI.click(findTestObject('DemoObjects/HomePage/button_Iniciar sesin_login'))

WebUI.click(findTestObject('DemoObjects/HomePage/span_Categoras_hp'))

//CustomKeywords.'customkeywords.myKeywords.clickElementWithoutScroll'(findTestObject('HomePage/l1Category_hp'))
WebUI.click(findTestObject('DemoObjects/HomePage/l1Category_hp'))

//WebUI.delay(3)
WebUI.verifyElementPresent(findTestObject('DemoObjects/BLPPage/breadCrumb_blp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/BLPPage/l2Category_blp'), 0)

//WebUI.delay(3)
//CustomKeywords.'customkeywords.myKeywords.scrollWindow'()
WebUI.click(findTestObject('DemoObjects/BLPPage/l2Category_blp'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/CLPPage/breadCrumb_clp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CLPPage/a_Ver todo_clp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CLPPage/l3Category_clp'), 0)

WebUI.click(findTestObject('DemoObjects/CLPPage/l3Category_clp'))

//WebUI.delay(3)
//CustomKeywords.'customkeywords.myKeywords.scrollWindow'()
//WebUI.click(findTestObject('DemoObjects/PLPPage/moveToTopButton_plp'))
//Facet verification
WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/breadCrumb_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/div_Categoras_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/div_Marcas_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/div_Precios_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/div_Tamao_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/label_Color_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/label_Descuentos_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/productName_plp'), 0)

//WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/productPrice_plp'), 0)
WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/listView_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/gridView_plp'), 0)

//sorting options
WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/button_Relevancia_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/button_Lo Ms Nuevo_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/button_Mayor precio_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/button_Menor precio_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/button_Calificaciones_plp'), 0)

WebUI.click(findTestObject('DemoObjects/PLPPage/a_Color_variants-normalizedColor-Blanco_plp'))

//WebUI.delay(3)
WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/a_Limpiar Filtros_plp'), 0)

WebUI.click(findTestObject('Object Repository/search/Page_vaso  Liverpool.com.mx/img_Calificaciones_img_0'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/breadCrumb_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/alternateImages_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/productImage_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/productName_pdp'), 0)

'pb is not there'
WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/quantity_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/DiscountPriceprice_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/p_Cdigo de Producto_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/ITRLink_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/ratingSection_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/span_Compartir_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/p_Ver ms promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/button_Agregar a mi bolsa_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/h3_Ofertas y promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/h3_Opiniones del artculo_pdp'), 0)

//WebUI.delay(3)
'pb\r\n'
WebUI.scrollToElement(findTestObject('DemoObjects/PDPPage/quantity_pdp'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('DemoObjects/PDPPage/selectSize1'))

//WebUI.delay(3)
WebUI.scrollToElement(findTestObject('DemoObjects/PDPPage/quantity_pdp'), 0)

WebUI.click(findTestObject('DemoObjects/PDPPage/button_Agregar a mi bolsa_pdp'))

WebUI.delay(2)

WebUI.click(findTestObject('DemoObjects/HomePage/bagIcon_hp'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/span_Mi Bolsa_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/myBagImageProduct_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/productName_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_EliminarIcon_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/totalPrice_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_mesaDeRegalos_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_Eliminar_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_Comprarahora_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/priceSection_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_Comprar_cart'), 0)

WebUI.closeBrowser()

