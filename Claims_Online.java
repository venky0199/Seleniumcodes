package java_pratice;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.Assert;



public class java_pratice {

	
		
		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException{
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vgollamu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://staging-claims.covermore.co.uk/Booking/");
			//Thread.sleep(3000);
			Select dropdown=new Select(driver.findElement(By.xpath("//select[@id='language']")));
			dropdown.selectByIndex(0);
			//Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Venkatesh");
			//Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("IE");
			//Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='PolicyNumber']")).sendKeys("16ST2300000255");
			JavascriptExecutor js=(JavascriptExecutor)driver; 
			js.executeScript("window.scrollBy(0,400)");
			//Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id=\"btnLoginSubmit\"]")).click();
			Thread.sleep(5000); 
			
			
			
			// To open a new claim
			
			//driver.findElement(By.xpath("//input[@id=\"btnYes\"]")).click();
			
			
			
			
	           //make a new claim page
			Select dropdown1=new Select(driver.findElement(By.xpath("//select[@id=\"SelectedClaimCauseId\"]")));
			dropdown1.selectByValue("171");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id=\"opener\"]")).click();
	      Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id=\"closePopup\"]")).click();    
			
			
			
			
			
			//incident page
			driver.findElement(By.xpath("//input[@id=\"datetimeDirectiveDay\"]")).sendKeys("31");
			driver.findElement(By.xpath("//input[@id=\"datetimeDirectiveMonth\"]")).sendKeys("01");
			driver.findElement(By.xpath("//input[@id=\"datetimeDirectiveYear\"]")).sendKeys("2023");
			Select dropdown2=new Select(driver.findElement(By.xpath("//select[@name=\"country\"]")));
			dropdown2.selectByIndex(7);
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,400)");
			driver.findElement(By.xpath("//textarea[@id='Description']")).sendKeys("Test Automation");
			driver.findElement(By.xpath("//input[@name=\"Save\"]")).click(); 
			Thread.sleep(1000); 
			
			
			
			
			//supporting information
			Select dropdown3=new Select(driver.findElement(By.xpath("//select[@name=\"expensesType\"]")));
			dropdown3.selectByIndex(4);
			WebElement day=driver.findElement(By.xpath("//input[@id=\"dateDirectiveDay\"]"));
			day.sendKeys("31");
			WebElement month=driver.findElement(By.xpath("//input[@id=\"dateDirectiveMonth\"]"));
			month.sendKeys("01");
			WebElement year=driver.findElement(By.xpath("//input[@id=\"dateDirectiveYear\"]"));
			year.sendKeys("2023");
			driver.findElement(By.xpath("//input[@id=\"description\"]")).sendKeys("Test Automation");
			driver.findElement(By.xpath("//input[@id=\"dateExpenseCost\"]")).sendKeys("1000");
			Select dropdown5=new Select(driver.findElement(By.xpath("//select[@id=\"currency\"]")));
			dropdown5.selectByIndex(10);
		  Thread.sleep(2000);
		  js.executeScript("window.scrollBy(0,400)");
		  Select dropdown6=new Select(driver.findElement(By.xpath("//select[@id=\"ddlDocmentTypes\"]")));
		  dropdown6.selectByIndex(5);
		  WebElement uploadfile=driver.findElement(By.xpath("//input[@id=\"fileupload-file\"]"));
		  uploadfile.sendKeys("C:\\Users\\vgollamu\\Downloads\\Prod-IT.docx");
			  Thread.sleep(5000);
			  driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();    
			  Thread.sleep(3000); 
			     
			
			  
			  
			  
			//financial details  
			 
			  driver.findElement(By.cssSelector("#branchCode")).sendKeys("123456");
			  driver.findElement(By.xpath("//body/div[1]/div[1]/article[1]/div[1]/form[1]/div[1]/div[2]/ol[1]/li[3]/input[1]")).sendKeys("987654321");
			  Thread.sleep(1000);
			  driver.findElement(By.xpath("//input[@name=\"test4\"]")).click();
			  
			  
			  
			  
			  //additional details
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//input[@value=\"NEXT\"]")).click();  
			
			
			  
			  
			//Review and finalise page
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name=\"dateDirectiveDay\"]")).sendKeys("02");
			driver.findElement(By.xpath("//input[@id=\"dateDirectiveMonth\"]")).sendKeys("06");
			driver.findElement(By.xpath("//input[@id=\"dateDirectiveYear\"]")).sendKeys("2001");
			js.executeScript("window.scrollBy(0,300)");
			Select dropdown7=new Select(driver.findElement(By.xpath("//select[@name=\"country\"]")));
			dropdown7.selectByValue("FRANCE");
			driver.findElement(By.xpath("//input[@id=\"Postcode\"]")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id=\"Postcode\"]")).sendKeys("75001");
			driver.findElement(By.xpath("//input[@id=\"Phone\"]")).sendKeys("789654321");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,1100)");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[contains(text(),'I am the person making the claim')]")).click();
			
			
			//click to submit the claim
			driver.findElement(By.xpath("//input[@value=\"SUBMIT CLAIM\"]")).click();
			
			
			
			//driver.quit();
			//driver.close();
			
			
			
		
			
			
			
			  
			  
			  
			  
			  
			  
			  
			
			
			
			
			
			
			
			
			
		


	}

}
