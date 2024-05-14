package open_browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Selenium\\Selenium _software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://www.google.com/");
		//manage.minmum.window();
		Thread.sleep(4000);
		ob.close();
		
		
		

	}

}
