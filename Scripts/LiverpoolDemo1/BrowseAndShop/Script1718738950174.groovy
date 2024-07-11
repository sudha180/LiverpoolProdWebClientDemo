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

WebUI.navigateToUrl(Url)

WebUI.maximizeWindow()

//asserting header
CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/HomePage/Logo_hp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/HomePage/searchTextbox_hp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/HomePage/a_Mis Compras_hp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/HomePage/span_Iniciar sesin_hp'))

//CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/HomePage/bagIcon_hp'))
CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/HomePage/span_Categoras_hp'))

//banner verification
CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/HomePage/primaryBanner_hp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/HomePage/secondaryBanner_hp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/HomePage/carousel1_hp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/HomePage/footer_hp'))

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/HomePage/span_Iniciar sesin_hp'))

//WebUI.delay(4)
WebUI.setText(findTestObject('DemoObjects/HomePage/input_Correo electrnico_username_login'), userName)

WebUI.setText(findTestObject('DemoObjects/HomePage/input_Contrasea_password_login'), Password)

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/HomePage/button_Iniciar sesin_login'))

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/HomePage/span_Categoras_hp'))

//CustomKeywords.'customkeywords.myKeywords.clickElementWithoutScroll'(findTestObject('HomePage/l1Category_hp'))
CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/HomePage/l1Category_hp'))

//WebUI.delay(3)
CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/BLPPage/breadCrumb_blp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/BLPPage/l2Category_blp'))

//WebUI.delay(3)
//CustomKeywords.'customkeywords.myKeywords.scrollWindow'()
CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/BLPPage/l2Category_blp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/CLPPage/breadCrumb_clp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/CLPPage/a_Ver todo_clp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/CLPPage/l3Category_clp'))

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/CLPPage/l3Category_clp'))

//WebUI.delay(3)
//CustomKeywords.'customkeywords.myKeywords.scrollWindow'()
//CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/PLPPage/moveToTopButton_plp'))
//Facet verification
CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PLPPage/breadCrumb_plp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PLPPage/div_Categoras_plp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PLPPage/div_Marcas_plp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PLPPage/div_Precios_plp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PLPPage/div_Tamao_plp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PLPPage/label_Color_plp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PLPPage/label_Descuentos_plp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PLPPage/productName_plp'))

//CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PLPPage/productPrice_plp'))
CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PLPPage/listView_plp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PLPPage/gridView_plp'))

//sorting options
CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PLPPage/button_Relevancia_plp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PLPPage/button_Lo Ms Nuevo_plp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PLPPage/button_Mayor precio_plp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PLPPage/button_Menor precio_plp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PLPPage/button_Calificaciones_plp'))

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/PLPPage/a_Color_variants-normalizedColor-Blanco_plp'))

//WebUI.delay(3)
CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PLPPage/a_Limpiar Filtros_plp'))

CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/search/Page_vaso  Liverpool.com.mx/img_Calificaciones_img_0'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PDPPage/breadCrumb_pdp'))

WebUI.setText(findTestObject('Object Repository/search/Page_Vaso Termo de plstico con tapa rosca  _ccd971/input_Verde Oscuro_mainSearchbar'), 
    SlSearch)

WebUI.sendKeys(findTestObject('Object Repository/search/Page_Vaso Termo de plstico con tapa rosca  _ccd971/input_Verde Oscuro_mainSearchbar'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('search/product2image'))

WebUI.delay(3)

not_run: CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/search/Page_Sof cama Sofantstico Boxsofa Queen de _c8d0cd/button_Agregar a mi bolsa'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PDPPage/alternateImages_pdp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PDPPage/productImage_pdp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PDPPage/productName_pdp'))

'pb is not there'
CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PDPPage/quantity_pdp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PDPPage/DiscountPriceprice_pdp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PDPPage/p_Cdigo de Producto_pdp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PDPPage/ITRLink_pdp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PDPPage/ratingSection_pdp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PDPPage/span_Compartir_pdp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PDPPage/p_Ver ms promociones_pdp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PDPPage/button_Agregar a mi bolsa_pdp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PDPPage/h3_Ofertas y promociones_pdp'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PDPPage/h3_Opiniones del artculo_pdp'))

WebUI.click(findTestObject('Object Repository/search/Page_Vaso Termo de plstico con tapa rosca  _ccd971/button_Agregar a mi bolsa'))

//WebUI.delay(3)
'pb\r\n'
not_run: WebUI.scrollToElement(findTestObject('DemoObjects/PDPPage/quantity_pdp'), 0)

not_run: WebUI.delay(4)

not_run: WebUI.click(findTestObject('DemoObjects/PDPPage/selectSize1'))

not_run: WebUI.delay(4)

'pb\r\n'
not_run: WebUI.scrollToElement(findTestObject('DemoObjects/PDPPage/productName_pdp'), 0)

not_run: WebUI.delay(2)

not_run: WebUI.doubleClick(findTestObject('DemoObjects/PDPPage/button_Agregar a mi bolsa_pdp'))

WebUI.delay(3)

not_run: CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/HomePage/bagIcon_hp'))

not_run: CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('DemoObjects/HomePage/bagIcon_hp'))

WebUI.enhancedClick(findTestObject('DemoObjects/HomePage/bagIcon_hp'))

WebUI.delay(3)

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/CartPage/span_Mi Bolsa_cart'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/CartPage/myBagImageProduct_cart'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/CartPage/productName_cart'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/CartPage/button_EliminarIcon_cart'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/CartPage/totalPrice_cart'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/CartPage/button_mesaDeRegalos_cart'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/CartPage/button_Eliminar_cart'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/CartPage/button_Comprarahora_cart'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/CartPage/priceSection_cart'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/CartPage/button_Comprar_cart'))

WebUI.closeBrowser()

