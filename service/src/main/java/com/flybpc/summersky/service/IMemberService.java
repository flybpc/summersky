package com.flybpc.summersky.service;

import com.flybpc.summersky.model.Member;

/**
 * Created by luyh on 16/4/27.
 */
public interface IMemberService {

    Member findMemberByUid(Long uid) throws Exception;

    Member findMemberByMemberId(String memberId) throws Exception;


}
