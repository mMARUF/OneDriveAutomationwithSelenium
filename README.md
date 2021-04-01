# OneDriveAutomationwithSelenium


This is a project on Automating OneDrive Automation with Selenium and JAVA!

1) We will be using Eclipse as IDE
2) We will using Java SE 1.8
3) We will import Selenium which can be downloaded from https://www.selenium.dev/downloads/
4) To upload a file into OneDrive we will need to use AutoIT. AutoIT is used to access Windows explorer as Selenium does not have access in Windows Explorer. Once the File Explorer is opened by Selenium, AUtoIT will input the filepath and will press the OPEN button on the Windows Explorer to complete the file upload proess 



Here you will find .au3 file(zerofileupload.au3). This file contains script that will input the file path into Windows Explorer File Upload popup and complete the file upload proces. And, by compiling the .au3 file, we got the .exe fie(zerofileupload.exe) which will execute the script inside the .au3 file. We will execute this .au3 file in Selenium to complete the file upload process. 
 
