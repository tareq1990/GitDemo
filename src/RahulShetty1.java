import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RahulShetty1 {
	

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
      
        String title = driver.getTitle();
        System.out.println("Title :"+title);

 String text = driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/legend")).getText();
      System.out.println("text :"+text); 
      
      
        int check= driver.findElements(By.cssSelector("input[type='checkbox']")).size();
      	System.out.println("Total Checkbox :"+check);
        driver.findElement(By.xpath("//input[@name='radioButton' and @value='radio2']")).click();
       
       
			Thread.sleep(4000);
		
        
        driver.findElement(By.id("autocomplete")).sendKeys("TEP SOLUTION");
        
        Thread.sleep(4000);

     Select s=new Select(driver.findElement(By.name("dropdown-class-example")));
       // s.selectByValue("option3");
     Thread.sleep(4000);
        s.selectByIndex(2);
        Thread.sleep(4000);
     System.out.println("Select :Select");        
        
        //s.selectByVisibleText("option1");
        
        driver.findElement(By.name("checkBoxOption1")).click();
        driver.findElement(By.id("checkBoxOption3")).click();
        
        driver.findElement(By.linkText("Open Tab")).click();
        
        driver.close();

        
       // driver.navigate().back();


	}


}
