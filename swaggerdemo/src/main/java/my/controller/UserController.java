package my.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import my.db.User;

@Api(value = "用户接口")
@RestController
public class UserController {
	
	@ApiOperation("查询用户信息")
	@RequestMapping(value="getUser",method=RequestMethod.GET)
	public User getUser()
	{
		System.out.println("获取用户信息");
		return new User(1001 , "王尼玛" , (byte)1);
	}
	@ApiOperation("添加一条用户")
	@RequestMapping(value="createUser",method=RequestMethod.POST)
	public void createUser(User user)
	{
		System.out.println(user.toString());
	}

}
