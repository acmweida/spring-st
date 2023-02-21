package com.st.spring.beans.tx.provider;

import org.apache.ibatis.builder.annotation.ProviderContext;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;



@SuppressWarnings("unchecked")
public class CrudSqlProvider {


    public String count(Map<String, Object> params, ProviderContext context) {
        SQL sql = new SQL();

        sql.SELECT("count(1) ").FROM("t_user");

        return sql.toString();
    }


}