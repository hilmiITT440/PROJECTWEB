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

WebUI.callTestCase(findTestCase('01_Common/Positive/LoginTestCase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Candidate/Page_OrangeHRM/span_Recruitment'))

WebUI.click(findTestObject('Object Repository/Candidate/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/Candidate/Page_OrangeHRM/input_Full Name_firstName'), 'Monkey')

WebUI.setText(findTestObject('Object Repository/Candidate/Page_OrangeHRM/input_Full Name_middleName'), 'D')

WebUI.setText(findTestObject('Object Repository/Candidate/Page_OrangeHRM/input_Full Name_lastName'), 'Luffy')

WebUI.click(findTestObject('Object Repository/Candidate/Page_OrangeHRM/div_-- Select --'))

WebUI.click(findTestObject('Candidate/Page_OrangeHRM/div_Software Engineer'))

WebUI.setText(findTestObject('Candidate_ver2/Page_OrangeHRM/input_Contact Number_oxd-input oxd-input--focus'), '011102991081')

WebUI.uploadFile(findTestObject('Object Repository/Candidate/Page_OrangeHRM/div_BrowseNo file selected'), 'C:\\Users\\User\\Downloads\\Demo_resume.pdf')

WebUI.setText(findTestObject('Object Repository/Candidate/Page_OrangeHRM/input_Keywords_oxd-input oxd-input--focus'), 'Pirate king candidate')

WebUI.setText(findTestObject('Object Repository/Candidate/Page_OrangeHRM/textarea_Notes_oxd-textarea oxd-textarea--f_0ce0e8'), 
    'Emperor')

WebUI.setText(findTestObject('Candidate/Page_OrangeHRM/input_Email_oxd-input oxd-input--focus'), '')

