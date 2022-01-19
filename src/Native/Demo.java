package Native;

import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Demo extends Capabilities {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capability();
		driver.findElement(MobileBy.AccessibilityId("Preference")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("3. Preference dependencies")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("android:id/checkbox")).click();
		Thread.sleep(3000);
		//driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"WiFi settings\")")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("amol");
		driver.hideKeyboard();
		Thread.sleep(3000);
		driver.findElements(MobileBy.className("android.widget.Button")).get(0).click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}

}
