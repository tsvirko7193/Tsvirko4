package demo.test;

import webdriver.BaseTest;
import demo.forms.*;

public class DemoTest extends BaseTest {

	
	public void runTest() {

		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		MainPage MainPage = new MainPage();
		MainPage.clickButton();
		logger.step(3);
		SearchPage SearchPage = new SearchPage();
		SearchPage.SetText();
		SearchPage.SubmitButton();
		browser.waitForPageToLoad();
		logger.step(4);
		ResultPage ResultPage = new ResultPage();
		ResultPage.CountElements();
	}
}
