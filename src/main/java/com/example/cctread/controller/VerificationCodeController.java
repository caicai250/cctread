package com.example.cctread.controller;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: caic
 * @Date: 2018/9/7 11:28
 * @Description:
 * @Version: 1.0
 */
@Controller
public class VerificationCodeController {

    public void getVerificationCode(HttpServletResponse response){
//        response.setDateHeader("Expires", 0);
//        // Set standard HTTP/1.1 no-cache headers.
//        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
//        // Set IE extended HTTP/1.1 no-cache headers (use addHeader).
//        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
//        // Set standard HTTP/1.0 no-cache header.
//        response.setHeader("Pragma", "no-cache");
//        // return a jpeg
//        response.setContentType("image/jpeg");
//        // create the text for the image
//        String capText = captchaProducer.createText();
//        // store the text in the session
//        //request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);
//        //将验证码存到session
//        session.setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);
//        log.info(capText);
//        // create the image with the text
//        BufferedImage bi = captchaProducer.createImage(capText);
//        ServletOutputStream out = response.getOutputStream();
//        // write the data out
//        ImageIO.write(bi, "jpg", out);
//        try {
//            out.flush();
//        } finally {
//            out.close();
//        }
    }
}
