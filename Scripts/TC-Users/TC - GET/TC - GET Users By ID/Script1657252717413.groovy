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

response2 = WS.sendRequest(findTestObject('Users/GET/GET Users By ID'))

WS.verifyResponseStatusCode(response2, 200, FailureHandling.STOP_ON_FAILURE)

assert response2.getStatusCode() == 200

WS.verifyElementPropertyValue(response2, 'id', '1')

WS.verifyElementPropertyValue(response2, 'name', 'Leanne Graham')

WS.verifyElementPropertyValue(response2, 'username', 'Bret')

WS.verifyElementPropertyValue(response2, 'email', 'Sincere@april.biz')

WS.verifyElementPropertyValue(response2, 'address.street', 'Kulas Light')

WS.verifyElementPropertyValue(response2, 'address.suite', 'Apt. 556')

WS.verifyElementPropertyValue(response2, 'address.city', 'Gwenborough')

WS.verifyElementPropertyValue(response2, 'address.zipcode', '92998-3874')

WS.verifyElementPropertyValue(response2, 'address.geo.lat', '-37.3159')

WS.verifyElementPropertyValue(response2, 'address.geo.lng', '81.1496')

WS.verifyElementPropertyValue(response2, 'phone', '1-770-736-8031 x56442')

WS.verifyElementPropertyValue(response2, 'website', 'hildegard.org')

WS.verifyElementPropertyValue(response2, 'company.name', 'Romaguera-Crona')

WS.verifyElementPropertyValue(response2, 'company.catchPhrase', 'Multi-layered client-server neural-net')

WS.verifyElementPropertyValue(response2, 'company.bs', 'harness real-time e-markets')