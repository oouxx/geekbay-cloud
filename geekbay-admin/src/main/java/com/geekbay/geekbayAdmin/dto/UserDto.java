package com.geekbay.geekbayAdmin.dto;

import java.util.Date;

import lombok.Data;

@Data
public class UserDto {
    private String mobile;
    private Date birth;
    private String avatar;
    private String email;
    private String personalSign;
}