package webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scraping {

	public static void scraping(WebDriver driver) {
		List<WebElement> listaDeCursos = new ArrayList();
		listaDeCursos = driver.findElements(By.className("courses-list__card-content"));
		for (WebElement curso : listaDeCursos) {
			System.out.println(curso.getText());
		}
	}

}
