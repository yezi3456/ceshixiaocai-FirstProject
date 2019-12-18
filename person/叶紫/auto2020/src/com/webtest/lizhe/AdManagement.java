package com.webtest.lizhe;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

@Listeners(com.webtest.core.WebTestListener.class)
public class AdManagement extends BaseTest{
	@Test(description="修改3 广告（首页下方4广告的第一个）结束时间改为2019-12-12")
	public void test1() throws Exception {
		webtest.click("link=广告管理");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1003|c110\"]/div/a[1]");
		webtest.typeAndClear("id=adEndDate", "2019-12-12");
		webtest.click("xpath=//input[@value='提交']");
		assertTrue(webtest.isTextPresent("2019-12-12"));
		webtest.leaveFrame();
	}
	@Test(description="查询PC版 首页轮播广告")
	public void test3() throws Exception {
		webtest.click("link=广告管理");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("id=positionType");
		webtest.click("xpath=//*[@id=\"positionType\"]/option[2]");
		webtest.click("id=adPositionId");
		webtest.click("xpath=//*[@id=\"adPositionId\"]/option[2]");
		webtest.click("xpath=//input[@value='查询']");
		assertTrue(webtest.isTextPresent("首页分层1F顶部广告"));
		webtest.leaveFrame();
	}

//	@Test(description="删除第一个广告（已删除）",priority=2)
//	public void delete() throws Exception {
//		webtest.click("link=广告管理");
//		webtest.enterFrame("wst-lframe-1");
//		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c110\"]/div/a[2]");
//		webtest.click("link=确定");
//		assertFalse(webtest.isTextPresent("1测试删除广告"));
//		webtest.leaveFrame();
//	}
}
