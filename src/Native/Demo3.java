package Native;

import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demo3 extends Capabilities{

	public static void main(String[] args) throws MalformedURLException {
		
		//AndroidDriver<AndroidElement> driver = capability();
		//To open notifications
		//driver.openNotifications();
	 //driver.findElement(MobileBy.AccessibilityId("Auto-rotate screen")).click();
	 //driver.findElement(MobileBy.AccessibilityId("Battery Saver")).click();
		AndroidDriver<AndroidElement> driver = capability();
		//If I run, is this the home page
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Views\")")).click();
		
		//I want to scroll till the element and then click on the element WebView
		
		//people try using javascript but that is for web app and not for native and hybrid app
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click();
		
	 

	}

}
