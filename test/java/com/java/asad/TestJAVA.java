package com.java.asad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJAVA {

	public static void main(String[] args) {

        // System Property for Chrome Driver   
     System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");  
       
          // Instantiate a ChromeDriver class.     
     WebDriver driver=new ChromeDriver();  
       
        // Launch Website  
     driver.navigate().to("https://opensource-demo.orangehrmlive.com/");  

	}

}
