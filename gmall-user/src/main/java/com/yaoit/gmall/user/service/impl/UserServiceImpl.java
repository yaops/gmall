package com.yaoit.gmall.user.service.impl;


import com.yaoit.gmall.user.bean.UmsMember;
import com.yaoit.gmall.user.bean.UmsMemberReceiveAddress;
import com.yaoit.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.yaoit.gmall.user.mapper.UserMapper;
import com.yaoit.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAllUser();

        return umsMembers;
    }

    @Override
    public List<UmsMember> getAllUserByBaseMapper() {
        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
//        UmsMemberReceiveAddress umsMemberReceiveAddress=new UmsMemberReceiveAddress();
//        umsMemberReceiveAddress.setMemberId(memberId);
        Example e=new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> select = umsMemberReceiveAddressMapper.selectByExample(e);
        return select;
    }
}
