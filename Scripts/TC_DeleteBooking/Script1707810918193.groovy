import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

// Tentukan ID booking dan token secara langsung dalam script
int bookingId = 28 // Ganti dengan ID booking aktual yang ingin dihapus
String token = "dd563a0075fc8d9" // Ganti dengan token autentikasi aktual

// Mengatur header untuk autentikasi
def headers = [('Cookie') : 'token=' + token]

// Mengirim request DELETE untuk menghapus booking
// Ganti '{bookingId}' dengan bookingId dalam URL endpoint saat runtime
def response = WS.sendRequestAndVerify(findTestObject('Object Repository/DeleteBooking', [('id') : bookingId.toString()], headers))

// Verifikasi response status code untuk memastikan booking terhapus
WS.verifyResponseStatusCode(response, 201) // Atau gunakan status code yang sesuai dengan API Anda

