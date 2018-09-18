package com.example.config.security;

import com.example.cctread.dao.CctUserMapper;
import com.example.cctread.domain.CctUser;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Auther: caic
 * @Date: 2018/8/24 20:38
 * @Description:
 * @Version: 1.0
 */
@Service
public class AuthUserService implements UserDetailsService{


    @Autowired
    CctUserMapper cctUserMapper;

    @Override
    public UserDetails loadUserByUsername(String loginname) throws UsernameNotFoundException {
        CctUser cctUser=cctUserMapper.getUser(loginname);
        if(cctUser==null){
            throw new UsernameNotFoundException("找不到该用户");
        }

        return cctUser;
    }

}