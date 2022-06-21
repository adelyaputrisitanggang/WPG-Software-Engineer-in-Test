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

WebUI.maximizeWindow()

'Go to www.ebay.com. The URL is stored in profiles > default.'
WebUI.navigateToUrl(GlobalVariable.url)

'Go to Shop by Category > Electronic \r\n'
WebUI.click(findTestObject('Filter/Category Page/Category'))

'Click Cell Phones & Accessories'
WebUI.click(findTestObject('Filter/Category Page/Cell phones and accessories'))

'Click Phone & Smartphone in the left hand side navigation section.'
WebUI.click(findTestObject('Filter/Category Page/Cell Phones  and Smartphones'))

'Click More Refinements'
WebUI.click(findTestObject('Filter/Category Page/Button_More Filter'))

'Go to Screen Size filter\r\n'
WebUI.click(findTestObject('Filter/Filter Tab/Screen Tab'))

'Choose Screen Size type'
WebUI.click(findTestObject('Filter/Filter Detail/Screen Tab/4.0 - 4.4 in'))

'Go to Price filter\r\n'
WebUI.click(findTestObject('Filter/Filter Tab/Price Tab'))

'Fill in the \'from\' text box.'
WebUI.setText(findTestObject('Filter/Filter Detail/Price Tab/Text Box From'), '1000000')

'Fill in the \'to\' text box.'
WebUI.setText(findTestObject('Filter/Filter Detail/Price Tab/Text Box To'), '10000000')

'Go to Item Location filter\r\n'
WebUI.click(findTestObject('Filter/Filter Tab/Item Location Tab'))

'Choose Item Location'
WebUI.click(findTestObject('Filter/Filter Detail/Item Location/US Only'))

'Click the button to apply the filter.'
WebUI.click(findTestObject('Filter/Category Page/Button_Apply Filter'))

'Verify Element'
WebUI.verifyElementPresent(findTestObject('Filter/Category Page/Button_Filters applied'), 0)

WebUI.click(findTestObject('Filter/Category Page/Button_Filters applied'))

'Verify Screen Size Tag\r\n'
WebUI.verifyElementPresent(findTestObject('Filter/Category Page/Screen Size Tab'), 0)

'Verify Price Tag\r\n'
WebUI.verifyElementPresent(findTestObject('Filter/Category Page/Price Tag'), 0)

'Verify Item Location Tag\r\n'
WebUI.verifyElementPresent(findTestObject('Filter/Category Page/Item Location Tab'), 0)

