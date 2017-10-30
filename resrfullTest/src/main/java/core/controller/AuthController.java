package core.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.*;
import core.model.User ; 
import core.mapper.UserMapper;


//127.0.0.1 3306
//DB:root
//	123456

@RestController
@RequestMapping("/v1/auth")
public class AuthController {
	
	  @Autowired
      private UserMapper userMapper;

	//登入 : POST
	  @RequestMapping(value="" , method=RequestMethod.POST ,params = {"name","password"})
	   public String login(@RequestParam("name") String name ,@RequestParam("password") String password ) {
		  HashMap<String, String> response = new HashMap<String, String>();
		 
		  	if(name.equals("Tumama") && password.equals("123456")){
		  		//json string 
		  		//object response to jsonString  		
		  		response.put("StatusCode","200") ; 
				response.put("result","0") ;
				response.put("msg","success") ;
				
				response.put("userID","1") ;
				response.put("token","123456789") ;
				response.put("auth","123456789") ;

				userMapper.insertUserID("1") ;
//				userMapper.findByUserID("1") ;
				
//				User user = new User() ; 
//				user.setUserID("1");
//				user.setUserAuth("");
//				user.setUserName("");
//				user.setUserPassword("");
//				user.setUserToken("");
//				
//				response.put("User", user.toString()) ;
		
		  	}else{
		  		response.put("StatusCode","401") ; 
				response.put("result","1") ;
				response.put("msg","fail") ;
				
				response.put("userID","") ;
				response.put("token","") ;
				response.put("auth","") ;
		  	}
		  	
	  		return new Gson().toJson(response);  
	   }
	
	
	//更新 權限 token : PUT
	  @RequestMapping(value="" , method=RequestMethod.PUT ,params = {"token","userID"}) 
	   public String updateAuth(@RequestParam("token") String token ,@RequestParam("userID") String userID ) {
		  HashMap<String, String> response = new HashMap<String, String>();
		  	if(token.equals("123456789") && userID.equals("1")){
		  		//json string 
		  		response.put("StatusCode","200") ; 
				response.put("result","0") ;
				response.put("msg","success") ;
					
				response.put("token","987654321") ;
				response.put("auth","987654321") ;
		  	}else{
		  		response.put("StatusCode","401") ; 
				response.put("result","1") ;
				response.put("msg","fail") ;
				
				response.put("token","") ;
				response.put("auth","") ;
		  	}
	  		return new Gson().toJson(response); 
	   }
	  
	  
	  
	  
	//登出 : DELETE
	  @RequestMapping(value="" , method=RequestMethod.DELETE ,params = {"token","userID"}) 
	   public String logout(@RequestParam("token") String token ,@RequestParam("userID") String userID ) {
		  HashMap<String, String> response = new HashMap<String, String>();
		  	if(token.equals("123456789") && userID.equals("1")){
		  		//json string 
		  		response.put("StatusCode","200") ; 
				response.put("result","0") ;
				response.put("msg","success") ;
		  	}else{
		  		response.put("StatusCode","401") ; 
				response.put("result","1") ;
				response.put("msg","fail") ;
		  	}
	  		return new Gson().toJson(response); 
	   }
	  
	  

    
    
    
}
