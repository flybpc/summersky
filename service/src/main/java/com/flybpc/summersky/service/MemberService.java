package com.flybpc.summersky.service;

import com.flybpc.summersky.dao.IDaoMember;
import com.flybpc.summersky.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luyh on 16/4/27.
 */

@Service
public class MemberService implements IMemberService{

    @Autowired
    private IDaoMember daoMember;

    @Override
    public Member findMemberByUid(Long uid) throws Exception {
        return daoMember.findMemberByUid(uid);
    }

    @Override
    public Member findMemberByMemberId(String memberId) throws Exception {
        return daoMember.findMemberByMemberId(memberId);
    }
}
