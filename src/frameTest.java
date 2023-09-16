import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//System.out.println(driver.findElement(By.tagName("iframe")).Size());
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		Actions a=new Actions(driver);
		
		WebElement source =driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		
		System.out.println("print OK");
	}

}
