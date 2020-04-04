package com.yaoit.gmall.user.controller;


import com.yaoit.gmall.user.bean.UmsMember;
import com.yaoit.gmall.user.bean.UmsMemberReceiveAddress;
import com.yaoit.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {


    @Autowired
   UserService userService;
    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }


    @RequestMapping("getAllUserByBaseMapper")
    @ResponseBody
    public List<UmsMember> getAllUserByBaseMapper(){
        List<UmsMember> umsMembers = userService.getAllUserByBaseMapper();
        return umsMembers;
    }
    @RequestMapping("getAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> receiveAddressByMemberId = userService.getReceiveAddressByMemberId(memberId);
        return receiveAddressByMemberId;
    }



    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }



}

