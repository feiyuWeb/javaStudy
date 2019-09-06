package com.feiyu.mapper;

import com.feiyu.model.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<User> {
     List<User> findUser();

     User addUser(User record);

     User updateUser(User user);

     User deleteUser(Integer id);
}