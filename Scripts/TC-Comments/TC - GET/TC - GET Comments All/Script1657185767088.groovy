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

response2 = WS.sendRequest(findTestObject('Comments/GET/GET Comments All'))

WS.verifyResponseStatusCode(response2, 200, FailureHandling.STOP_ON_FAILURE)

assert response2.getStatusCode() == 200

WS.verifyElementPropertyValue(response2, '[0].postId', '1')

WS.verifyElementPropertyValue(response2, '[0].id', '1')

WS.verifyElementPropertyValue(response2, '[0].name', 'id labore ex et quam laborum')

WS.verifyElementPropertyValue(response2, '[0].email', 'Eliseo@gardner.biz')

WS.verifyElementPropertyValue(response2, '[0].body', 'laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium')

WS.verifyElementPropertyValue(response2, '[1].postId', '1')

WS.verifyElementPropertyValue(response2, '[1].id', '2')

WS.verifyElementPropertyValue(response2, '[1].name', 'quo vero reiciendis velit similique earum')

WS.verifyElementPropertyValue(response2, '[1].email', 'Jayne_Kuhic@sydney.com')

WS.verifyElementPropertyValue(response2, '[1].body', 'est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et')

WS.verifyElementPropertyValue(response2, '[2].postId', '1')

WS.verifyElementPropertyValue(response2, '[2].id', '3')

WS.verifyElementPropertyValue(response2, '[2].name', 'odio adipisci rerum aut animi')

WS.verifyElementPropertyValue(response2, '[2].email', 'Nikita@garfield.biz')

WS.verifyElementPropertyValue(response2, '[2].body', 'quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione')

WS.verifyElementPropertyValue(response2, '[3].postId', '1')

WS.verifyElementPropertyValue(response2, '[3].id', '4')

WS.verifyElementPropertyValue(response2, '[3].name', 'alias odio sit')

WS.verifyElementPropertyValue(response2, '[3].email', 'Lew@alysha.tv')

WS.verifyElementPropertyValue(response2, '[3].body', 'non et atque\noccaecati deserunt quas accusantium unde odit nobis qui voluptatem\nquia voluptas consequuntur itaque dolor\net qui rerum deleniti ut occaecati')

WS.verifyElementPropertyValue(response2, '[4].postId', '1')

WS.verifyElementPropertyValue(response2, '[4].id', '5')

WS.verifyElementPropertyValue(response2, '[4].name', 'vero eaque aliquid doloribus et culpa')

WS.verifyElementPropertyValue(response2, '[4].email', 'Hayden@althea.biz')

WS.verifyElementPropertyValue(response2, '[4].body', 'harum non quasi et ratione\ntempore iure ex voluptates in ratione\nharum architecto fugit inventore cupiditate\nvoluptates magni quo et')

WS.verifyElementPropertyValue(response2, '[5].postId', '2')

WS.verifyElementPropertyValue(response2, '[5].id', '6')

WS.verifyElementPropertyValue(response2, '[5].name', 'et fugit eligendi deleniti quidem qui sint nihil autem')

WS.verifyElementPropertyValue(response2, '[5].email', 'Presley.Mueller@myrl.com')

WS.verifyElementPropertyValue(response2, '[5].body', 'doloribus at sed quis culpa deserunt consectetur qui praesentium\naccusamus fugiat dicta\nvoluptatem rerum ut voluptate autem\nvoluptatem repellendus aspernatur dolorem in')

WS.verifyElementPropertyValue(response2, '[6].postId', '2')

WS.verifyElementPropertyValue(response2, '[6].id', '7')

WS.verifyElementPropertyValue(response2, '[6].name', 'repellat consequatur praesentium vel minus molestias voluptatum')

WS.verifyElementPropertyValue(response2, '[6].email', 'Dallas@ole.me')

WS.verifyElementPropertyValue(response2, '[6].body', 'maiores sed dolores similique labore et inventore et\nquasi temporibus esse sunt id et\neos voluptatem aliquam\naliquid ratione corporis molestiae mollitia quia et magnam dolor')

WS.verifyElementPropertyValue(response2, '[7].postId', '2')

WS.verifyElementPropertyValue(response2, '[7].id', '8')

WS.verifyElementPropertyValue(response2, '[7].name', 'et omnis dolorem')

WS.verifyElementPropertyValue(response2, '[7].email', 'Mallory_Kunze@marie.org')

WS.verifyElementPropertyValue(response2, '[7].body', 'ut voluptatem corrupti velit\nad voluptatem maiores\net nisi velit vero accusamus maiores\nvoluptates quia aliquid ullam eaque')

WS.verifyElementPropertyValue(response2, '[8].postId', '2')

WS.verifyElementPropertyValue(response2, '[8].id', '9')

WS.verifyElementPropertyValue(response2, '[8].name', 'provident id voluptas')

WS.verifyElementPropertyValue(response2, '[8].email', 'Meghan_Littel@rene.us')

WS.verifyElementPropertyValue(response2, '[8].body', 'sapiente assumenda molestiae atque\nadipisci laborum distinctio aperiam et ab ut omnis\net occaecati aspernatur odit sit rem expedita\nquas enim ipsam minus')

WS.verifyElementPropertyValue(response2, '[9].postId', '2')

WS.verifyElementPropertyValue(response2, '[9].id', '10')

WS.verifyElementPropertyValue(response2, '[9].name', 'eaque et deleniti atque tenetur ut quo ut')

WS.verifyElementPropertyValue(response2, '[9].email', 'Carmen_Keeling@caroline.name')

WS.verifyElementPropertyValue(response2, '[9].body', 'voluptate iusto quis nobis reprehenderit ipsum amet nulla\nquia quas dolores velit et non\naut quia necessitatibus\nnostrum quaerat nulla et accusamus nisi facilis')

