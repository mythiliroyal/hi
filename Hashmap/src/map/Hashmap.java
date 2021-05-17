package map;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hashmap {

	public static void main(String[] args) throws Exception 
	{
		HashMap<String, String> map =new HashMap<String, String>();
		map.put("rameshadepu","ramesh");
		map.put("sandeepj","sandeep");
		map.put("saireddy","saireddy");
		for(String un:map.keySet())
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("un");
			driver.findElement(By.name("password")).sendKeys(map.get(un));
			driver.findElement(By.name("login")).click();
			
		}

	}

}
