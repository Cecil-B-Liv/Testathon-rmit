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

WebUI.click(findTestObject('Object Repository/AdminCreateUser/InvalidNewUserCreate/button_Go to Feedback Page_ring-offset-back_b7d330'))

WebUI.click(findTestObject('Object Repository/AdminCreateUser/InvalidNewUserCreate/button_Contact_inline-flex items-center jus_751527'))

WebUI.setText(findTestObject('Object Repository/AdminCreateUser/InvalidNewUserCreate/input_Email_email'), 'Group2test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/AdminCreateUser/InvalidNewUserCreate/input_Password_password'), 
    'cJINjjlHDJSMUa/C+8oeTQ==')

WebUI.click(findTestObject('Object Repository/AdminCreateUser/InvalidNewUserCreate/button_Password_flex w-fit items-center jus_d1da87'))

WebUI.click(findTestObject('Object Repository/AdminCreateUser/InvalidNewUserCreate/a_Dashboard_relative mx-2 flex items-center_5674a0'))

WebUI.click(findTestObject('Object Repository/AdminCreateUser/InvalidNewUserCreate/a_Overview_group flex items-center rounded-_195f39'))

WebUI.click(findTestObject('Object Repository/AdminCreateUser/InvalidNewUserCreate/button_All Roles_inline-flex items-center j_127fd4'))

WebUI.setText(findTestObject('Object Repository/AdminCreateUser/InvalidNewUserCreate/input_Full Name_create-name'), 'testUser')

WebUI.setText(findTestObject('Object Repository/AdminCreateUser/InvalidNewUserCreate/input_Email Address_create-email'), 
    'testUser@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/AdminCreateUser/InvalidNewUserCreate/input_Password_create-password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/AdminCreateUser/InvalidNewUserCreate/button_Date of Birth_create-dob'))

WebUI.click(findTestObject('Object Repository/AdminCreateUser/InvalidNewUserCreate/button_S_mx-auto flex h-9 w-9 items-center _2fbd85'))

WebUI.click(findTestObject('Object Repository/AdminCreateUser/InvalidNewUserCreate/button_Cancel_inline-flex items-center just_6dcda0'))

WebUI.verifyElementText(findTestObject('Object Repository/AdminCreateUser/InvalidNewUserCreate/div_Failed to create user Email already exi_d43cd9'), 
    '')

WebUI.closeBrowser()

