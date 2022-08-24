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

Mobile.startApplication('mobileapp/Shop Samsung_v1.0.29030_apkpure.com.apk', false)

Mobile.tap(findTestObject('BuyGalaxy/android.widget.TextSearch'), 0)

Mobile.sendKeys(findTestObject('BuyGalaxy/android.widget.EditText - Search'), 'Galaxy Watch4'+'\\n')

Mobile.scrollToText('Galaxy Watch4, 40mm, Silver, Bluetooth', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('BuyGalaxy/android.widget.TextView - Galaxy Watch4, 40mm, Silver, Bluetooth'), 0)

Mobile.tap(findTestObject('BuyGalaxy/android.widget.TextView - BUY NOW'), 0)

