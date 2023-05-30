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

WebUI.click(findTestObject('Object Repository/Category/Page_OrangeHRM/span_Admin'))

WebUI.click(findTestObject('Object Repository/Category/Page_OrangeHRM/span_Job'))

WebUI.click(findTestObject('Object Repository/Category/Page_OrangeHRM/a_Job Categories'))

WebUI.click(findTestObject('DeleteMoreThan_ONE_jobCategories/Page_OrangeHRM/button_Blockchain engineer_oxd-icon-button oxd-table-cell-action-space'))

WebUI.click(findTestObject('DeleteJobTitle/Page_OrangeHRM/button_Yes, Delete'))

WebUI.verifyElementPresent(findTestObject('DeleteJobTitle/Page_OrangeHRM/div_SuccessSuccessfully Deleted'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('DeleteMoreThan_ONE_jobCategories/Page_OrangeHRM/button_Blockchain lead_oxd-icon-button oxd-table-cell-action-space'))

WebUI.click(findTestObject('DeleteJobTitle/Page_OrangeHRM/button_Yes, Delete'))

WebUI.verifyElementPresent(findTestObject('DeleteJobTitle/Page_OrangeHRM/div_SuccessSuccessfully Deleted'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('DeleteMoreThan_ONE_jobCategories/Page_OrangeHRM/button_Data Analyst lead_oxd-icon-button oxd-table-cell-action-space'))

WebUI.click(findTestObject('DeleteJobTitle/Page_OrangeHRM/button_Yes, Delete'))

WebUI.verifyElementPresent(findTestObject('DeleteJobTitle/Page_OrangeHRM/div_SuccessSuccessfully Deleted'), 0)

WebUI.delay(3)


