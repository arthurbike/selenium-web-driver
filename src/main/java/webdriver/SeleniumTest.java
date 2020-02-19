package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		//                                                   (   caminho do driver do goolgle chrome  'chromedriver.exe'    )
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arthu\\git\\selenium-web-driver\\src\\main\\java\\webdriver\\chromedriver.exe");

		try {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://facebook.com");
			
			WebElement login = driver.findElement(By.id("email"));
			login.click();
			login.sendKeys("testando");
			
			WebElement senha = driver.findElement(By.id("pass"));
			senha.click();
			senha.sendKeys("Testando");
			
			WebElement nome = driver.findElement(By.name("firstname"));
			nome.click();
			nome.sendKeys("Arthur");
			
			WebElement sobrenome = driver.findElement(By.name("lastname"));
			sobrenome.click();
			sobrenome.sendKeys("Martins");
			
			WebElement email = driver.findElement(By.name("reg_email__"));
			email.click();
			email.sendKeys("teste.1@gmail.com");

			WebElement confirmaEmail = driver.findElement(By.name("reg_email_confirmation__"));
			confirmaEmail.click();
			confirmaEmail.sendKeys("teste.1@gmail.com");
			
			WebElement senhaEmail = driver.findElement(By.name("reg_passwd__"));
			senhaEmail.click();
			senhaEmail.sendKeys("testando");
			
			WebElement dia = driver.findElement(By.xpath("//*[@id=\"day\"]/option[9]"));
			dia.click();
			
			WebElement mes = driver.findElement(By.xpath("//*[@id=\"month\"]/option[3]"));
			mes.click();
			
			WebElement ano = driver.findElement(By.xpath("//*[@id=\"year\"]/option[22]"));
			ano.click();
			
			WebElement sexo = driver.findElement(By.xpath("//*[@id=\"u_0_7\"]"));
			sexo.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
