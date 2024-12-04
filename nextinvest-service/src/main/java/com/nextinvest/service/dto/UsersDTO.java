package com.nextinvest.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersDTO {
    private Long id;

    private String first_name;

    private String last_name;

    private String email;

    private String role;
}
