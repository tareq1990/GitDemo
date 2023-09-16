
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
public class LatestDropdown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver =new ChromeDriver();
       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       
       Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
       //System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
       Thread.sleep(3000);
       driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
       System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());    
      Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
       
     // driver.findElement(By.xpath("//a[@value='BLR']")).click();
      Thread.sleep(2000);

	  // driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
      //driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();//selenium is confused here.thats why give results true instead of false.
      Thread.sleep(1000);
      System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
      driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
       Thread.sleep(3000);
       System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
       //System.out.println(driver.findElements(By.cssSelector("input[type='Checkbox']")).size());
       if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
       {
    	   System.out.println("Its enabled");
    	   Assert.assertTrue(true);
       }
       else
       {
    	  Assert.assertTrue(false) ;
       }
       
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
    
   Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());



}}

