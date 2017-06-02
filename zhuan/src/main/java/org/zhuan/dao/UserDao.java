package org.zhuan.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.zhuan.domain.User;

public interface UserDao {

	@Select("select * from user where uid=#{uid}")
	User getUser(@Param("uid") String uid);
}
