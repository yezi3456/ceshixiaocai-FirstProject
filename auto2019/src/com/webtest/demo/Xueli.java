package com.webtest.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
//Œ“µƒ’ ∫≈ «2784038315@qq.com √‹¬ÎZhen0820
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Xueli {

	

	@Test
	public void xueli() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\\\kaiyuankuangjia\\\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");

		WebDriver wd = new FirefoxDriver();
		wd.get("http://10.7.10.7/");
		wd.findElement(By.linkText("µ«¬º")).click();
		Thread.sleep(3000);
		wd.findElement(By.name("username")).sendKeys("2784038315@qq.com");
		wd.findElement(By.name("password")).sendKeys("Zhen0820");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
//		wd.findElement(By.className("notification-box")).click();
		Actions action =	 new Actions(wd);
		action.moveToElement(wd.findElement(By.className("notification-box"))).perform();

		Thread.sleep(3000);
		wd.findElement(By.xpath("//a[contains(@href, '/u/teams/applications/')]")).click();

		boolean flag=wd.findElement(By.className("notification-box")).isDisplayed();
		System.out.println(flag);
		System.out.println(wd.findElement(By.className("notification-box")).getTagName());
	}
	
//	JavascriptExecutor j = (JavascriptExecutor) wd;
//	j.executeScript("arguments[0].click();",wd.findElement(By.className("notification-box")));
	

}
