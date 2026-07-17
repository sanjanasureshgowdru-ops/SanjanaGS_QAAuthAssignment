package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateEmail {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("[href='/register']")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("[id='gender-female']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Sana");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("SS");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("[id='Email']")).sendKeys("xyz9876@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("[id='Password']")).sendKeys("sana123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("sana123");
			Thread.sleep(1000);
			driver.findElement(By.id("register-button")).click();
			Thread.sleep(3000);
			driver.quit();

		}
}
