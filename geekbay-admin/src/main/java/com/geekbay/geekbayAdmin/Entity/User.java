package com.geekbay.geekbayAdmin.Entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private long id;
    private String mobile;
    private Date birth;
    private String avatar;
    private String email;
    private String personalSign;
}
