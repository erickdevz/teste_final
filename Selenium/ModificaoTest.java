// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ModificaoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void modificao() {
    driver.get("https://cadastrocars.vercel.app/");
    driver.manage().window().setSize(new Dimension(1440, 780));
    driver.findElement(By.cssSelector(".carItem:nth-child(1) .pointButton")).click();
    driver.findElement(By.cssSelector(".pointWindowBtn:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".brandField")).click();
    {
      WebElement dropdown = driver.findElement(By.cssSelector(".brandField"));
      dropdown.findElement(By.xpath("//option[. = 'Mercedes-Benz']")).click();
    }
    driver.findElement(By.cssSelector(".app")).click();
    driver.findElement(By.cssSelector(".modelField")).sendKeys("Bmw");
    driver.findElement(By.cssSelector(".yearField")).click();
    driver.findElement(By.cssSelector(".yearField")).sendKeys("2024");
    driver.findElement(By.cssSelector(".kmField")).click();
    driver.findElement(By.cssSelector(".kmField")).sendKeys("2000");
    driver.findElement(By.cssSelector(".priceField")).click();
    driver.findElement(By.cssSelector(".priceField")).sendKeys("180000");
    driver.findElement(By.cssSelector(".full")).click();
    driver.findElement(By.cssSelector(".carItem:nth-child(5) > .price")).click();
    driver.close();
  }
}
