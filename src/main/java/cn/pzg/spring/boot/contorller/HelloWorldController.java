package cn.pzg.spring.boot.contorller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.pzg.spring.boot.bean.TestUser;
/**
 * RestController 返回json对象
 * @author pan
 *
 */
@RestController  
public class HelloWorldController {
	

	@RequestMapping("/hello.json")
    public String index() {
        return "Hello World";
    }
	
	@RequestMapping("/getUser.json")
	public TestUser getUser() {
		TestUser tu = new TestUser();
		
		tu.setId(1l);
		tu.setSex(0);
		tu.setName("张三");
		tu.setCreateDate(new Date());
		return tu;
	}
}
