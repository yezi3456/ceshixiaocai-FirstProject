package com.webtest.misiying;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.dataprovider.TxtDataProvider;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class AssessAnOrder extends BaseTest1{
	
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("url"));
		webtest.click("link=请登录");
		webtest.type("name=loginName", "xiaofeifei");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//[@name='rememberPwd']");
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
		Thread.sleep(3000);

	}
	
	@Test(description="评价已收货商品【每一项都写】")
	public void test1() throws Exception {
		//评价商品
		webtest.click("class=uc-order-icon4");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[3]/tr[3]/td[4]/div[1]/a");
		//评星
		webtest.click("xpath=//*[@id=\"app-box1\"]/div[1]/div[2]/div[1]/img[4]");
		webtest.click("xpath=//*[@id=\"app-box1\"]/div[3]/div[2]/div[1]/img[3]");
		webtest.click("xpath=//*[@id=\"app-box1\"]/div[5]/div[2]/div[1]/img[2]");
		//评字
		webtest.type("xpath=//*[@id=\"content1\"]","非常好，非常棒，超级好吃!");
		//提交
		webtest.click("xpath=//*[@id=\"app-box1\"]/div[10]/div[4]/div[3]/button");
		
		assertTrue(webtest.isTextPresent("非常好"));
	}
	
	
	@Test(description="评价已收货商品【无评字】")
	public void test2() throws Exception {
		
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[1]/li");
		//评价商品
		webtest.click("class=uc-order-icon4");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[4]/tr[3]/td[4]/div[1]/a");
		//评星
		webtest.click("xpath=//*[@id=\"app-box1\"]/div[1]/div[2]/div[1]/img[4]");
		webtest.click("xpath=//*[@id=\"app-box1\"]/div[3]/div[2]/div[1]/img[3]");
		webtest.click("xpath=//*[@id=\"app-box1\"]/div[5]/div[2]/div[1]/img[2]");

		//提交
		webtest.click("xpath=//*[@id=\"app-box1\"]/div[10]/div[4]/div[3]/button");
		
		//assertTrue(webtest.isTextPresent("点评"));
	}
	
	
	@Test(description="完整评价已收货商品【无评星】")
	public void test3() throws Exception {

		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[1]/li");
		//评价商品
		webtest.click("class=uc-order-icon4");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[5]/tr[3]/td[4]/div[1]/a");
		//评字
		webtest.type("xpath=//*[@id=\"content1\"]","非常好，非常棒，超级好吃!");
		
		webtest.click("xpath=//*[@id=\"app-box1\"]/div[10]/div[4]/div[3]/button");
		
		//assertTrue(webtest.isTextPresent("提交评价"));
	}
}


