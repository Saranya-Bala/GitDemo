package Automation.Demo;


import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	WebDriver driver;
    @Test
    public void shouldAnswerWithTrue() throws IOException
    {
    	 System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
    	 driver=new ChromeDriver();
         driver.get("http://www.qaclickacademy.com/");
         driver.manage().window().maximize();
         Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
         String path=System.getProperty("user.dir")+"\\downloads\\screenshot.png";
         ImageIO.write(s.getImage(), "PNG", new File(path));
    }
    @AfterTest
    public void tearDown() {
    	driver.close();
    }
}
