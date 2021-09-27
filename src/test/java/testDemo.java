import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class testDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("incognito");
		//options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
		ExcelData obj=new ExcelData();
		String search=obj.getData();
		Actions a=new Actions(driver);
		//a.moveToElement(driver.findElement(By.linkText("Gmail"))).click().build().perform();
		//driver.switchTo().frame(0);
		a.moveToElement(driver.findElement(By.cssSelector("input[title='Search']"))).keyDown(Keys.SHIFT).sendKeys(search).build().perform();
		URL u =new URL("https://www.google.com");
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		con.setRequestMethod("HEAD");
		con.connect();
		System.out.println(con.getResponseCode());
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500);");
		

	}

}
