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

Mobile.startApplication('E:\\Test\\id.co.myhomecredit_10112_apps.evozi.com.apk', true)

Mobile.delay(10)

Mobile.swipe(700, 300, 0, 300)

Mobile.swipe(700, 300, 0, 300)

Mobile.swipe(700, 300, 0, 300)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - DAFTAR (4)'), 0)

Mobile.delay(10)

Mobile.scrollToText('Hubungi Kami')

Mobile.delay(20)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Setuju  Lanjutkan (1)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner - 5'), 0)

Mobile.delay(5)

Mobile.scrollToText('24')

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - 24'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner - Februari (1)'), 0)

Mobile.scrollToText('Januari')

Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - Januari (2)'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner - 2021 (1)'), 0)

Mobile.scrollToText('1998')

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - 1998 (1)'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - No. Handphone'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - (62)'), '82274911944', 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText (4)'), 0)

Mobile.delay(5)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (5)'), '980124', 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText (6)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (7)'), '980124', 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/android.view.View (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Lanjutkan (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Lanjutkan (2)'),0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Daftar'), 0)

Mobile.delay(5)


Mobile.tap(findTestObject('Object Repository/android.widget.Button - Tutup'), 0)

Mobile.closeApplication()

