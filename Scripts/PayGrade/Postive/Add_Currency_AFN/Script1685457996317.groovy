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

WebUI.click(findTestObject('Object Repository/PayGrade/Page_OrangeHRM/span_Admin'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_OrangeHRM/span_Job'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_OrangeHRM/a_Pay Grades'))

WebUI.click(findTestObject('PayGrade/Currencies/Currencies_grade41/Page_OrangeHRM/edit_payGrades'))

WebUI.click(findTestObject('PayGrade/Currencies/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('PayGrade/Currencies/Currencies_grade41/Page_OrangeHRM/select_currency'))

WebUI.click(findTestObject('PayGrade/Additional_country_currencies/Page_OrangeHRM/div_AFN - Afghanistan Afghani'))

WebUI.setText(findTestObject('PayGrade/Currencies/Page_OrangeHRM/input_Minimum Salary_oxd-input oxd-input--focus'), '1000')

WebUI.setText(findTestObject('PayGrade/Currencies/Page_OrangeHRM/input_Maximum Salary_oxd-input oxd-input--focus'), '10000')

WebUI.click(findTestObject('PayGrade/Currencies/Page_OrangeHRM/button_Save'))

WebUI.verifyElementPresent(findTestObject('PayGrade/Currencies/Page_OrangeHRM/div_SuccessSuccessfully Saved'), 0)

