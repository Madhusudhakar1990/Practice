//package AndroidTesting.MadhuPixel7Pro;
//
//import java.net.MalformedURLException;
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.time.Duration;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebElement;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//
//import com.google.common.collect.ImmutableMap;
//
//import io.appium.java_client.AppiumBy;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.options.UiAutomator2Options;
//import io.appium.java_client.service.local.AppiumDriverLocalService;
//
//public class TestEngine {
//
//	public AndroidDriver driver;
////	public AppiumDriverLocalService service;
//	public UiAutomator2Options options;
//
//	
//	@BeforeClass
//	public void startEngine() throws MalformedURLException, URISyntaxException 
//	{
////		File fle = new File("C:\\Users\\ymadh\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js");
////		String ip = "127.0.0.1";
////		int prt = 4723;
////
////		 service = new AppiumServiceBuilder().withAppiumJS(fle).withIPAddress(ip).usingPort(prt)
////				.build();
////
////		service.start();
//
//		options = new UiAutomator2Options();
//		options.setDeviceName("Pixel 7 Pro");
//		options.setApp("C:\\Users\\ymadh\\eclipse-workspace\\MadhuPixel7Pro\\src\\test\\java\\apps\\ApiDemos-debug.apk");
//
////		driver = new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(), options);
////		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
//		driver = new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(), options);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		
//		
//		System.out.println("**Engine Started**");
//
//	}
//
////	public void longPressActions(WebElement longpress)
////	{
////		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",ImmutableMap.of("elementId",((RemoteWebElement)longpress).getId(),"Duration",2000));
//		
////	}
//	
//	
////	@AfterClass
//	
////	public void stopEngine() 
////	{
////		driver.quit();
//////		service.close();
////		System.out.println("**Engine Stop**");
////	}
//
//}
