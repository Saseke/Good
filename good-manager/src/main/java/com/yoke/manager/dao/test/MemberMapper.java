package com.yoke.manager.dao.test;

import com.yoke.manager.pojo.Member;
import com.yoke.manager.pojo.MemberExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface MemberMapper extends Mapper<Member> {
    long countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    List<Member> selectByExample(MemberExample example);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);
}