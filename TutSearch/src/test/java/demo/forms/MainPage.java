package demo.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;

public class MainPage extends BaseForm {

	private static String formlocator = "//body[@class='main-page']";

	private Button button = new Button(By.linkText("Работа")); // Кнопка
																// "Работа"

	public MainPage() {
		super(By.xpath(formlocator), "Tut.by form");
	}

	public void clickButton() { // Нажатие на кнопку "Работа"
		button.click();
	}

}
