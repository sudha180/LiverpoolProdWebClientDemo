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

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/Logo_hp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/searchTextbox_hp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/a_Mis Compras_hp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/span_Iniciar sesin_hp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/bagIcon_hp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/multiSites_hp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/span_Categoras_hp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/primaryBanner_hp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/secondaryBanner_hp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/carousel1_hp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/footer_hp'), 0)

/*
 * String a; a.leng
 */
WebUI.closeBrowser()

WebUI.click(findTestObject('DemoObjects/HomePage/span_Iniciar sesin_hp'))

WebUI.delay(4)

WebUI.setText(findTestObject('DemoObjects/HomePage/input_Correo electrnico_username_login'), 'sudha.addepalli6662@gmail.com')

WebUI.setEncryptedText(findTestObject('DemoObjects/HomePage/input_Contrasea_password_login'), 'R2dZ4hvJ2uivgdeNE3/vtQ==')

WebUI.click(findTestObject('DemoObjects/HomePage/button_Iniciar sesin_login'))

WebUI.click(findTestObject('DemoObjects/HomePage/span_Categoras_hp'))

CustomKeywords.'customkeywords.myKeywords.clickElementWithoutScroll'(findTestObject('HomePage/l1Category_hp'))

WebUI.click(findTestObject('HomePage/L1Category_HP'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('DemoObjects/BLPPage/breadCrumb_blp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/BLPPage/l2Category_blp'), 0)

WebUI.delay(3)

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.click(findTestObject('DemoObjects/BLPPage/l2Category_blp'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/CLPPage/breadCrumb_clp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CLPPage/a_Ver todo_clp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CLPPage/l3Category_clp'), 0)

WebUI.click(findTestObject('DemoObjects/CLPPage/l3Category_clp'))

WebUI.delay(3)

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.click(findTestObject('DemoObjects/PLPPage/moveToTopButton_plp'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/breadCrumb_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/div_Categoras_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/div_Marcas_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/div_Precios_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/div_Tamao_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/div_Vendido por_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/label_Color_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/label_Descuentos_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/productName_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/productImage2_plp'), 0)

WebUI.verifyElementPresent(findTestObject('pdp/productPrice_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/listView_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/gridView_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/button_Relevancia_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/button_Lo Ms Nuevo_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/button_Mayor precio_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/button_Menor precio_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/button_Calificaciones_plp'), 0)

WebUI.click(findTestObject('DemoObjects/PLPPage/a_Color_variants-normalizedColor-Blanco_plp'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/a_Limpiar Filtros_plp'), 0)

WebUI.click(findTestObject('DemoObjects/PLPPage/a_Limpiar Filtros_plp'))

WebUI.delay(3)

CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/carousel_plp'))

WebUI.click(findTestObject('DemoObjects/PLPPage/productImage2_plp'))

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/breadCrumb_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/alternateImages_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/productImage_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/productName_pdp'), 0)

'pb is not there'
WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/quantity_pdp'), 0)

CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PDPPage/regularPrice_pdp'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/DiscountPriceprice_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/p_Cdigo de Producto_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/ITRLink_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/ratingSection_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/span_Compartir_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/p_Ver ms promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/button_Agregar a mi bolsa_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/h3_Ofertas y promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/h3_Opiniones del artculo_pdp'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('DemoObjects/PDPPage/selectSize1'))

'pb\r\n'
WebUI.scrollToElement(findTestObject('DemoObjects/PDPPage/quantity_pdp'), 0)

WebUI.click(findTestObject('DemoObjects/PDPPage/selectSize1'))

WebUI.delay(3)

CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('DemoObjects/PDPPage/carousels_pdp'))

WebUI.click(findTestObject('DemoObjects/PDPPage/button_Agregar a mi bolsa_pdp'))

WebUI.scrollToElement(findTestObject('DemoObjects/PDPPage/quantity_pdp'), 0)

WebUI.click(findTestObject('DemoObjects/PDPPage/button_Agregar a mi bolsa_pdp'))

WebUI.delay(5)

WebUI.click(findTestObject('DemoObjects/HomePage/bagIcon_hp'))

WebUI.delay(3)

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

'pb\r\n'
WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/span_Mi Bolsa_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/myBagImageProduct_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/productName_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_EliminarIcon_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/totalPrice_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_mesaDeRegalos_cart'), 0)

'pb'
WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_Mover a Wishlist_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_Eliminar_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_Comprarahora_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/priceSection_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_Comprar_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/div_Entregaestimada_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/div_carouselSection_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_SeguirComprando_cart'), 0)

WebUI.click(findTestObject('DemoObjects/CartPage/button_Comprar_cart'))

WebUI.delay(3)

ActualOPCPageUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/h4_Confirma tu compra_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/deliveryAddressHeading_address_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/label_Cambiar_Address_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/Forma de Pago_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/paymentSection_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/label_Cambiar_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/productSection_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/productImage_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/productName_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/productprice_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/totalPrice_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/promotionSection_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/button_Comprar para mesa de regalos_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/button_Mover a Wishlist_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/button_Eliminar_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/button_Cupones_opc'), 0)

WebUI.click(findTestObject('DemoObjects/checkoutpage/label_Cambiar_payment_opc'))

WebUI.click(findTestObject('DemoObjects/checkoutpage/button_Efectivo y Transferencias_payment_opc'))

WebUI.click(findTestObject('DemoObjects/checkoutpage/button_Continuar_payment_opc'))

WebUI.delay(4)

WebUI.click(findTestObject('DemoObjects/checkoutpage/button_Finalizar compra_opc'))

WebUI.delay(3)

actualConfirmationUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('DemoObjects/ConfirmationPage/gracias por comprar_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/ConfirmationPage/a_Mis compras_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/ConfirmationPage/productDetailHeading_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/ConfirmationPage/productImage_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/ConfirmationPage/div_Entrega estimada_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/ConfirmationPage/addressSection_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/ConfirmationPage/paymentSection_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/ConfirmationPage/totalPrice_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/ConfirmationPage/legalInfo_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/ConfirmationPage/button_Descargar ticket de pago_confirmation'), 
    0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/ConfirmationPage/referenceNumber_confirmation'), 0)

referenceNumber_confirmation = WebUI.getText(findTestObject('DemoObjects/ConfirmationPage/referenceNumber_confirmation'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/ConfirmationPage/carousel_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/ConfirmationPage/button_Continuar comprando_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/ConfirmationPage/button_Descargar ticket de pago_confirmation'), 
    0)

WebUI.click(findTestObject('DemoObjects/ConfirmationPage/button_Ir a Mis compras_confirmation'))

WebUI.delay(3)

actualMisComprasUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.setText(findTestObject('DemoObjects/MisComprasPage/mainSearchbar_misCompras'), referenceNumber_confirmation)

WebUI.sendKeys(findTestObject('DemoObjects/MisComprasPage/mainSearchbar_misCompras'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('DemoObjects/MisComprasPage/breadCrumb_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/MisComprasPage/aside_leftNavigation_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/MisComprasPage/mainSearchbar_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/MisComprasPage/span_Filtrar compras_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/MisComprasPage/productName_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/MisComprasPage/img_product__image_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/MisComprasPage/button_Comprar nuevamente__misCompras'), 0)

WebUI.click(findTestObject('DemoObjects/MisComprasPage/button_Ver detalle de compra_misCompras'))

WebUI.delay(3)

actualMisComprasUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('DemoObjects/OrderDetailsPage/h1_Detalle de compra_orderDetails'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/OrderDetailsPage/addressSection_orderDetails'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/OrderDetailsPage/paymentSection_orderDetails'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/OrderDetailsPage/productDetails_orderDetails'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/OrderDetailsPage/referenceNumber_orderDetails'), 0)

WebUI.verifyTextPresent(referenceNumber_confirmation, false)

WebUI.closeBrowser()

