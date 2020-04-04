package com.yaoit.gmall.user. service;

import com.yaoit.gmall.user.bean.UmsMember;
import com.yaoit.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMember> getAllUserByBaseMapper();
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

}
