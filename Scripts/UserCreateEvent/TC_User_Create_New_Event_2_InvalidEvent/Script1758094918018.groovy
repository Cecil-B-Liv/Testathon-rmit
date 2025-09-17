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

WebUI.click(findTestObject('Object Repository/CreateNewEvent/InvalidEventCreate/button_Go to Feedback Page_ring-offset-back_b7d330'))

WebUI.click(findTestObject('Object Repository/CreateNewEvent/InvalidEventCreate/button_Contact_inline-flex items-center jus_751527'))

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/InvalidEventCreate/input_Email_email'), 'huynhngoctai@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/CreateNewEvent/InvalidEventCreate/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/CreateNewEvent/InvalidEventCreate/button_Password_flex w-fit items-center jus_d1da87'))

WebUI.click(findTestObject('Object Repository/CreateNewEvent/InvalidEventCreate/a_Contact_relative mx-2 flex items-center p_4e5178'))

WebUI.click(findTestObject('Object Repository/CreateNewEvent/InvalidEventCreate/button_Browse Events_inline-flex items-cent_10c86d'))

WebUI.click(findTestObject('Object Repository/CreateNewEvent/InvalidEventCreate/button_Cancel_inline-flex items-center just_6dcda0'))

WebUI.click(findTestObject('Object Repository/CreateNewEvent/InvalidEventCreate/button_Cancel_inline-flex items-center just_6dcda0'))

WebUI.click(findTestObject('Object Repository/CreateNewEvent/InvalidEventCreate/button_Cancel_inline-flex items-center just_6dcda0'))

WebUI.click(findTestObject('Object Repository/CreateNewEvent/InvalidEventCreate/button_Back_inline-flex items-center justif_ffb12c'))

WebUI.verifyElementText(findTestObject('Object Repository/CreateNewEvent/InvalidEventCreate/li'), 'Title is required')

WebUI.closeBrowser()

