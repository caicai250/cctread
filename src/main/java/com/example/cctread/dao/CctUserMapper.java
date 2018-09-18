package com.example.cctread.dao;

import com.example.cctread.domain.CctUser;

/**
 * @Auther: caic
 * @Date: 2018/8/27 18:09
 * @Description:
 * @Version: 1.0
 */
public interface CctUserMapper {
    CctUser getUser(String loginName);
    void signIn(CctUser cctUser);
}
