package com.employeepayroll.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO {

    @NotEmpty(message = "Name is required and cannot be empty")
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "Name must start with a capital letter and have at least 3 characters")
    private String name;

    private double salary;

    public EmployeeDTO() {}

    public EmployeeDTO(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}