import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MainPage {
	
	private WebDriver driver;
	
	public MainPage(FirefoxDriver driver) {
		this.driver = driver;
	}

	public TestPage search(String text) {
		driver.findElement(By.id("searchInput")).sendKeys(text);
		driver.findElement(By.className("formBtn")).click();
		return new TestPage(driver);
	}
}
