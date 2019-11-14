package movie;
import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.TxtDataProvider;

public class Login extends BaseTest{
	@Test(priority=1)
	public void login() throws Exception {
		webtest.open("http://www.roqisoft.com/zhsx/");
		webtest.click("link=登录");
		webtest.type("id=user","admin3");
		webtest.type("id=pw","admin3");
		webtest.click("xpath=/html/body/form/div/div[4]/div[2]/input");
	}
	@Test(priority=2)
	public void mod() throws Exception {
		webtest.click("xpath=//*[@id=\"topnav\"]/font/li[8]/a");
		webtest.click("xpath=//*[@id=\"comment\"]/h4/font/a/strong/u");
		webtest.type("id=title","test");
		webtest.tapClick();
		webtest.tapType("test");
		webtest.leaveFrame();
		webtest.click("xpath=//*[@id=\"post_button\"]/input[3]");
		webtest.click("xpath=//*[@id=\"adm_log_list\"]/tbody/tr/td[1]/input");
		webtest.click("xpath=//*[@id=\"form_log\"]/div/a[3]");		
		
		webtest.click("xpath=//*[@id=\"menu_draft\"]/a");
		webtest.click("xpath=//*[@id=\"adm_log_list\"]/tbody/tr[1]/td[2]/a");		
		webtest.type("id=title","修改");
		webtest.tapClick();
		webtest.tapType("修改");
		webtest.leaveFrame();
		webtest.click("xpath=//*[@id=\"pubdf\"]");
	}
	@Test(priority=4)
	public void photo() throws Exception {
		webtest.open("http://www.roqisoft.com/zhsx/blog/admin/mypic.php");
		webtest.click("xpath=//*[@id=\"post_bar\"]/div[1]/span[1]/strong");
		Thread.sleep(3000);
		webtest.enterFrame1("xpath=//iframe[starts-with(@src,'attachment.php')]");//在WebDriverEngine中新添加了一种方法，通过xpath找到子页面
		webtest.type("xpath=//*[@id=\"attachbody\"]/span/input","E:\\997.png");
		webtest.click("xpath=//*[@id=\"media-upload-body\"]/input");
		Thread.sleep(3000);		
	}
	@Test(priority=3)
	public void pinglun() throws Exception {
		webtest.open("http://www.roqisoft.com/zhsx/blog/");
		webtest.open("http://www.roqisoft.com/zhsx/blog/?post=61");
		webtest.type("xpath=//*[@id=\"commentform\"]/p[1]/textarea", "test12345");
		webtest.click("xpath=//*[@id=\"commentform\"]/input[2]");
	}
}