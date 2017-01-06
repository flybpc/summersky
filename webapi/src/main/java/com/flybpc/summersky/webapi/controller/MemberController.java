package com.flybpc.summersky.webapi.controller;

import com.flybpc.summersky.model.Member;
import com.flybpc.summersky.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luyh on 16/4/27.
 */

@RestController
public class MemberController {

    @Autowired
    private IMemberService memberService;

    @RequestMapping("/member/{memberId}")
    Member findMemberByMemberId(@PathVariable("memberId") String memberId) throws Exception{
       return memberService.findMemberByMemberId(memberId);
    }



}
