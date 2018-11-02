package com.r1123.fans.controller;

import com.r1123.fans.entity.UserEntity;
import com.r1123.fans.exception.GlobalErrorCode;
import com.r1123.fans.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by helloqdz on 2018/11/1.
 */
@RestController
@RequestMapping(value = "/admin/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public Object list(HttpSession session){
        Map<String, Object> results = new HashMap(3);
        try {
            List re = userService.find();
            results.put("errorCode", GlobalErrorCode.SUCESS);
            results.put("data", re);
        }catch (Exception e){
            results.put("errorCode", GlobalErrorCode.INTERNAL_ERROR);
        }
        return results;
    }

    @RequestMapping("/init")
    public String init(){
        UserEntity userEntity = new UserEntity();
        userEntity.setName("你");
        userEntity.setWeChat("w1");
        userEntity.setPhone("16067153664");
        userEntity.setGender("男");
        userEntity.setInviteCode("APO12");

        userEntity = userService.save(userEntity);
        System.out.println("--init ok." + userEntity.getId());
        return "200";
    }
}
