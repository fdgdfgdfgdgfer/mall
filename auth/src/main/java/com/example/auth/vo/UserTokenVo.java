package com.example.auth.vo;

import lombok.Data;

@Data
public class UserTokenVo {

    private String userName;

    private String accessToken;

    private String refreshToken;

    private String expire;
}
