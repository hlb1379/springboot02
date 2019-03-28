package com.hlb.mapper;

import com.hlb.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Fly on 2019/3/27.
 */
public interface UserMapper {
    @Select("select * from tb_user")
    List<User> getAll();
}