package com.st.spring.beans.tx.mapper;

import com.st.spring.beans.tx.User;
import com.st.spring.beans.tx.provider.CrudSqlProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

@Mapper
public interface UserMapper {
	
	@Select("select * from t_user where id = #{id}")
	User selectOne(int id);

	@SelectProvider(value = CrudSqlProvider.class, method = "count")
	int count();

}
