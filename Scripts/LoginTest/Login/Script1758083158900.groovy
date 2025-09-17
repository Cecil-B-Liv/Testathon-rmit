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

WebUI.navigateToUrl('http://localhost:5173/')

WebUI.click(findTestObject('Object Repository/Page_Eventify/button_Go to Feedback Page_ring-offset-back_b7d330'))

WebUI.click(findTestObject('Object Repository/Page_Eventify/button_Contact_inline-flex items-center jus_751527'))

WebUI.setText(findTestObject('Object Repository/Page_Eventify/input_Email_email'), 'alice.nguyen@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Eventify/input_Password_password'), 'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Object Repository/Page_Eventify/label_Email_block text-sm font-medium text-_ff37a6'))

WebUI.click(findTestObject('Object Repository/Page_Eventify/button_Password_flex w-fit items-center jus_d1da87'))

WebUI.click(findTestObject('Object Repository/Page_Eventify/html'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Eventify/span_Alice Nguyen_max-w-120px truncate text_38fd33'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Eventify/span_Alice Nguyen_max-w-120px truncate text_38fd33'), 
    'alice.nguyen@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Eventify/div_Settings_data-variantdestructivetext-de_2076fc'))

