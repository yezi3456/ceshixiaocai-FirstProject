package com.webtest.misiying;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class UserGoodsAddress6 extends BaseTest1{
	
	String url="http://localhost/wstshop/home/index/index.html";
	
	@Test(description="新增收货地址【每一项都填写】",priority=1)
	public void AddAddress1() throws Exception {
		//打开网页
		webtest.open(url);
		webtest.click("link=请登录");
		webtest.type("id=loginName","misiying");
		webtest.type("id=loginPwd","123456");
		webtest.type("id=verifyCode","NHYG");
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
		
		//获取到新增地址目录
		webtest.click("class=addrIcon");
		webtest.click("class=addr-btn");
		webtest.click("xpath=//*[@id=\"area_0\"]");
		webtest.click("xpath=//*[@id=\"area_0\"]/option[2]");
		webtest.click("xpath=//*[@id=\"area_0_110000\"]");
		webtest.click("xpath=//*[@id=\"area_0_110000\"]/option[2]");
		webtest.click("//*[@id=\"area_0_110000_110100\"]");
		webtest.click("xpath=//*[@id=\"area_0_110000_110100\"]/option[2]");
		//输入详细地址
		webtest.type("xpath=//*[@id=\"userAddress\"]","上上国风七号楼");
		Thread.sleep(2000);	
		webtest.type("xpath=//*[@id=\"userName\"]", "张女士");
		Thread.sleep(2000);	
		webtest.type("xpath=//*[@id=\"userPhone\"]","1332222222");
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"useraddressForm\"]/table/tbody/tr[5]/td/div/label[2]/label");
		webtest.click("xpath=//*[@id=\"useraddressForm\"]/div/button[1]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("张女士"));
	}
	
	
	@Test(description="新增收货地址【无联系方式】",priority=2)
	public void AddAddress2() throws Exception {		
		//获取到新增地址目录
		webtest.click("class=addrIcon");
		webtest.click("class=addr-btn");
		webtest.click("xpath=//*[@id=\"area_0\"]");
		webtest.click("xpath=//*[@id=\"area_0\"]/option[2]");
		webtest.click("xpath=//*[@id=\"area_0_110000\"]");
		webtest.click("xpath=//*[@id=\"area_0_110000\"]/option[2]");
		webtest.click("//*[@id=\"area_0_110000_110100\"]");
		webtest.click("xpath=//*[@id=\"area_0_110000_110100\"]/option[2]");
		//输入详细地址
		webtest.typeAndClear("userAddress","");
		webtest.type("xpath=//*[@id=\"userAddress\"]","上上国风七号楼");
		Thread.sleep(2000);	
		webtest.typeAndClear("id=userName","");
		webtest.type("xpath=//*[@id=\"userName\"]", "刘女士");
		Thread.sleep(2000);	
		webtest.typeAndClear("id=userAddressForm","");
		webtest.click("xpath=//*[@id=\"useraddressForm\"]/table/tbody/tr[5]/td/div/label[2]/label");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"useraddressForm\"]/div/button[1]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("刘女士"));
	}
	
	
	@Test(description="新增收货地址【无姓名】",priority=3)
	public void AddAddress3() throws Exception {
		//获取到新增地址目录
		webtest.click("class=addrIcon");
		webtest.click("class=addr-btn");
		webtest.click("xpath=//*[@id=\"area_0\"]");
		webtest.click("xpath=//*[@id=\"area_0\"]/option[2]");
		webtest.click("xpath=//*[@id=\"area_0_110000\"]");
		webtest.click("xpath=//*[@id=\"area_0_110000\"]/option[2]");
		webtest.click("//*[@id=\"area_0_110000_110100\"]");
		webtest.click("xpath=//*[@id=\"area_0_110000_110100\"]/option[2]");
		//输入详细地址
		webtest.typeAndClear("id=userAddress","");
		webtest.type("xpath=//*[@id=\"userAddress\"]","上上国风七号楼");
		Thread.sleep(2000);	
		webtest.typeAndClear("id=userName","");
		webtest.typeAndClear("id=userPhone","");
		webtest.type("xpath=//*[@id=\"userPhone\"]","1332222222");
		Thread.sleep(2000);	
		webtest.typeAndClear("id=userAddressForm","");
		webtest.click("xpath=//*[@id=\"useraddressForm\"]/table/tbody/tr[5]/td/div/label[2]/label");
		webtest.click("xpath=//*[@id=\"useraddressForm\"]/div/button[1]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("上上国风"));
	}
	
	
	@Test(description="新增收货地址【无详细地址】",priority=4)
	public void AddAddress4() throws Exception {
		//获取到新增地址目录
		webtest.click("class=addrIcon");
		webtest.click("class=addr-btn");
		webtest.click("xpath=//*[@id=\"area_0\"]");
		webtest.click("xpath=//*[@id=\"area_0\"]/option[2]");
		webtest.click("xpath=//*[@id=\"area_0_110000\"]");
		webtest.click("xpath=//*[@id=\"area_0_110000\"]/option[2]");
		webtest.click("//*[@id=\"area_0_110000_110100\"]");
		webtest.click("xpath=//*[@id=\"area_0_110000_110100\"]/option[2]");
		webtest.typeAndClear("id=userName","");
		webtest.type("xpath=//*[@id=\"userName\"]", "张女士");
		Thread.sleep(2000);	
		webtest.typeAndClear("id=userPhone","");
		webtest.type("xpath=//*[@id=\"userPhone\"]","1332222222");
		Thread.sleep(2000);	
		webtest.typeAndClear("id=useraddressForm","");
		webtest.click("xpath=//*[@id=\"useraddressForm\"]/table/tbody/tr[5]/td/div/label[2]/label");
		webtest.click("xpath=//*[@id=\"useraddressForm\"]/div/button[1]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("张女士"));
	}
	
	
	@Test(description="新增收货地址【无地址区域选择】",priority=5)
	public void AddAddress5() throws Exception {
		//获取到新增地址目录
		webtest.click("class=addrIcon");
		webtest.click("class=addr-btn");
		//输入详细地址
		webtest.typeAndClear("id=area_0","");
		webtest.typeAndClear("id=userAddress","");
		webtest.type("xpath=//*[@id=\"userAddress\"]","上上国风七号楼");
		Thread.sleep(2000);	
		webtest.typeAndClear("id=userName","");
		webtest.type("xpath=//*[@id=\"userName\"]", "张女士");
		Thread.sleep(2000);	
		webtest.typeAndClear("id=userPhone","");
		webtest.type("xpath=//*[@id=\"userPhone\"]","1332222222");
		Thread.sleep(2000);	
		webtest.typeAndClear("id=useraddressForm","");
		webtest.click("xpath=//*[@id=\"useraddressForm\"]/table/tbody/tr[5]/td/div/label[2]/label");
		webtest.click("xpath=//*[@id=\"useraddressForm\"]/div/button[1]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("张女士"));
	}
	
	
	@Test(description="修改默认地址",priority=6)
	public void ChangeDefaultAddredd() throws Exception {	
		webtest.click("xpath=/html/body/div[1]/div/ul[1]/li[1]/div[1]/a");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div/div[1]/ul/li[3]/p[1]");
		webtest.click("xpath=//*[@id=\"address_box\"]/table[2]/tbody/tr[6]/td[2]/a[1]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		assertTrue(webtest.isTextPresent("默认地址"));
	}

}
