package com.yougu.mall.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.yougu.mall.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);



    User select(@Param("loginName") String loginName,@Param("password") String password);

    Integer countByEmail(@Param("email")String email);

    Integer countByUsername(@Param("username")String username);
    User selectAllByUsername(@Param("username")String username);

     int updatePasswordByUsername(@Param("updatedPassword")String updatedPassword,@Param("username")String username);









}