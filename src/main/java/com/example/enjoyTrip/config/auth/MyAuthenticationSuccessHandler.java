package com.example.enjoyTrip.config.auth;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;

@Component
public class MyAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,Authentication authentication)
            throws IOException, ServletException {
        // 사용자 정보와 로그인 성공 여부를 JSON 형태로 클라이언트로 전송
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        int userId = ((PrincipalDetails) authentication.getPrincipal()).getUserId();
        String role = ((PrincipalDetails) authentication.getPrincipal()).getRole();
        String email = ((PrincipalDetails) authentication.getPrincipal()).getEmail();
        String phoneNum = ((PrincipalDetails) authentication.getPrincipal()).getPhoneNum();
        Timestamp registerTime = ((PrincipalDetails) authentication.getPrincipal()).getRegisterTime();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

//        out.print("{\"success\": true, \"userId\": " + userId + ", \"userName\":\"" + authentication.getName() + "\", \"role\":\"" + role + "\"}");
        out.print("{\"success\": true, \"userId\": " + userId +
                ", \"userName\":\"" + authentication.getName() +
                "\", \"role\":\"" + role +
                "\", \"email\":\"" + email +
                "\", \"phoneNum\":\"" + phoneNum +
                "\", \"registerTime\":\"" + registerTime +
                "\"}");
        out.flush();
    }
}
