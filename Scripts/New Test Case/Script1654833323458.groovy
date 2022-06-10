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

Mobile.startExistingApplication('kama.co.jp.shop')

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

//Mobile.takeScreenshot('C:\\Users\\tester1\\Pictures\\katasc\\test1.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Navigation/Buy Points'), 0)
Mobile.setText(findTestObject('Object Repository/android.widget.EditText'), 'Yayoi2020#', 0)
Mobile.pressBack()
Mobile.tap(findTestObject('Navigation/Buy Points'), 0)
Mobile.tap(findTestObject('Navigation/Back'), 0)

Mobile.tap(findTestObject('Navigation/Shopping QR'), 0)
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
Mobile.pressBack()

Mobile.tap(findTestObject('Navigation/Shopping Scan'), 0)
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
Mobile.pressBack()
Mobile.tap(findTestObject('Navigation/Shopping Scan'), 0)
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Navigation/Back'), 0)

Mobile.tap(findTestObject('Navigation/Payment Cancel'), 0)
Mobile.pressBack()
Mobile.tap(findTestObject('Navigation/Payment Cancel'), 0)
Mobile.tap(findTestObject('Navigation/Back'), 0)

Mobile.tap(findTestObject('Navigation/Point Cancel'), 0)
Mobile.pressBack()
Mobile.tap(findTestObject('Navigation/Point Cancel'), 0)
Mobile.tap(findTestObject('Navigation/Back'), 0)

Mobile.tap(findTestObject('Navigation/Payment History'), 0)
Mobile.pressBack()
Mobile.tap(findTestObject('Navigation/Payment History'), 0)
Mobile.tap(findTestObject('Navigation/Back'), 0)

Mobile.tap(findTestObject('Navigation/Point History'), 0)
Mobile.pressBack()
Mobile.tap(findTestObject('Navigation/Point History'), 0)
Mobile.tap(findTestObject('Navigation/Back'), 0)

Mobile.closeApplication()

