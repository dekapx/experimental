package com.kapx.sprintboot.kafka.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Contact {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
}
