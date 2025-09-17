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

WebUI.click(findTestObject('Object Repository/UpdateEvent/DeleteEvent/button_Go to Feedback Page_ring-offset-back_b7d330'))

WebUI.click(findTestObject('Object Repository/UpdateEvent/DeleteEvent/button_Contact_inline-flex items-center jus_751527'))

WebUI.setText(findTestObject('Object Repository/UpdateEvent/DeleteEvent/input_Email_email'), 'huynhngoctai@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/UpdateEvent/DeleteEvent/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/UpdateEvent/DeleteEvent/button_Password_flex w-fit items-center jus_d1da87'))

WebUI.click(findTestObject('Object Repository/UpdateEvent/DeleteEvent/a_Contact_relative mx-2 flex items-center p_4e5178'))

WebUI.click(findTestObject('Object Repository/UpdateEvent/DeleteEvent/span_All Events_ml-3 overflow-hidden whites_490b21'))

WebUI.click(findTestObject('Object Repository/UpdateEvent/DeleteEvent/div_SOCIAL_absolute inset-0 bg-gradient-to-_55db9d'))

WebUI.click(findTestObject('Object Repository/UpdateEvent/DeleteEvent/button_Edit_justify-center whitespace-nowra_865c0f'))

WebUI.click(findTestObject('Object Repository/UpdateEvent/DeleteEvent/button_Cancel_inline-flex items-center just_6dcda0'))

WebUI.verifyElementText(findTestObject('Object Repository/UpdateEvent/DeleteEvent/li'), 'DeletedEvent deleted successfully')

WebUI.closeBrowser()

