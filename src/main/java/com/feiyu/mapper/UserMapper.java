package com.feiyu.mapper;

import com.feiyu.model.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
     User findUser(User record);

     User addUser(User record);

     User updateUser(User user);

     User deleteUser(Integer id);
}