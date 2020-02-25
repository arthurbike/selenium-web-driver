package webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScraper {

	public static void main(String[] args) {

		/* Esse teste procura o nome de cursos em uma página e escreve no console. */

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arthu\\git\\selenium-web-driver\\src\\main\\java\\webdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://querobolsa.com.br/cursos-e-faculdades");

		WebElement next = driver
				.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/div/div[5]/div[4]/div[2]/div/button[2]"));

		while (next.isEnabled()) {
			Scraping.scraping(driver);
			next.click();
		}
		Scraping.scraping(driver);
	}

}
