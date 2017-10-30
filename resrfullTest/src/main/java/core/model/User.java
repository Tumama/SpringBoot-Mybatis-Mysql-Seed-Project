package core.model;

import java.io.Serializable;
import java.util.HashMap;

import com.google.gson.*;


public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private  String  userID;
    private  String  userName;
    private  String  userPassword;
    private  String  userAuth;
    private  String  userToken;
	
    public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserAuth() {
		return userAuth;
	}
	public void setUserAuth(String userAuth) {
		this.userAuth = userAuth;
	}
	public String getUserToken() {
		return userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	
    
    
    @Override
    public String toString() {

    	 HashMap<String, String> objStr = new HashMap<String, String>();
    	 objStr.put("userID",userID) ; 
      	 objStr.put("userName",userName) ; 
      	 objStr.put("userPassword",userPassword) ; 
      	 objStr.put("userAuth",userAuth) ; 
      	 objStr.put("userToken",userToken) ; 
      	 
    	 return new Gson().toJson(objStr) ;     	
    }
	
	
}
