


		
		
		
		package sdet;

		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.annotations.Test;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class Scrollpage
		{
			
		    @Test
			public void scroll() throws InterruptedException
			
			{
		    	 WebDriverManager.chromedriver().setup();
					
			
		          WebDriver driver = new ChromeDriver();
		    
		          driver.manage().window().maximize();
		    
		           driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		    
		           JavascriptExecutor js =(JavascriptExecutor) driver;
		    
		           //scrolling page
		           js.executeScript("window.scrollBy(0,700)");
		    
		           Thread.sleep(1000);
		    
		           //scrolling table
		           //document.querySelector(".tableFixHead").scrollTo=600
		           
		           js.executeScript( "document.querySelector('.tableFixHead').scrollTop=400 ");
		    
			}


		

		
		
		
		
		
		
		
		

	}


