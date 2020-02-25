package webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scraping {

	public static void scraping(WebDriver driver) {
		List<WebElement> listaDeCurso = new ArrayList();
		listaDeCurso = driver.findElements(By.className("courses-list__card-content"));
		for (int i = 0; i < listaDeCurso.size(); i++) {
			System.out.println(listaDeCurso.get(i).getText());
		}
	}

}
