package ActionClassesConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropabble = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action = new Actions(driver);
		action
		  .clickAndHold(draggable)
		         .moveToElement(dropabble)
		                 .release()
		                      .build()
		                         .perform();
		

	}

}
