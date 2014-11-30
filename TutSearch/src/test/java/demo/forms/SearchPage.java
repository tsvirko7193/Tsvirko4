package demo.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.PropertiesResourceManager;
import webdriver.elements.Button;
import webdriver.elements.TextBox;

public class SearchPage extends BaseForm {

	public static PropertiesResourceManager props;
	static final String PROPERTIES_FILE = "selenium.properties";
	private static final String Text = "text";

	private static String formlocator = "//body[@class='l-tutby index']";
	private TextBox txb = new TextBox(By.id("main-search-applicant"),
			"txbsearch");
	private Button Button = new Button(
			By.xpath("//input[@class='searchbox-submit']"), "search button"); // Кнопка
																				// "Найти"

	public void SetText() { // Метод ввода строки в поле для ввода
		props = new PropertiesResourceManager(PROPERTIES_FILE);
		String proper = props.getProperty(Text);
		txb.setText(proper);
	}

	public void SubmitButton() { // Нажатие на кнопку найти
		Button.click();
	}

	public SearchPage() {
		super(By.xpath(formlocator), "Search form");
		// TODO Auto-generated constructor stub
	}

}
