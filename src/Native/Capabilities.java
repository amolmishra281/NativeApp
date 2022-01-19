package Native;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities {

	public static AndroidDriver<AndroidElement> capability() throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"amol");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"io.appium.android.apis.ApiDemos");
		
		 AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	        //I don't want to write this capability again and again for all the classes so I want to keep this common and import this in all the classes
	        return driver;
	}

}
