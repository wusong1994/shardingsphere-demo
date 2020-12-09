package com.hfocean.platform.service.impl;

import com.hfocean.platform.core.po.MemberPo;
import com.hfocean.platform.mapper.MemberMapper;
import com.hfocean.platform.service.IMemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MemberServiceImpl implements IMemberService {

    @Resource
    MemberMapper memberMapper;

    @Override
    public void insert(MemberPo member) {
        memberMapper.insert(member);
    }

    @Override
    public MemberPo findById(Long memberId) {
        return memberMapper.selectByPrimaryKey(memberId);
    }
}
