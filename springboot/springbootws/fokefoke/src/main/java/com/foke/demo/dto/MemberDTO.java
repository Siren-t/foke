package com.foke.demo.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "member")
@Entity
public class MemberDTO {
	
	// 회원 기본 정보
    @Id
    private String memberId;

    @Column(length = 200)
    private String memberPw;
    
    @Column(length = 200)
    private String memberName;

    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birth;

    @Column
    private String phone;
    
    // 0:여자 1:남자
    @Column
    private int sex;
    
    
    // 관리자 구분(0:일반사용자, 1:관리자)
    // 근데 쓸지 모르겠음
    @Column
    private int adminCk;
    
    
    // 마케팅 동의 여부(0:false, 1:true)
    @Column
    private int consentPush;
    
    @Column
    private int consentEmail;
    
    @Column
    private int consentSMS;
    
    
    // 예비 변수
    @Column
    private int money;
    
    @Column
    private int point;
    
}