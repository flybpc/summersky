package com.flybpc.summersky.dao.mapper;

import com.flybpc.summersky.model.Member;
import org.apache.ibatis.annotations.Param;


public interface MemberMapper {

    Member findMemberByUid(@Param("uid") Long uid) throws Exception;

    Member findMemberByMemberId(@Param("employee_id") String memberId) throws Exception;

}
