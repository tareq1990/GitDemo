import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
//		ChromeOptions co= new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		
		//Thread.sleep(4000);
		
		
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		
		Thread.sleep(4000);
		
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println("Submitted");
		
		//Thread.sleep(4000);
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Tareq");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("tareq.com");
		
		System.out.println("Submitted");
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
	
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("drtareqdvm014@gmail.com");
		//driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("drtareqdvm014@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7452138773");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println("Submitted2");
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		//driver.findElement(By.className(".infoMsg")).getText();
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Tareq");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahaulshettyacademy");
		System.out.println("Submitted3");
		Thread.sleep(3000);
		//System.out.println(driver.findElement(By.xpath("(//p[@class='error'])[1]")).getText());
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".error")).getText();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		System.out.println("after cliking on checkbox");
		System.out.println(driver.findElement(By.xpath("(//p[@class='error'])[1]")).getText());
		driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]")).click();
		}

}
