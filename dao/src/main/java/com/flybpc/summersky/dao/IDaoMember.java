package com.flybpc.summersky.dao;

import com.flybpc.summersky.model.Member;

/**
 * Created by luyh on 16/4/27.
 */
public interface IDaoMember {

    Member findMemberByUid(Long uid) throws Exception;

    Member findMemberByMemberId(String memberId) throws Exception;

}
