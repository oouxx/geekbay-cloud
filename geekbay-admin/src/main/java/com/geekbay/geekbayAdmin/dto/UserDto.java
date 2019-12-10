package com.geekbay.geekbayAdmin.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String mobile;
    private Date birth;
    private String avatar;
    private String email;
    private String personalSign;
}