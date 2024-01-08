package seleniumSessions;

public class AmazonTest_class3 {

	public static void main(String[] args) {

		String browserName = "chrome"; // Tomorrow we need to test other browsers -change the browser name

		BrowserUtil_class3 brUtil = new BrowserUtil_class3();

		brUtil.inintDriver(browserName); // Launches browser

		brUtil.launchURL("https://www.amazon.com"); // Launches url

		String acttitle = brUtil.getPageTitle();

		if (acttitle.contains("Amazon")) {

			System.out.println(" Pass ");
		} else

		{
			System.out.println("Fail");
		}

		String actUrl = brUtil.getPageURL();
		if (actUrl.contains("amazon")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}
