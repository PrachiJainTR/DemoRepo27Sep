import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		/*int j=1;
		while(j<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			j++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		*/
		for(int i=1; i<5 ; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();			//4 times = 5 Adults
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
	}

}
