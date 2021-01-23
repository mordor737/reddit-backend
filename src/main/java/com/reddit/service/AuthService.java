package com.reddit.service;

import com.reddit.controller.dto.RegisterRequest;
import com.reddit.model.User;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public void signup(RegisterRequest regReq){
        User user=new User();
        user.setUsername(regReq.getUsername());
    }
}
