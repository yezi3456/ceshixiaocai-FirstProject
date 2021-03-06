package com.webtest.wangliyu;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

@Listeners(com.webtest.core.WebTestListener.class)
public class HuiyuanguanliTest extends BaseTest {


	
	@Test(description="07修改账号success")
	public void test1() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("link=会员管理");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);
		webtest.click("link=修改");
		Thread.sleep(2000);
		webtest.typeAndClear("id=userName","");
		webtest.typeAndClear("id=userPhone","");
		webtest.typeAndClear("id=userEmail","");
		webtest.typeAndClear("id=userQQ","");
		Thread.sleep(2000);
		webtest.type("id=userName","VIP");
		Thread.sleep(2000);
		webtest.type("id=userPhone","15210239098");
		webtest.type("id=userEmail","25116@qq.com");
		webtest.type("id=userQQ","29105789");		
		webtest.click("xpath=/html/body/form/table/tbody/tr[9]/td/input[2]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("VIP"));
	}
	
	@Test(description="06删除账号")
	public void test2() throws Exception {
		Thread.sleep(3000);
		webtest.click("link=删除");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[4]/div[3]/a[1]");
		Thread.sleep(2000);
	}
	
	@Test(description="08修改账号（不写用户名）fail")
	public void test3() throws Exception{
		
		Thread.sleep(3000);
		webtest.click("link=修改");
		Thread.sleep(2000);
		webtest.typeAndClear("id=userName","");
		webtest.typeAndClear("id=userPhone","");
		webtest.typeAndClear("id=userEmail","");
		webtest.typeAndClear("id=userQQ","");
		Thread.sleep(2000);
		webtest.type("id=userPhone","13455676587");
		Thread.sleep(2000);
		webtest.type("id=userEmail","286609@qq.com");
		Thread.sleep(2000);
		webtest.type("id=userQQ","29197447");	
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/form/table/tbody/tr[9]/td/input[2]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("性别"));
	}
	
	@Test(description="09修改账号（不输入手机号码）fail")
	public void test4() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id=\"userForm\"]/table/tbody/tr[9]/td/input[3]");
		Thread.sleep(3000);
		webtest.click("link=修改");
		Thread.sleep(2000);
		webtest.typeAndClear("id=userName","");
		webtest.typeAndClear("id=userPhone","");
		webtest.typeAndClear("id=userEmail","");
		webtest.typeAndClear("id=userQQ","");
		webtest.type("id=userName","VIPP");
		Thread.sleep(2000);
//		webtest.type("id=userPhone","12345678900");
		webtest.type("id=userEmail","27566@qq.com");
		Thread.sleep(2000);
		webtest.type("id=userQQ","2911765");	
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/form/table/tbody/tr[7]/td/input[2]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("VIPP"));
	}
	
	
	@Test(description="10修改账号（不输入邮箱）fail")
	public void test5() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id=\"userForm\"]/table/tbody/tr[9]/td/input[3]");
		Thread.sleep(3000);
		webtest.click("link=修改");
		Thread.sleep(2000);
		webtest.typeAndClear("id=userName","");
		webtest.typeAndClear("id=userPhone","");
		webtest.typeAndClear("id=userEmail","");
		webtest.typeAndClear("id=userQQ","");
		Thread.sleep(2000);
		webtest.type("id=userName","VIPPP");
		Thread.sleep(2000);
		webtest.type("id=userPhone","15231120909");
		Thread.sleep(2000);
//		webtest.type("id=userEmail","23@qq.com");
		webtest.type("id=userQQ","235610");
		Thread.sleep(2000);
		webtest.click("xpath=*[@id=\"userRankForm\"]/table/tbody/tr[7]/td/input[2]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("VIPPP"));
	}
	
	@Test(description="11修改账号（不输入会员积分）fail")
	public void test6() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id=\"userForm\"]/table/tbody/tr[9]/td/input[3]");
		Thread.sleep(3000);
		webtest.click("link=修改");
		Thread.sleep(2000);
		webtest.typeAndClear("id=userName","");
		webtest.typeAndClear("id=userPhone","");
		webtest.typeAndClear("id=userEmail","");
		webtest.typeAndClear("id=userQQ","");
		webtest.typeAndClear("id=userScore","");
		Thread.sleep(2000);
		webtest.type("id=userName","VIPPPP");
		Thread.sleep(2000);
		webtest.type("id=userPhone","15232435676");
		Thread.sleep(2000);
		webtest.type("id=userEmail","29097@qq.com");
		Thread.sleep(2000);
		webtest.type("id=userQQ","2894");	
		Thread.sleep(2000);
		webtest.click("xpath=*[@id=\"userRankForm\"]/table/tbody/tr[7]/td/input[2]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("VIPPPP"));
	}
	
	@Test(description="41查询-只输入账号名success")
	public void test7() throws Exception{
//		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
//		webtest.click("link=会员管理");
//		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id=\"userForm\"]/table/tbody/tr[9]/td/input[3]");
		Thread.sleep(2000);
		webtest.type("id=loginName1", "maysh2009");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"query\"]/input[4]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("会员账号"));
	}
	
	@Test(description="42查询-只输入电话号码success")
	public void test8() throws Exception{
		Thread.sleep(2000);
		webtest.typeAndClear("id=loginName1", "");
		Thread.sleep(2000);
		webtest.type("id=loginPhone", "13172912018");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"query\"]/input[4]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("13172912018"));
	}
	
	@Test(description="43查询-只输入邮箱success")
	public void test9() throws Exception{
//		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
//		webtest.click("link=会员管理");
//		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(2000);
		webtest.typeAndClear("id=loginPhone", "");
		Thread.sleep(2000);
		webtest.type("id=loginEmail", "sadf@qq.com");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"query\"]/input[4]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("sadf@qq.com"));
//		webtest.leaveFrame();
	}
	
	@Test(description="44查询-只输入错误的邮箱fail")
	public void test10() throws Exception{
		Thread.sleep(2000);
		webtest.typeAndClear("id=loginEmail", "");
		Thread.sleep(2000);
		webtest.type("id=loginEmail", "232@sdcom");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"query\"]/input[4]");
		Thread.sleep(2000);
		assertFalse(webtest.isTextPresent("232@sdcom"));
		
	}
	
	@Test(description="45查询-只输入账号名的一部分success")
	public void test11() throws Exception{
		Thread.sleep(2000);
		webtest.typeAndClear("id=loginEmail", "");
		Thread.sleep(2000);
		webtest.type("id=loginName1", "xiaofeifei");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"query\"]/input[4]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("xiaofeifei"));
		
	}
	
	@Test(description="46查询-只输入手机号的一部分success")
	public void test12() throws Exception{
		Thread.sleep(2000);
		webtest.typeAndClear("id=loginName1", "");
		Thread.sleep(2000);
		webtest.type("id=loginPhone", "134");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"query\"]/input[4]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("会员账号"));
		
	}
	
	
	
	
	
}
