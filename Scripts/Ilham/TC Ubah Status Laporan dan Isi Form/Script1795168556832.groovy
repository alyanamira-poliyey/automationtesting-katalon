import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
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

WebUI.openBrowser(null)

WebUI.navigateToUrl('http://127.0.0.1:8000')

WebUI.click(findTestObject('Alya/Page_SENTRA - Dinas Pemberdayaan Perempuan dan Perlindungan Anak/a_Admin'))

WebUI.setText(findTestObject('Novia/Page_SENTRA - Login/input_email'), 'admin.ppa@sentra.com')

WebUI.setEncryptedText(findTestObject('Novia/Page_SENTRA - Login/input_passwordInput'), 'tOhrzA8BSz/+Q/V5shcywg==')

WebUI.click(findTestObject('Novia/Page_SENTRA - Login/button_Login'))

WebUI.click(findTestObject('Page_Panel Instansi - SENTRA/span_Laporan'))

WebUI.click(findTestObject('Page_Panel Instansi - SENTRA/a_Diproses'))

WebUI.click(findTestObject('Page_Panel Instansi - SENTRA/button_Proses'))

WebUI.selectOptionByValue(findTestObject('Page_Edit Laporan - SENTRA/select_Kategori Laporan'), 'Kekerasan Seksual', false)

WebUI.click(findTestObject('Page_Edit Laporan - SENTRA/button_Simpan Perubahan'))

WebUI.click(findTestObject('Page_Panel Instansi - SENTRA/button_Selesai'))

WebUI.click(findTestObject('Page_Panel Instansi - SENTRA/button_Ya, Selesai'))

