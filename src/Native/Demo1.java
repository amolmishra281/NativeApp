package Native;

import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import static java.time.Duration.ofSeconds;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

public class Demo1 extends Capabilities{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = capability();
		//If I run, is this the home page
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Views\")")).click();
		//How many elements are clickable
		WebElement size = driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)");
		Dimension number = size.getSize();
		System.out.println(number);
		
		//gesture - you tap on an element, there are some elements where we do long press
		//How to tap on an element 
		//if you want to tap on any element you have to store it in a web element
		WebElement expandlist = driver.findElementByAccessibilityId("Expandable Lists");
		//Now i am tapping on the expand list element
		TouchAction ta = new TouchAction(driver);
		//Using touch actions, you can perform tap and long presson any element
		ta.tap(tapOptions().withElement(element(expandlist))).perform();
		Thread.sleep(3000);
		driver.findElementByAccessibilityId("1. Custom Adapter").click();
		
		//I am storing an element in a variable so that i can do long press on that element
		WebElement LP = driver.findElementByAndroidUIAutomator("text(\"People Names\")");
		ta.longPress(longPressOptions().withElement(element(LP)).withDuration(ofSeconds(2))).release().perform();
		
		WebElement text = driver.findElements(MobileBy.className("android.widget.TextView")).get(1);
	    String tr = text.getText();
		System.out.println(tr);
	}

}
