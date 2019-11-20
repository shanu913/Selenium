set projectLocation=C:\Users\ISPRO_TEST\git\Selenium\DataDriven
cd %projectLocation%

set classpath=%projectLocation%\bin;%projectLocation%\lib\*

java org.testng.TestNG %projectLocation%\testng.xml
