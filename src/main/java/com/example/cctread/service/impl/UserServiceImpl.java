package com.example.cctread.service.impl;

import com.example.cctread.dao.CctUserMapper;
import com.example.cctread.domain.CctUser;
import com.example.cctread.service.UserService;
import com.example.cctutil.bcrypt.BCryptUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: caic
 * @Date: 2018/9/6 15:58
 * @Description:
 * @Version: 1.0
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    CctUserMapper cctUserMapper;

    @Override
    public void signIn(CctUser cctUser) {
        //对密码进行加密
        cctUser.setPassword(BCryptUtil.encode(cctUser.getPassword()));
        cctUserMapper.signIn(cctUser);
    }
}
