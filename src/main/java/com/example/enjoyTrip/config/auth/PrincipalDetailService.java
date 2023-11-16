package com.example.enjoyTrip.config.auth;

import com.example.enjoyTrip.entity.User;
import com.example.enjoyTrip.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

// 시큐리티 설정에서 loginProcessingUrl("login");
// /login 요청이 오면 자동으로 UserDetailsService 타입으로 IoC되어있는 loadUserByUsername 함수가 실행 -> 이건 규칙임.
@Service
@RequiredArgsConstructor
public class PrincipalDetailService implements UserDetailsService {


    private final UserRepository userRepository;


    // 시큐리티 session 안에 Authentication 안에 UserDetails

    // 로그인 폼에서 input에 name 속성을 username으로 하지않으면 여기서 안받아진다. 무조건 username으로 하자! 규칙임.
    // 싫으면 SecurityConfig에서 .usernameParameter("바꿀값") 으로 바꿔줘야함.
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        System.out.println(user);
        if(user != null){
            return new PrincipalDetails(user);
        }
        return null;
    }
}
