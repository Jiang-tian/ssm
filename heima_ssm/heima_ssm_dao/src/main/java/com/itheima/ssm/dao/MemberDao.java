package com.itheima.ssm.dao;

import org.apache.ibatis.annotations.Select;

import com.itheima.ssm.domain.Member;

public interface MemberDao {

        @Select("select * from member where id=#{id}")
        public Member findById(String id) throws Exception;

}
