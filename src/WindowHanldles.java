import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHanldles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> Windows=driver.getWindowHandles();
		Iterator<String> it=Windows.iterator();
		String ParentID=it.next();
		String ChildID=it.next();
		driver.switchTo().window(ChildID);
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		//Please email us at mentor@rahulshettyacademy.com with below template to receive response
		
		String mailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(ParentID);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(mailId);
		
		 
}
	}
