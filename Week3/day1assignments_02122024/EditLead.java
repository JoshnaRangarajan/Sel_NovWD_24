package week3.day1assignments_02122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//Loading the URL
				driver.get("http://leaftaps.com/opentaps/");
				
		      //Maximize the Browser
				driver.manage().window().maximize();
				
				//Enter the username
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				
				//Enter the password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//Click the login button
				driver.findElement(By.className("decorativeSubmit")).click();
			
			    //Click the CRMSFA link
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//Click on Create Lead.
				driver.findElement(By.linkText("Create Lead")).click();
				
				//Enter the CompanyName Field Using Xpath.
				driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
				
				//Enter the FirstName Field Using Xpath.
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Joshna");
				
				//Enter the LastName Field Using Xpath.
				driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Rangarajan");
				
				//Enter the FirstName (Local) Field Using Xpath.
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Josh");
				
				//Enter the Department Field Using any Locator of Your Choice.
				driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("IT");
				
				//Enter the Description Field Using any Locator of your choice.
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Description");
				
				//Enter your email in the E-mail address Field using the locator of your choice.
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("joshna123@gmail.com");
				
				//Select State/Province as NewYork Using Visible Text.
				WebElement StateProvinceDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select StateProvince =new Select(StateProvinceDropdown);
				StateProvince.selectByVisibleText("New York");
				
				//Click on the Create Button.
				driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
				
				//Click on the edit button.
				driver.findElement(By.linkText("Edit")).click();
				
				//Clear the Description Field.
				driver.findElement(By.id("updateLeadForm_description")).clear();
				
				//Fill the Important Note Field with Any text.
				driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Example Note");
				
				//Click on the update button.
				driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
				
				//Get the Title of the Resulting Page.
				String Title = driver.getTitle();
				System.out.println(Title);
				//Close the browser window.
				driver.close();
				

	}

}
