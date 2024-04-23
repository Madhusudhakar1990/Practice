//package dumpingYard;
//
//import org.testng.annotations.Test;
//
//import java.io.FileReader;
//import java.io.IOException;
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Properties;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.opencsv.CSVReader;
//import com.opencsv.exceptions.CsvException;
//import com.opencsv.exceptions.CsvValidationException;
//
//	public class MainTest 
//{
//
//	public WebDriver driver; // public static WebDriver driver this should be in Base class  
//	public ExtentReports reprt;
//	public Properties prop;
//	public FileReader reader;
//	public CSVReader read;
//
//
//	@BeforeTest
//	public void be4Test() throws IOException, CsvException 
//	{
//
//		prop = new Properties();
//		String filePath = "C:\\Users\\ymadh\\git\\OpenWeatherZenoProject\\ZenoAssigment\\src\\main\\java\\TestFile\\data.properties";
//		FileReader readerProp = new FileReader(filePath);
//		prop.load(readerProp);
//		
//		String path = prop.getProperty("ReportPath");
//
//		ExtentSparkReporter report = new ExtentSparkReporter(path);
//		report.config().setDocumentTitle("ExtentReport");
//		report.config().setReportName("TestIng NG report");
//
//		reprt = new ExtentReports();
//		reprt.attachReporter(report);
//		reprt.setSystemInfo("Tester", "Madhu");
//
//	}
//
//	@BeforeMethod
//	public void engineStart() throws InterruptedException
//
//	{
//
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//
//		driver.get(prop.getProperty("URL"));
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[@id='desktop-menu']/ul/li[6]")).click();
//
//	}
//
//	@Test //  (dataProvider="getData")
//	public void weatherDetails(String city) throws InterruptedException 
//	{
//		HomePage hp = new HomePage(driver);
//
//		hp.weatherdetail(city);
//		
//	}
//
//	@Test	//(dataProvider = "getData") 
//	public void cityWeather(String city) throws InterruptedException 
//	{
//		HomePage hp = new HomePage(driver);
//
//		hp.weatherInYourCity(city);
//
//
//	}
//
//	@Test(enabled = false)
//	public void incorrectCityNameWeather() throws InterruptedException 
//	{
//		HomePage hp = new HomePage(driver);
//		hp.weatherInYourCity(prop.getProperty("invalidCity"));
//	}
//	
//	
//	
//	@Test (enabled = false)
//	public void mapLayer() throws InterruptedException {
//		Thread.sleep(5);
//
//		driver.findElement(By.xpath("//li[@id='desktop-menu']/ul/li[6]")).click(); // last min change
//
//		MapPage mp = new MapPage(driver);
//
//		mp.temp();
//
//		mp.press();
//
//		mp.cloud();
//
//		mp.gPresp();
//
//		mp.windspe();
//	}
//
//		@DataProvider
//		public Object[] getData() throws CsvValidationException, IOException 
//	{
//		String path1 = "C:\\Users\\ymadh\\git\\OpenWeatherZenoProject\\ZenoAssigment\\src\\main\\java\\TestFile\\csvtest.csv";
//		
//		List<String> data = new ArrayList<String>();
//	
//		try (
//				FileReader reader = new FileReader(path1); 
//				CSVReader read = new CSVReader(reader)
//			) 
//		{
//			String[] LocationData;
//		while ((LocationData = read.readNext()) != null) 
//			{
//			data.add(LocationData[0]);
//			}
//		}
//
//		Object[] testData = new Object[data.size()];
//
//		System.out.println("size :" + data.size());
//
//		for (int i = 0; i <= data.size()-1 ; i++) 
//		{
//			testData[i] = data.get(i);
//		}
//		System.out.println(data);
//		return testData;
//	}
//
//	@AfterMethod
//	public void engineStop() 
//	{
//		driver.close();
//	}
//
//}
