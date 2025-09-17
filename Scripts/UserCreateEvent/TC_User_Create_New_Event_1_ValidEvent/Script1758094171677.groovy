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

WebUI.click(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/button_Go to Feedback Page_ring-offset-back_b7d330'))

WebUI.click(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/button_Contact_inline-flex items-center jus_751527'))

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/input_Email_email'), 'huynhngoctai@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/input_Password_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/button_Password_flex w-fit items-center jus_d1da87'))

WebUI.click(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/a_Contact_relative mx-2 flex items-center p_4e5178'))

WebUI.click(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/button_Browse Events_inline-flex items-cent_10c86d'))

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/input_Event Name_title'), 'Group 2 Event')

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/textarea_Description_description'), 
    'E')

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/textarea_Description_description_1'), 
    'En')

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/textarea_Description_description_2'), 
    'Env')

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/textarea_Description_description_1'), 
    'En')

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/textarea_Description_description'), 
    'E')

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/textarea_Description_description_3'), 
    'Ev')

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/textarea_Description_description_4'), 
    'Eve')

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/textarea_Description_description_5'), 
    'Even')

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/textarea_Description_description_6'), 
    'Event')

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/textarea_Description_description_7'), 
    'Event ')

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/textarea_Description_description_8'), 
    'Event b')

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/textarea_Description_description_9'), 
    'Event by')

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/textarea_Description_description_10'), 
    'Event by ')

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/textarea_Description_description_11'), 
    'Event by G')

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/textarea_Description_description_12'), 
    'Event by Gr')

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/textarea_Description_description_13'), 
    'Event by Gro')

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/textarea_Description_description_14'), 
    'Event by Grou')

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/textarea_Description_description_15'), 
    'Event by Group')

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/textarea_Description_description_16'), 
    'Event by Group ')

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/textarea_Description_description_17'), 
    'Event by Group 2')

WebUI.click(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/html'))

WebUI.click(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/button_Cancel_inline-flex items-center just_6dcda0'))

WebUI.click(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/button_Cancel_inline-flex items-center just_6dcda0'))

WebUI.setText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/input_Location Name_location'), 'Group 2')

WebUI.click(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/button_Cancel_inline-flex items-center just_6dcda0'))

WebUI.click(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/button_Back_inline-flex items-center justif_ffb12c'))

WebUI.click(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/span_Create New Event_ml-3 overflow-hidden _4b6366'))

WebUI.verifyElementText(findTestObject('Object Repository/CreateNewEvent/ValidEventCreate/h3_Organizer_line-clamp-2 text-xl font-semi_131a45'), 
    'Group 2 Event')

WebUI.closeBrowser()

