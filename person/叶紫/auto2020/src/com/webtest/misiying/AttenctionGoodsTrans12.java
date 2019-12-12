package com.webtest.misiying;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class AttenctionGoodsTrans12 extends BaseTest1{
	
	String url="http://localhost/wstshop/home/index/index.html";
	
	@Test(description="查看关注的商品",priority=1)
	public void Goods1() throws Exception {
		webtest.open(url);
		webtest.click("link=请登录");
		webtest.type("id=loginName","misiying");
		webtest.type("id=loginPwd","123456");
		webtest.type("id=verifyCode","NHYG");
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
		
		//查看关注的商品
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[2]/li");
		
		assertTrue(webtest.isTextPresent("加入购物车"));
	}
	
	
	@Test(description="查看待发货商品详情",priority=2)
	public void Goods2() throws Exception {
		
		//进入待发货商品页面
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[1]/li");
		Thread.sleep(3000);
		webtest.click("class=uc-order-icon2");
		Thread.sleep(3000);
		webtest.click("class=orderDetail");
		
		assertTrue(webtest.isTextPresent("订单信息"));
	}
	
	
	@Test(description="查询已取消订单",priority=3)
	public void Goods3() throws Exception {
	
		//进入已取消订单页面
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[6]");
		webtest.type("xpath=//*[@id=\"userName\"]","111");
		webtest.type("xpath=//*[@id=\"orderNo\"]","100000143");
		webtest.click("class=wst-btn wst-btn-query");	
		webtest.click("class=orderDetail");
		
		assertTrue(webtest.isTextPresent("订单信息"));
	}
	
	
	@Test(description="查看拒收商品详情",priority=4)
	public void Goods4() throws Exception {
		
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[1]/li");
		Thread.sleep(3000);
		webtest.click("class=uc-order-icon5");
		Thread.sleep(3000);
		webtest.click("class=orderDetail");
		
		assertTrue(webtest.isTextPresent("订单信息"));
	}
	
	
	@Test(description="查询-指定拒收商品详情",priority=5)
	public void Goods5() throws Exception {
		
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[1]/li");
		Thread.sleep(3000);
		webtest.click("class=uc-order-icon5");
		webtest.type("xpath=//*[@id=\"userName\"]","111");
		webtest.type("xpath=//*[@id=\"orderNo\"]","100000176");
		webtest.click("xpath=//*[@id=\"isRefund\"]");
		webtest.click("xpath=//*[@id=\"isRefund\"]/option[3]");
		webtest.click("class=wst-btn wst-btn-query");
		Thread.sleep(2000);	
		webtest.click("class=orderDetail");
		
		assertTrue(webtest.isTextPresent("订单信息"));
	}
	
	
	@Test(description="将待收货的商品确认收货",priority=6)
	public void Goods6() throws Exception {

		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[1]/li");
		Thread.sleep(3000);
		webtest.click("class=uc-order-icon3");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[4]/div[1]/a");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		
		assertTrue(webtest.isTextPresent("待收货订单"));
		
	}
	
	
	@Test(description="取消未发货订单",priority=7)
	public void Goods7() throws Exception {

		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[1]/li");
		webtest.click("class=uc-order-icon2");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[2]/td/div[3]/a");
		webtest.click("xpath=//*[@id=\"reason\"]");
		webtest.click("xpath=//*[@id=\"reason\"]/option[2]");
    	webtest.click("xpath=//*[@id=\"layui-layer2\"]/div[3]/a[1]");
    	
    	assertFalse(webtest.isTextPresent("红肉菠萝蜜"));
	}
	
	
	@Test(description="对待收货商品拒绝收货",priority=8)
	public void Goods8() throws Exception {

		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[1]/li");
		webtest.click("class=uc-order-icon3");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[4]/div[2]/a");
		webtest.click("xpath=//*[@id=\"reason\"]");
		webtest.click("xpath=//*[@id=\"reason\"]/option[2]");
		webtest.click("xpath=//*[@id=\"layui-layer2\"]/div[3]/a[1]");
		
		assertTrue(webtest.isTextPresent("待收货订单"));
	}
	
	
	@Test(description="通过用户中心-搜索框，对想要购买的指定商品进行搜索",priority=9)
	public void Goods9() throws Exception {	
		
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[1]/li");
		webtest.type("xpath=//*[@id=\"search-ipt\"]","草莓");
		webtest.click("xpath=//*[@id=\"search-btn\"]");

		assertTrue(webtest.isTextPresent("市场价"));
	}
	
	
	@Test(description="从买家中心跳转到前端首页页面",priority=10)
	public void Goods10() throws Exception {
		
		webtest.click("xpath=/html/body/div[1]/div/ul[1]/li[1]/div[1]/a");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[2]/div[1]/div[1]/a/img");
		
		assertTrue(webtest.isTextPresent("欢迎您"));
	}
	
	
	@Test(description="从买家中心跳转到购物车页面",priority=11)
	public void Goods11() throws Exception {
		
		webtest.click("xpath=/html/body/div[1]/div/ul[1]/li[1]/div[1]/a");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[2]/div[1]/div[2]/a/p");
		
		assertTrue(webtest.isTextPresent("购物车"));
	}
	
	@Test(description="打开友情链接-WSTMart多商户商城",priority=12)
	public void Goods12() throws Exception {

		
		webtest.click("xpath=/html/body/div[1]/div/ul[1]/li[1]/div[1]/a");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[6]/div[1]/div/div[8]/div[2]/div[1]/a");
	}
}

