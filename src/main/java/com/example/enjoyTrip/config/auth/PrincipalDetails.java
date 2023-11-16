package com.example.enjoyTrip.config.auth;

// 시큐리티가 /login 주소 요청이 오면 낚아채서 로그인을 진행시킨다.
// 로그인이 완료되면 session을 만들어준다. (Security ContextHolder)에 세션 정보를 저장한다.
// session엔 저장될 오브젝트가 정해져있다 그것은 Authentication 타입 객체이다.
// Authentication 객체 안에는 User 정보가 있어야 됨.
// User 오브젝트타입 => UserDetails 타입 객체이다.

// 시큐리티의 session 영역이 있는데
// 여기에 저장될 수 있는 객체 Authentication이 있는데
// 여기에 UserDetails 타입의 User 정보가 저장된다.

import com.example.enjoyTrip.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class PrincipalDetails implements UserDetails {

    private User user; // 콤포지션?

    public PrincipalDetails(User user){
        this.user = user;
    }

    // 해당 User의 권한을 리턴하는 곳!!
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collect = new ArrayList<>();
        collect.add(new GrantedAuthority() {
            @Override
            public String getAuthority() {
                return user.getRole();
            }
        });
        return collect;
    }

    public String getRole(){
        return user.getRole();
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getName();
    }

    public int getUserId(){ return user.getUserId();}
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    // 비밀번호가 기간이 경과됐니?
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    // 계정이 활성화 되어있니?
    @Override
    public boolean isEnabled() {

        // 우리 사이트에서 1년동안 회원이 로그인을 안하면 휴면 계정으로 하기
        return true;
    }
}
