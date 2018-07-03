package com.example.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: caic
 * @Date: 2018/6/28 15:21
 * @Description:
 * @Version: 1.0
 */
public class CctReadInterceptor implements HandlerInterceptor {

    private static final Logger log = LoggerFactory.getLogger(CctReadInterceptor.class);

    /**
     * 在请求处理之前进行调用（Controller方法调用之前)
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
       //System.out.printf("preHandle被调用");
        log.debug("------------拦截器，Controller方法调用之前----------------");
        return true;    //如果false，停止流程，api被拦截
    }

    /**
     * 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        log.debug("------------url="+httpServletRequest.getRequestURI()+"------------");
        if(modelAndView!=null)modelAndView.getModelMap().addAttribute("title", "常春藤阅读");
        log.debug("------------拦截器，Controller方法调用之后----------------");
    }

    /**
     * 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        //System.out.println("afterCompletion被调用");
        log.debug("------------拦截器，在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）----------------");
    }
}
