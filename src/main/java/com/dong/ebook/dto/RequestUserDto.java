package com.dong.ebook.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
public class RequestUserDto {
    private Long id;
    private String username;
    private String password;
    private String newPassword;
    private String sex;
    private String email;
    private String phoneNumber;
    private String introduction;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String role;
    private String nickname;
    private Boolean islock;
    private String avatar;
}
