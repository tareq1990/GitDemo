import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class LatestDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver =new ChromeDriver();
       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
       Thread.sleep(3000);
       driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
       System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());    
       Thread.sleep(3000);
       System.out.println(driver.findElements(By.cssSelector("input[type='Checkbox']")).size());
       driver.findElement(By.id("divpaxinfo")).click();

       Thread.sleep(2000L);

       /*int i=1;

    while(i<5)

    {

    driver.findElement(By.id("hrefIncAdt")).click();

    i++;

    }*/

       System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

    for(int i=1;i<5;i++)

    {

    driver.findElement(By.id("hrefIncAdt")).click();

    }

    driver.findElement(By.id("btnclosepaxoption")).click();

    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());



}}
