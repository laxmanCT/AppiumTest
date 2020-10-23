package test;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.touch.LongPressOptions;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;


public class DragDropDemo extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS  );
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		
		TouchAction t = new TouchAction(driver);
		

		
		WebElement source = driver.findElementsByClassName("android.view.View").get(0);		
		WebElement target = driver.findElementsByClassName("android.view.View").get(1);	
		
		t.longPress(LongPressOptions.longPressOptions().withElement(element(source))).moveTo(element(target)).release().perform();
		
		

	}

}
