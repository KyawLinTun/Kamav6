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

Noti=findTestObject('Account/Notifications')
ptTran=findTestObject('Account/Point Transfer')
ptTranHis=findTestObject('Account/Point Transfer History')
ptPurHis=findTestObject('Account/Point Purchase History')
ChanPass=findTestObject('Account/Change Password')
AccMan =findTestObject('Account/Account Management')
Bankinfo = findTestObject('Account/Bank Information')
shLim=findTestObject('Account/Shopping Limit')
PntReward=findTestObject('Account/Point Reward')
Tms=findTestObject('Account/Terms of Service')

def list=[Noti,ptTran,ptTranHis,ptPurHis,ChanPass,AccMan,Bankinfo,shLim,PntReward,Tms]

Mobile.startExistingApplication('kama.co.jp.shop')

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)


for (def item:list) {
	Mobile.tap(findTestObject('Account/Account'), 0)
	Mobile.tap(item,0)
	Mobile.pressBack()
	Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}