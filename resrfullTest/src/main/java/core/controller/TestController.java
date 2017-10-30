package core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/test")
public class TestController {

	
//  @RequestMapping
//	@RequestMapping("/find")
//  @RequestMapping(method=RequestMethod.GET) 
//	@RequestMapping(value="/hello", headers = {"apiVersion=2.0"})
  @RequestMapping(method=RequestMethod.GET ,params = "name") 
//  @RequestMapping(value="", method=RequestMethod.GET) 
  public String test() {
      return "0";
  }
  
  
  @RequestMapping(method=RequestMethod.GET ,params = {"name","test"}) 
  public String test1(@RequestParam(value="name", defaultValue="") String name ,@RequestParam(value="test", defaultValue="") String test ) {
    return "1"+name+test;
  }
  
  
 @RequestMapping(value="/" , method=RequestMethod.GET ,params = {"name"}) 
  public String test2(@RequestParam("name") String name ,@RequestParam("test") String test ) {
    return "2"+name+test;
  }
}
