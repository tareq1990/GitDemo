import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("form-field-travel_comp_date")));
//April 23
		driver.findElement(By.id("form-field-travel_comp_date")).click();

		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May")) 
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}

		List<WebElement> dates = driver.findElements(By.className("day"));
//Grab common attribute//Put into list and iterate
		int count = driver.findElements(By.className("day")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("21")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}

		}
	}

}