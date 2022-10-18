package com.example.week4.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    //로그인 시 id로 사용할 값
    @Column(unique = true,nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private MemberRole role;

    //생성자
    public Member(String nickname, String password){
        this.nickname = nickname;
        this.password = password;
        this.role = MemberRole.MEMBER;
    }
}
