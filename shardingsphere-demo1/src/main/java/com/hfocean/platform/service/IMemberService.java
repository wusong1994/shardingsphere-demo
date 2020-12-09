package com.hfocean.platform.service;

import com.hfocean.platform.core.po.MemberPo;

public interface IMemberService {

    void insert(MemberPo member);

    MemberPo findById(Long memberId);
}
