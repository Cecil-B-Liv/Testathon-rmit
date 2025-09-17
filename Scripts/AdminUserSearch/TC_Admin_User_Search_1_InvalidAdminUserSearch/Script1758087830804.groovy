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

WebUI.click(findTestObject('Object Repository/AdminUserSearch/InvalidAdminUserSearch/button_Go to Feedback Page_ring-offset-back_b7d330'))

WebUI.click(findTestObject('Object Repository/AdminUserSearch/InvalidAdminUserSearch/button_Contact_inline-flex items-center jus_751527'))

WebUI.setText(findTestObject('Object Repository/AdminUserSearch/InvalidAdminUserSearch/input_Email_email'), 'Group2test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/AdminUserSearch/InvalidAdminUserSearch/input_Password_password'), 
    'cJINjjlHDJSMUa/C+8oeTQ==')

WebUI.click(findTestObject('Object Repository/AdminUserSearch/InvalidAdminUserSearch/button_Password_flex w-fit items-center jus_d1da87'))

WebUI.click(findTestObject('Object Repository/AdminUserSearch/InvalidAdminUserSearch/a_Dashboard_relative mx-2 flex items-center_5674a0'))

WebUI.click(findTestObject('Object Repository/AdminUserSearch/InvalidAdminUserSearch/span_Overview_ml-3 overflow-hidden whitespa_1d9a34'))

WebUI.click(findTestObject('Object Repository/AdminUserSearch/InvalidAdminUserSearch/input_Sep 17, 2025_filetext-foreground plac_9742c9'))

WebUI.setText(findTestObject('Object Repository/AdminUserSearch/InvalidAdminUserSearch/input_Sep 17, 2025_filetext-foreground plac_9742c9_1'), 
    'i')

WebUI.setText(findTestObject('Object Repository/AdminUserSearch/InvalidAdminUserSearch/input_Sep 17, 2025_filetext-foreground plac_9742c9_2'), 
    'in')

WebUI.setText(findTestObject('Object Repository/AdminUserSearch/InvalidAdminUserSearch/input_Sep 17, 2025_filetext-foreground plac_9742c9_3'), 
    'inv')

WebUI.setText(findTestObject('Object Repository/AdminUserSearch/InvalidAdminUserSearch/input_Sep 17, 2025_filetext-foreground plac_9742c9_4'), 
    'inva')

WebUI.setText(findTestObject('Object Repository/AdminUserSearch/InvalidAdminUserSearch/input_Sep 17, 2025_filetext-foreground plac_9742c9_5'), 
    'inval')

WebUI.setText(findTestObject('Object Repository/AdminUserSearch/InvalidAdminUserSearch/input_Sep 17, 2025_filetext-foreground plac_9742c9_6'), 
    'invali')

WebUI.setText(findTestObject('Object Repository/AdminUserSearch/InvalidAdminUserSearch/input_Sep 17, 2025_filetext-foreground plac_9742c9_7'), 
    'invalid')

WebUI.setText(findTestObject('Object Repository/AdminUserSearch/InvalidAdminUserSearch/input_Sep 17, 2025_filetext-foreground plac_9742c9_8'), 
    'invalidU')

WebUI.setText(findTestObject('Object Repository/AdminUserSearch/InvalidAdminUserSearch/input_Sep 17, 2025_filetext-foreground plac_9742c9_9'), 
    'invalidUs')

WebUI.setText(findTestObject('Object Repository/AdminUserSearch/InvalidAdminUserSearch/input_Sep 17, 2025_filetext-foreground plac_9742c9_10'), 
    'invalidUse')

WebUI.setText(findTestObject('Object Repository/AdminUserSearch/InvalidAdminUserSearch/input_Sep 17, 2025_filetext-foreground plac_9742c9_11'), 
    'invalidUser')

WebUI.verifyElementText(findTestObject('Object Repository/AdminUserSearch/InvalidAdminUserSearch/td_Actions_p-2 align-middle whitespace-nowr_e0235a'), 
    'No users found')

WebUI.closeBrowser()

