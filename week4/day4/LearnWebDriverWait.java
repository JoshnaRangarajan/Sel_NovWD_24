package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebDriverWait {

	public static void main(String[] args) {
		  // Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//Loading the URL
		driver.get("https://leafground.com/waits.xhtml");
		
        //Maximize the Browser
		driver.manage().window().maximize();
		
		//Adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Print the original text displayed
		
		String s = driver.findElement(By.xpath("//span[text()='I am going to change!']")).getText();
		System.out.println(s);


		//Instantiate WebDriverWait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//Applying wait
		WebElement thirdClickButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Click'])[3]")));
		thirdClickButton.click();
		//Visibility condition
		WebElement didyounoticeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Did you notice?']")));
		
		 boolean displayed = didyounoticeButton.isDisplayed();
		  System.out.println("Visibility status is: "+displayed);
		  
		//Print the changed text displayed
		  
		  String s1 = driver.findElement(By.xpath("//span[text()='Did you notice?']")).getText();
		  System.out.println(s1);

	}

}
