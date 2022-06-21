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

WebUI.setText(findTestObject('Search/Search Bar'), 'Mac Book')

'Select category search. Category search is defined on the variables tab.\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Search/Search Category'), Category_ComputersTabletsNetwork, false)

WebUI.click(findTestObject('Search/Search Button'))

'Verify that the page loads completely'
WebUI.waitForPageLoad(0)

def text = WebUI.getText(findTestObject('Search/First Result'))

//System.out.println(text)
'Verify that the first result name matches with the search string.'
if (text.contains('Mac Book')) {
    println('First result name matches with the search string.')
}

