package seleniumSessions;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSSSelector_class13_14 {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		// 1.id

		// We can create css selector as below using #

		// #id -> #input-firstname - css
		// input[@id='input-firstname'] - xpath

		//By fn = By.cssSelector("#input-firstname");

		// 2.tag#id
		// input#input-firstname

		// 3. class - eg below
		// use-> .class
		// .form-control
		// .login-email

		// 4.we can use -> tag.class
		// input.form-control
		// input.login-email

		// 5.for multiple classes use - > .class1.class2.class3
		// .form-control.private-form__control.login-email

		// 6.Also we can use for multiple classes -> tag.class1.class2.class3
		// input..form-control.private-form__control.login-email

		// 7.we can use any combinations of class -but it should start with .
		// .class2.class1.class3
		// ..class2.class1
		// .class3.class2.class1

		// 8.combining tag and id

		// tag#id.class
		// input#username.login-email

		// tag.class#id
		// input.login-email#username

		// #id.class
		// .login-email#username

		// .class#id
		// #username.login-email

		// 9. tag.c1.c2.c3..cn#id
		// input#username.form-control.private-form__control.login-email
		// input.form-control.private-form__control.login-email#username

		// 10 .For other attributes - other the id and class we can use the below

		// tag[attr='value']
		// input[type='email'] - css
		// //input[@type='email'] - xpath
		// input[placeholder='First Name'] -css

		// Note -we can also use id as well
		// input[id='input-first-name']

		// Note- class will not work in the below with single class

		// input[class='login-email'] -css -0
		// //input[@class='login-email'] - xpath -0

		// Note - in xpath -we can use 'contains' as below
		// //input[contains(@class,'login-email')] -xpath -1
		// //input[@class='form-control private-form__control login-email'] -xpath -1

		// we have a similar kind of 'contains' keyword in css as well that we can use

		// ------------------------------------------

		// 11. Multiple attributes in css as below use individual square brackets
		// and in xpath we use 'and'

		// tag[attr1='value'][attr2='value'][attr3='value']

		// input[type='text'][name='firstname'] -css
		// input[type='text'][name='firstname'][placeholder='First Name']-css

		// // input[@type='text'and @name='firstname'and @placeholder='First Name']-
		// xpath

		// 12. tag#id[attr='value']

		// input#input-firstname[placeholder='First Name'] -css
		// input#input-firstname[placeholder='First Name'][type='text'] -css
		// input#input-firstname[placeholder='First Name'][type='text'].form-control
		// -css
		// input[placeholder='First Name'][type='text'].form-control#input-firstname
		// -css

		// 13 .Please note - text is not supported in CSS - it will be difficult to read
		// any text .Hence xpath is used for text
		// h1[text()='Register Account'] - not supported
		
		// 14. 'contains' in css we need to use * in the below formula -add one of the text in the value
		// tag[attr*='value']
		// input[id*='firstname']
		// input[class*='login-email']
		
		// 15. starts-with in css - we need to use ^ (char at)
		// tag[attr^='value']
		// input[placeholder^='First']
		
		// 16. ends-with in css - we need to use $
		// tag[attr$='value']
		// input[placeholder^='Name']
		
		// 17. parent to child:
		// parent tag child tag
		// parent tag > child tag > child tag
		
		//div.private-form__input-wrapper  input#username
		
		// select#Form_getForm_Country option -> for dropdown 
		
		// form#Form_getForm select --> 0 --direct child element
		// form#Form_getForm select --> 1 --indirect + direct child element
			
		// form#hs-login >div --> 9 
		//form#hs-login div  --> 22

		// 18. child to parent (backward traversing)- We cannot have it in CSS 
		
		 //------------------------------------------------
		
		//Class 14
		
		// 1. or - we can use or with comma in css as below eg
		// or -is not available in xpath , its only available in css
		
		//    input#username,button#loginBtn,input#password,button#ssoBtn
		//    we can find elements fes(css).size() -->4
		
		int impFieldsCount =driver.findElements(By.cssSelector("input#username,button#loginBtn,input#password,button#ssoBtn")).size();
		
		if(impFieldsCount==4) {
			
			System.out.println("Pass");
		}
		
		// 2.not in css:we can exclude the password class as below from two 
		
		//:not(#password)
		
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
	    
		// input.form-control.private-form__control:not(#password)-->css
		
		// input.form-control:not(input[name='search']) -->css for single 
		//input.form-control:not(input[name='search'],input[name='firstname'])-->css for multiple
		
		
		// 3.indexing
		
		//select#Form_getForm_Country >option:first-child  ---> first option using css
		
		//select#Form_getForm_Country >option:last-child ---> last option using css
		
		//we can use the below as well
		
		//select#Form_getForm_Country >option:first-of-type
		//select#Form_getForm_Country >option:last-of-type
		
		// we can use without tag as well as below
		
		// select#Form_getForm_Country >:first-of-type
		// select#Form_getForm_Country >:last-of-type
		
		// we can use nth-of-type for select particular option with the index as below
		
		// select#Form_getForm_Country >:nth-of-type(3) -- css with index
		// select#Form_getForm_Country >:nth-of-type(12) -- css with index
		
		// Note- indexing in css selector can work or not - its better to use xpath for indexing 
		
		
	// 4.                   	Xpath             Vs               CSS
		
		// 1. Syntax: 			Complex 						   simple
		
		// 2. text():			yes 							   no
		 
		// 3. AND : 			yes								   yes 
		
		// 4. OR  :				yes 							   yes
		
		// 5. forward :			yes								   no

		// 6. backwards:		yes								   yes

		// 7. forward sibling:	yes								   yes
		
		// 8. backward sibling:	yes								   no
		
		// 9. not:				no								   yes
		
		// 10. index:			yes								   yes
		
		// 11. capture grp      yes								   no
		
		// 12. performance		good							   good
		
		// 13. starts-with		yes								   yes
		
		// 14. contains 		yes								   yes
		
		// 15. ends-with		no								   yes
		
		// 16. webtable 		easy							   limited
		
	
	//5. sibling in css -> + is used for it as below
		
		//label[for='input-email']+input  ---> + will give immediate sibling
		// div.private-form__input-wrapper~div ---> + will give following forward siblings
		
		
	}

}



