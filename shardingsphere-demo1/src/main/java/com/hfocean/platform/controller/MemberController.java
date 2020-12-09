package com.hfocean.platform.controller;

import com.hfocean.platform.core.po.MemberPo;
import com.hfocean.platform.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("/member")
@RestController
public class MemberController {

    @Autowired
    private IMemberService memberService;

    @RequestMapping("/add")
    public MemberPo add(){
        MemberPo member = new MemberPo();
        member.setMemberName("张三");
        member.setNickName("闪耀的瞬间");
        member.setAccountNo(member.getMemberId()+"");
        member.setPassword("123465");
        member.setAge(27);
        member.setBirthDate(new Date());
        member.setEblFlag("1");
        member.setDelFlag("0");
        member.setDescription("xxx");
        member.setCreateTime(new Date());
        member.setUpdateTime(new Date());
        memberService.insert(member);
        return member;
    }

    @RequestMapping("/{id}")
    public MemberPo findById(@PathVariable Long id){
        return memberService.findById(id);
    }
}
