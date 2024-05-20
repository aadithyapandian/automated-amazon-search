package selenium.testing.amazon.search;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SearchProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Details");
		String search = sc.nextLine();

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();

		//type & search
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(search, Keys.ENTER);
		
		//sort price: low to high
		driver.findElement(By.id("a-autoid-0-announce")).click();
		driver.findElement(By.id("s-result-sort-select_1")).click();
		
	}

}
