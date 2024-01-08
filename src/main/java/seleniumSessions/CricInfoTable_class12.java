package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable_class12 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/the-hundred-men-s-competition-2023-1355567/trent-rockets-men-vs-welsh-fire-men-20th-match-1355625/full-scorecard");
		Thread.sleep(4000);

		String wkName = getWicketTakeName("Alex Hales");
		System.out.println(wkName);
		wkName = getWicketTakeName("Joe Root");
		System.out.println(wkName);

		List<String> AlexScoreList = getScoreCardList("Alex Hales");
		System.out.println(AlexScoreList);

	}

	// //span[text()='Alex Hales']/ancestor::td/following-sibling::td//span/span

	public static String getWicketTakeName(String batsmanName) {

		return driver
				.findElement(
						By.xpath("//span[text()='" + batsmanName + "']/ancestor::td/following-sibling::td//span/span"))
				.getText();

	}

	public static List<String> getScoreCardList(String playerName) {

		List<WebElement> scoreList = driver.findElements(By.xpath("//span[text()='" + playerName
				+ "']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));

		List<String> playersScoreList = new ArrayList<String>();
		for (WebElement e : scoreList) {

			String text = e.getText();
			playersScoreList.add(text);
		}

		return playersScoreList;
	}

}