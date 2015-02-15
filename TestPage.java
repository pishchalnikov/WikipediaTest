import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TestPage {

	private WebDriver driver;
	
	public TestPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getFirstHeading() {
		return driver.findElement(By.id("firstHeading")).getText();
	}
}
