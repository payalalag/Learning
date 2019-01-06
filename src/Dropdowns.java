import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://book.spicejet.com");
//		WebElement ele = chromeDriver.findElement(By.xpath("//select[contains(@id,'InputSearchVieworiginStation')]"));
//		Select sl = new Select(ele);
//		sl.selectByVisibleText("India");
//		
//		WebElement ele1 = chromeDriver.findElement(By.xpath("//select[contains(@id,'InputSearchViewdestinationStation')]"));
//		Select sl1 = new Select(ele1);
//		sl1.selectByVisibleText("Hubli");
		
		WebElement el2 = chromeDriver.findElement(By.xpath("//select[contains(@id,'DropDownListCurrency')]"));
		Select sl2 = new Select(el2);
		sl2.selectByIndex(3);
	
		chromeDriver.quit();
	

	}

}
