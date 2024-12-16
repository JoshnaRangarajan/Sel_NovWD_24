package week3.day1assignments_02122024;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//Loading the URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				
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
				
				 //Click the Leads link
				driver.findElement(By.linkText("Leads")).click();
				
				//Click the Find Leads link
				driver.findElement(By.linkText("Find Leads")).click();
				
				//Click on the "Phone" tab.
				driver.findElement(By.xpath("(//em[@class='x-tab-left'])[2]")).click();
				
				//- Enter the phone number.
				driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("345");
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123456");
				
				//- Click the "Find leads" button.
				driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
				
				Thread.sleep(5000);
				
				//Capture the lead ID of the first resulting lead.
				String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).getText();
				System.out.println(leadID);
				
				//Click the first resulting lead.
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
				
				
				//Delete Button
				driver.findElement(By.xpath("(//div[@class='frameSectionExtra'])/a[4]")).click();
				
				//Click "Find leads" again.
				driver.findElement(By.linkText("Find Leads")).click();
				
				//Enter the captured lead ID.
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10411");
				
				//Click the "Find leads" button.
				driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
				
				//Close Browser
				driver.close();
	}

}
