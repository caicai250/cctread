package com.example.cctread;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Auther: caic
 * @Date: 2018/9/6 14:34
 * @Description:
 * @Version: 1.0
 */
public class BCryptTest {
    public static void main(String[] args){
        String password="jingyuandi";
        // Hash a password for the first time
        String hashed = BCrypt.hashpw(password, BCrypt.gensalt());

        System.out.println("hashed:"+hashed);

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);
        System.out.println("hashedPassword:"+hashedPassword+" "+hashedPassword.length());

        // gensalt's log_rounds parameter determines the complexity
        // the work factor is 2**log_rounds, and the default is 10
        String hashed2 = BCrypt.hashpw(password, BCrypt.gensalt(12));

        System.out.println("hashed2:"+hashed2);

        // Check that an unencrypted password matches one that has
        // previously been hashed
        if (BCrypt.checkpw(password, hashed))
            System.out.println("It matches");
        else
            System.out.println("It does not match");
    }
}
