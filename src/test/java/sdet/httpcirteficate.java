

		
		
		
		
		
		
		
		
		
		package sdet;

		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		import org.testng.annotations.Test;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class httpcirteficate
		{

			
				
					@Test
					public void handlehttpcertification()
					{
						ChromeOptions options = new ChromeOptions();
						
						options.setAcceptInsecureCerts(true);
						
				       WebDriverManager.chromedriver().setup();
					
				        WebDriver driver = new ChromeDriver(options);
				    
				        driver.manage().window().maximize();
				    
				        driver.get("https://expired.badssl.com");
					}
				    

			



			



		
		
		

	}


