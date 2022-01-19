package Native;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static java.time.Duration.ofSeconds;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

public class Demo4 extends Capabilities{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = capability();
		//If I run, is this the home page
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Views\")")).click();
		Thread.sleep(3000);
		driver.findElementByAccessibilityId("Drag and Drop").click();
		Thread.sleep(3000);
		//driver.findElementByAccessibilityId("2. Inline").click();
		//Thread.sleep(3000);
		//driver.findElementByAccessibilityId("9").click();
		
		//What should I do after this - I want to hold it and pull it to 45
		
		//WebElement btn1 = driver.findElementByAccessibilityId("15");
		//WebElement btn2 = driver.findElementByAccessibilityId("45");
		
		//t.longPress(longPressOptions().withElement(element(btn1)).withDuration(ofSeconds(3))).moveTo(element(btn2)).release().perform();
		WebElement dot1 = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		WebElement dot2 = driver.findElementById("io.appium.android.apis:id/drag_dot_2");
		
		TouchAction t = new TouchAction(driver);
		t.longPress(longPressOptions().withElement(element(dot1)).withDuration(ofSeconds(3))).moveTo(element(dot2)).release().perform();
		
		
	}

}
