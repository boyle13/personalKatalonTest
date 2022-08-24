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

WebUI.openBrowser('https://demoqa.com/login')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('login to logout/Page_ToolsQA/input_UserName_userName'), 'sample')

WebUI.setText(findTestObject('login to logout/Page_ToolsQA/input_Password_password'), 'samplePass12#')

WebUI.click(findTestObject('login to logout/Page_ToolsQA/button_Login'))

WebUI.comment('Assertion on logout button')

WebUI.verifyElementPresent(findTestObject('login to logout/Page_ToolsQA/button_Log out'), 0)

WebUI.scrollToElement(findTestObject('login to logout/Page_ToolsQA/span_Book Store'), 0)

WebUI.click(findTestObject('login to logout/Page_ToolsQA/span_Book Store'))

WebUI.setText(findTestObject('login to logout/Page_ToolsQA/input_Book Store API_searchBox'), 'JavaScript')

WebUI.click(findTestObject('login to logout/Page_ToolsQA/a_Speaking JavaScript'))

WebUI.scrollToElement(findTestObject('login to logout/Page_ToolsQA/button_Add To Your Collection'), 0)

WebUI.click(findTestObject('login to logout/Page_ToolsQA/button_Add To Your Collection'))

WebUI.click(findTestObject('login to logout/Page_ToolsQA/button_Back To Book Store'))

WebUI.click(findTestObject('login to logout/Page_ToolsQA/a_Learning JavaScript Design Patterns'))

WebUI.scrollToElement(findTestObject('login to logout/Page_ToolsQA/span_Profile'), 0)

WebUI.click(findTestObject('login to logout/Page_ToolsQA/button_Add To Your Collection'))

WebUI.click(findTestObject('login to logout/Page_ToolsQA/button_Back To Book Store'))

WebUI.scrollToElement(findTestObject('login to logout/Page_ToolsQA/span_Profile'), 0)

WebUI.click(findTestObject('login to logout/Page_ToolsQA/span_Profile'))

WebUI.comment('Assertion on added book')

WebUI.verifyElementPresent(findTestObject('login to logout/Page_ToolsQA/a_Speaking JavaScript'), 0)

WebUI.scrollToElement(findTestObject('login to logout/Page_ToolsQA/button_Delete All Books'), 0)

WebUI.click(findTestObject('login to logout/Page_ToolsQA/button_Delete All Books'))

WebUI.click(findTestObject('login to logout/Page_ToolsQA/button_OK'))

WebUI.click(findTestObject('login to logout/Page_ToolsQA/button_Log out'))

WebUI.comment('Assertion on login button')

WebUI.verifyElementPresent(findTestObject('login to logout/Page_ToolsQA/button_Login'), 0)

