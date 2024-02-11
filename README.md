# 3rd Homework of the Java Test Automation Course (4th block) - Solvd Laba
This repository stores the 3rd and last homework given by our mentor in the 4th block of
the Java Test Automation Course at Solvd Laba. It consists in implementing mobile automated tests
for two demo applications: "Carina Demo" and "Swag Labs". In this homework, we focused only on Android
tests, since for iOS testing it's required to have a computer with macOS.

## Explanation
To fulfill the requirements of the homework I followed the following general steps:

<ol>
<li>Open Android Studio -> Device Manager -> Run a device.</li> 

<li>
 Open config.properties and comment all the properties for other tests and uncomment the section for Android Local
Mobile and fill in the placeholders.

selenium_url= http://localhost:4723/
capabilities.platformName = ANDROID
capabilities.deviceName = we can use any name, such as “device”
capabilities.udid = run adb devices to see this. It can be rare numbers or letters.
capabilities.app = path to the app in our local machine or remote url.
capabilities.platformVersion = version of android.
capabilities.automationName = uiautomator2
capabilities.deviceType= phone</li>


<li>
Run appium in the terminal (without sudo).
</li>

<li>
Open Appium Inspector and configure the 4723 appium port if necessary. Then add the capabilities of the app we want 
to inspect and click “Start Session” (It could be necessary to restart the appium server if the DOM tree is not generated).
Also, we can join into a session if we use a breakpoint and run a debug session in the java code, we just have to go to 
the "Attach to session" tab from Appium Inspector, refresh and press the button to attach to the session.
Some apps need the capability: capability.appActivity to start, so if we have problems we can check the logs of Appium 
and add that capability in the config.properties or in Appium inspector.</li>

<li>
Create the packages structure: gui.project-name  —  common
|_ ios
|_ android</li>

<li>
We need to create abstract classes for pages with the Base postfix and store them in the common package. These abstract
classes must extend from AbstractPage and implement the IMobileUtils interface in order to be able to work with mobile 
actions. This abstract class needs to have abstract methods as well.
Also, for components that are shared between many pages, we can create a class with the name {component}Base in the
common package, so, some PageBase class will use this componentBase class for something, but in the implementations 
of pages for ios or android we have to use their implementation of the componentBase as datatype, and not the base one.
</li>

<li>
For each AbstractPage in the "common" package, we have to create one in the ios and android package, which extends from
the abstract BasePage.
On each page implementation, we must use the @DeviceType(pageType= Type.IOS.PHONE or Type.ANDROID.PHONE,
parentClass=SomePage.class) annotation. In parentClass we have to pass the class of the PageBase we are extending from.
After, we add the elements using @FindBy() and using ExtendedWebElement as datatype, as in web automation.
</li>

<li>
These PageBase classes must have all abstract methods which return another PageBase class. For example, the clickNextBtn()
abstract method has to return a LoginPageBase, but using the initPage(PageBase.class) method instead of the new keyword. 
REMEMBER WHEN WE USE initPage() WE HAVE TO PASS A BASE CLASS AND NOT AN IMPLEMENTATION ONE.
</li>

<li>
After, in src/test/java, remember to create the same hierarchy of packages as in src/main/java and within it, create a 
class named Mobile{Appname}Test which implements IAbstractTest. There we will create the methods with the 
@Test annotation. Remember, to instantiate a page in our @Test method, we cannot use the new keyword, we need to use 
the initPage(Page.class) method. Also, the data types of the variables must return the Base class of each page and not 
the implementation for android/iOS.
</li>
</ol>

## What did I learn?
Performing this home task, I've learnt what software do I have to run in order to be able to create automated
tests for mobile devices. Also, I realized that this approach is pretty similar to the Web automation, but they have
some differences. 

## Technologies

- Java
- Carina Framework
- Appium
- Android Studio Emulator

## Set-Up

To run this project you will need at least the version 11 of Java.
First, clone this repository in a folder of your PC.
You have to put the following command in a terminal:

```bash
  git clone this-repo-url
```
You will need an IDE to open the project folder and also Maven, to download
all the necessary dependencies. Once you are with the project opened, you
can either run the whole tests' classes from the test/java/com.solvd.automation.gui.mobile 
package by pressing the green play button at class level or each method with 
the @Test annotation separately by pressing that button but at method level.
    Please, notice that you will need Appium and an Android Studio device running to be
able to run these tests. Also, check the _config.properties if you want to change between
the Carina Demo and Swag Labs applications, since you will have to comment and uncomment some 
lines.

## Author

- [@Nazareno Bucciarelli](https://github.com/nazabucciarelli)
