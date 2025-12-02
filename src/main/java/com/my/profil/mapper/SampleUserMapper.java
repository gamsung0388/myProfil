package com.my.profil.mapper;

import com.my.profil.domain.SampleUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SampleUserMapper {

    @Select("SELECT id, name FROM sample_user")
    List<SampleUser> findAll();
}
