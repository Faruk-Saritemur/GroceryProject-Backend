package com.example.grocery.webApi.responses.employee;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetByIdEmployeeResponse {

    private int id;

    private String email;

    private String password;

    private LocalDateTime createdDateTime;

    private LocalDateTime updatedDateTime;

    private boolean isActive;

    private String firstName;

    private String lastName;

    private String nationalIdentity;

    private LocalDate yearOfBirth;

    private double salary;
}
