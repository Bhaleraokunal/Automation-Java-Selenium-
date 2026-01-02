package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpScript {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i < 5; i++) {
			
			//Open the browser
			ChromeDriver diver = new ChromeDriver() ;
			
			//Maximize the browser
			diver.manage().window().maximize(); 
			
			//enter into the VolunteerHub Project //  "https://demowebshop.tricentis.com/"
			diver.get("http://localhost:5173/");
			
			Thread.sleep(2000) ; // will make your script wait for some second.
			
			diver.close(); 
		}
	}
}
