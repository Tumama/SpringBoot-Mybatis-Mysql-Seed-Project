package core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import core.model.User;




@Mapper
public interface UserMapper {
	@Select("select * from User where userID = #{userID}")
	User findByUserID(@Param("userID") String userID);
	

	@Select("insert into User (userID,userName,userPassword,userAuth,userToken) values(#{userID},#{userID},#{userID},#{userID},#{userID})")
	User insertUserID(@Param("userID") String userID);
	
	
//	@Select("SELECT * FROM city")
//    // 返回 Map 结果集
//    @Results({
//            @Result(property = "id", column = "id"),
//            @Result(property = "provinceId", column = "province_id"),
//            @Result(property = "cityName", column = "city_name"),
//            @Result(property = "description", column = "description"),
//    })
//    City findByName(@Param("cityName") String cityName);
}
