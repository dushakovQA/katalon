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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://rctest.rc.expoplatform.com/')

WebUI.click(findTestObject('Page_Main/button_Login'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Main/input_close_username'))

WebUI.setText(findTestObject('Object Repository/Page_Main/input_close_username'), 'formcompany1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Main/input_close_password'), 'vOoj4tQjAWVV9mKJ1JcWEw==')

WebUI.click(findTestObject('Object Repository/Page_Main/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Form Company 1/a_editEdit profile'))

WebUI.click(findTestObject('Object Repository/Page_releaseTest/a_Sponsor Pop-Up'))

WebUI.setText(findTestObject('Object Repository/Page_releaseTest/input_Pop Up Timer_sponsor_popuptimeout'), '23')

WebUI.click(findTestObject('Object Repository/Page_releaseTest/div_add_a_photo                    Attach f_f90d86'))

WebUI.click(findTestObject('Object Repository/Page_releaseTest/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_releaseTest/button_Ok'))

