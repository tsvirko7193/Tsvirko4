package demo.forms;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import webdriver.BaseForm;

public class ResultPage extends BaseForm {

	private static String formlocator = "//body[@class='l-tutby']";
	private RemoteWebDriver driver = browser.getDriver();

	List<WebElement> elements = driver     // Поиск элементов с одинаковым классом
			.findElements(By
					.xpath("//a[contains(@class,'b-vacancy-list-link b-marker-link prosper-link')]"));

	public ResultPage() {
		super(By.xpath(formlocator), "Result of search form");
	}

	public void CountElements() { // Метод подсчета соответствующих записей на
									// странице
		int i = 0;
		Pattern p = Pattern.compile("^Специалист по тестированию.*");
		for (WebElement x : elements) {
			Matcher m = p.matcher(x.getText());
			if (m.find())
				i++;
			System.out.println(x.getText() + "\n" + m.matches());
		}
		System.out.println("Количество найденных записей: " + i);
	}
}
