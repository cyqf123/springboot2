package com.example.mappers;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface UserMapper {

    User login(@Param("username") String userName,@Param("password") String passWord);

    List<User> lookAllUser();//查询所有

    int selectNum();//查询数量
}
