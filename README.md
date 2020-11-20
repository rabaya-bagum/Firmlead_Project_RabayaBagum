# Firmlead_Project_RabayaBagum

## Manual and Automation Testcases for the login page

Please view the "FirmLead_TestCases_RabayaBagum_19Nov_2020.xlsx" file inside the folder of TestCases.


**Automation Script**

**Please follow the steps to run as a test Suite:**

Step 1: In your command prompt, please 
git clone https://github.com/rabaya-bagum/Firmlead_Project_RabayaBagum.git

(Please note that Git need to be installed in your machine)

Step 2: Go to Eclipse and from File Menu>> open Projects from fileSystem
  
Step 3: Click on the FirmLead_TechnicalInterview.xml file and then run as>> "TestNG Suite"

Note: If the console comes up with an error for http issue, please Go to Run >> Run Configurations
A dialog will appear. In the VM arguments section, please add the following line "-Dtestng.dtd.http=true" (please exclude quotation marks)
and then Run

TestReport:
Step1: After running testNg test suite, Go to file>> click on refresh

Step2: Click on test-output folder

Step3: Click on " index.html>>  Right click >>open with>> web browser

Step 4: You will able to see test report


**Please follow the  same steps 1 & 2 above to run as an individual test:**

Step 3: Click on src/test/java

Step 4: Click on firmLead_TechnicalInterview

Step 5:  To run individual test >>Click on LoginPage_Create_an_Account.java >> run as>> testNG test

Note: If the console comes up with an error for http issue, please Go to Run >> Run Configurations
A dialog will appear. In the VM arguments section, please add the following line "-Dtestng.dtd.http=true" (please exclude quotation marks)
and then Run



**Precondition**:
Automation Framework and tools: Selenium (Web Driver), Maven TestNG

Programming language and IDE’s: Java, Maven, Eclipse 

Please note that Chrome Browser should be in the system (Tested against Version 86.0.4240.198 and Version 87.0.4280.66)

Some Screenshots that might be helpful to run the project

![alt text](https://github.com/rabaya-bagum/Firmlead_Project_RabayaBagum/blob/master/OpenedProjectUnderEclipse.PNG)
![alt text](https://github.com/rabaya-bagum/Firmlead_Project_RabayaBagum/blob/master/AddUnderVMarguments.PNG)

