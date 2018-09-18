package com.example.cctutil.session;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.HashSet;

/**
 * @Auther: caic
 * @Date: 2018/7/31 09:26
 * @Description:
 * @Version: 1.0
 */
@WebListener
public class SessionListener implements HttpSessionListener {


    public void sessionCreated(HttpSessionEvent arg0) {
// TODO Auto-generated method stub
        ServletContext context = arg0.getSession().getServletContext();
        if (context.getAttribute("count")==null) {
            context.setAttribute("count", 0);
        }else {
            int count = (Integer) context.getAttribute("count");
            context.setAttribute("count", count+1);
        }
        System.out.println("create:"+context.getAttribute("count"));
    }


    public void sessionDestroyed(HttpSessionEvent arg0) {
// TODO Auto-generated method stub
        ServletContext context = arg0.getSession().getServletContext();
        if (context.getAttribute("count")==null) {
            context.setAttribute("count", 0);
        }else {
            int count = (Integer) context.getAttribute("count");
            if (count<1) {
                count = 1;
            }
            context.setAttribute("count", count-1);
        }
        HttpSession session = arg0.getSession();
        String name = (String) session.getAttribute("name");
        HashSet<String> nameSet = (HashSet<String>) context.getAttribute("nameSet");
        nameSet.remove(name);
        System.out.println("Destroyed:"+context.getAttribute("count"));
    }
}
