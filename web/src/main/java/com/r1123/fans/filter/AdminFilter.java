package com.r1123.fans.filter;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by helloqdz on 2018/10/23.
 */
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class AdminFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if (request.getMethod().equals(RequestMethod.OPTIONS.toString())) {
            System.out.println("-adminFilter 拦截- option 请求");
            return;
        }
        HttpSession session = request.getSession();
        System.out.println("-adminFilter 拦截- session id:" + session.getId());
        String o = request.getHeader("Origin");
        response.setHeader("Access-Control-Allow-Origin", o);
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods", "POST,GET,PUT,DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Connection, User-Agent, Cookie");

        if (request.getParameter("JSESSIONID") != null) {
            //Cookie userCookie = new Cookie("JSESSIONID", request.getParameter("JSESSIONID"));
            //response.addCookie(userCookie);
        } else {
            String sessionId = session.getId();
            Cookie userCookie = new Cookie("JSESSIONID", sessionId);
            response.addCookie(userCookie);
        }
        filterChain.doFilter(request, response);
    }
}
