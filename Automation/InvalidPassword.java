package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidPassword {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[href='/login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[id='Email']")).sendKeys("xyz9876@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[id='Password']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		Thread.sleep(5000);
		driver.quit();

	}
}
