package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathConcept_class10 {

	// Note -We need to practice the below xpath formulas , to create it according
	// to our requirements
	// Open any random application and start practicing xpath
	
	// this will be help full in cypress , playright, web driver Io .

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// xpath -is the address of the element in th html DOM

		// 1. absolute xpath - from head to top in the html page eg-
		// /html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/a

		// But absolute xpath is risky as there might be multiple html tags
		// it will break and the automation will not work

		// Hence we need xpath

		// 2. partial xpath- Custom xpath
		// Formula for xpath - //tag[@attr='value']
		// paste the above in the html page and make changes

		// Eg- //tag[@attr='value']
		// 1. //input[@id='input-email']
		// 2. //input[@placeholder='E-Mail Address']

		// * Second option of two attributes together

		// 1. //tag[@attr1='value'and @attr2='value']
		// input[@type='text'and @placeholder='E-Mail Address']

		// Note - We can add n number of attributes , just add the 'and' with the
		// attributes

		// We can use 'and' ' or' combination to get the xpath
		// input[@type='text' or @placeholder='E-Mail Address']

		// and means both should be true
		// or means any one should be true

		// We can use the below tags as well for the entire page
		// tag
		// input
		// a
		// img

		// * xpath with text()- where the attributes are not available
		// text is not an attribute, its the text content of the element
		// dont use @text... we use text() as a function

		// Formula - //tag[text()='value']
		// h2[text()='Returning Customer']
		// h2[text()='New Customer']

		By newCus = By.xpath("//h2[text()='New Customer']");

		// check my account links is present on the page ---two times

		By myAcc = By.xpath("//a[text()='My Account']");

		int myAccCount = driver.findElements(myAcc).size();

		if (myAccCount == 2) {

			System.out.println("Pass");
		}

		// we can use text() function with attribute as well
		// Formula - //tag[@attr1='value'and text()='value']
		// a[@class='list-group-item'and text()='Register']

		// Note -We can write in any sequence
		// a[text()='Register' and @class='list-group-item']

		// Note -We can write text() function with multiple attribute as well

		// //tag[@attr1='value'and @attr2='value' and text()='value']
		// // a[text()='Register' and @class='list-group-item' and @href]

		// Function -We can write contains() with attribute as well -some word in the
		// attribute value
		// //tag[contains(@attr,'value')]
		// //input[contains(@placeholder,'E-Mail')]
		// //input[contains(@id,'email')]

		// We can use the below combination as well:
		// contains() with one attribute and use another attribute without contains
		// //tag[contains(@attr1,'value' and @attr2='value']
		// //input[contains(@placeholder,'E-Mail')and @name='email']
		// //input[contains(@placeholder,'E-Mail')and @name='email' and @type='text']

		// Interview question below -

		// Dynamic id/attribute : Which keeps on changing

		// <input id= firstname_123>
		// <input id= firstname_456>
		// <input id= firstname_989>

		// Give the below solution for Dynamic id/attribute

		// Hence for the above -we can use contains when the values of id are changing
		// //By.id("firstname_123") -- this will fail
		// //input[contains(@id,'firstname_')]-- this will pass

		// contains() with text():

		// 1. //tag[contains(text(),'value')]

		// //p[contains(text(),'marketing,sales,support')] - fresherworks.com
		// //h2[contains(text(),'50,000 companies')] - fresherworks.com
		// //a[contains(text(),'Amazon')] - Links

		// 2.//contains() with text() and attribute:
		// //tag[contains(text(),'Science')and contains(@href,'amazon.science')] -
		// amazon.com

		// 3.//contains() with text() and attribute with contains():
		// //tag[contains(text(),'Science')and @class='nav_a'] - amazon.com

		// starts -with() - It will check the specific value to start with

		// // tag[starts-with(text(),'value')]
		// // a[starts-with(text(),'Amazon')] - amazon.com
		// // a[starts-with(text(),'Free CRM has powerful call tracking')] - crm pro
		// .com

		// // input[starts-with(@aria-labelledby,'UIFormControl')and @type='email'] -
		// hubspot.com
		// // input[starts-with(@href,'https://naveenautomationlabs.com/')

		// ends-with() in xpath ?-- NA
		
		
		
		
		
		//Class 11 -
		
		// Position - indexing in xpath
		// 
		
		// (//input[@class='form-control'])[2] // using number index
		
		By.xpath("(//input[@class='form-control'])[2]");
		
		
		// We can use position () function as well
		// Capture group-We need to capture all the elements in () as below
		
		// (//input[@class='form-control'])[position()=1]   // - using position
		
		// (//input[@class='form-control'])[2] - using index
		
		//(//input[@class='form-control'])[last()] - It will to the last element
		
		//(//input[@class='form-control'])[last()-1] - It will to the second last element vice versa
		
		
		// Last element in the Footer section (amazon.com - "help option")
		
		// ((//div[contains(@class,'navFooterLinkCol ')]) [last()]//a)[last()] - "help option"
		// ((//div[contains(@class,'navFooterLinkCol ')]) [last()]//a)[last() -1] - "amazon assistant option" second last
		
		driver.findElement(By.xpath("((//div[contains(@class,'navFooterLinkCol ')]) [last()]//a)[last()]")).getText();
		
		 // Class in locator : className,xpath,css
		// Always use all the class name in xpath as below
		
		// //input[@class='form-control private-form__control login-email']  - valid using all classes 
		
		// //input[@class='form-control'] - invalid	
		
		By.className("form-control private-form__control login-email"); //-not valid -only one class is allowed
		
		By.className("login-email") ; // valid
		
		// We can use contains() method in xpath for class as below with particular class
		By.xpath("//input[contains(@class='login-email')]"); // - Valid 
		
		
		// parent to child:
		
		// parent/child ---> will give us direct elements
		// parent//child --->will give us direct and indirect elements
		
		// interview question -
		
		//child to parent: backward traversing in xpath in html dom
		// We can call using the ../ as below
		// //input[@id='input-email']/ ../ ../ ../ ../
		
		//xpath sibling:
		
		// preceding-sibling:
		
		// //input[@id='input-email']/preceding-sibling::label      ->https://naveenautomationlabs.com/opencart/index.php?route=account/login
		driver.findElement(By.xpath("//input[@id='input-email']/preceding-sibling::label ")).getText();
		
		// following-sibling:
		// //label[@for='input-email']/following-sibling::input[@name='email'] 
		
		
		// checkbox selection using preceding sibling 
		
		//1st approach
		//a[contains(text(),'Ali khan')]/../preceding-sibling::td/input[@type='checkbox']
		
		
		
		
		//2nd approach
		//a[contains(text(),'Romi Singh')]/parent::td/preceding-sibling::/input[@type='checkbox']
		//a[contains(text(),'deepti gupta')]/parent::td/preceding-sibling::/input[@type='checkbox']
		
		
		//a[contains(text(),'Ali khan')]/parent::td/following-sibling::td){position()=1]/a    - > company name -google
		
		//a[contains(text(),'Ali khan')]/parent::td/following-sibling::td/span  - > phone number
		
		
		
		//span[text()='Jordan Herman']/../../../following-sibling::td//span
		
		// Below "ancestor" function will help to go to direct grand parent in the html dom
		//span[text()='Jordan Herman']/ancestor::td/following-sibling::td//span   --> Live score.com
		
		//span[text()='Jordan Herman']/ancestor::td/following-sibling::td//span)[2]
		 
		
		
		
		// //*[@id='input-firstname'] - if there are 100 elements , it will go through all
		// //input[@id='input-firstname'] - it will specifically go to input 10 input elements
		
		
		
		
	} 

}
