package com.employeepayroll.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public @ToString class EmployeeDTO {

    @NotEmpty(message = "Name is required and cannot be empty")
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "Name must start with a capital letter and have at least 3 characters")
    private String name;

    @Min(value = 500, message = "Minimum wage should be more than 500")
    private double salary;

    @Pattern(regexp = "^(male|female)$", message = "Gender needs to be male or female")
    private String gender;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @NotNull (message = "startDate should not be empty")
    @PastOrPresent (message = "startDate should be past or today date")
    private LocalDate startDate;

    @NotBlank(message = "Note cannot be Empty")
    private String note;

    @NotBlank (message = "Profile pic cannot be Empty")
    private String profilePic;

    @NotNull(message = "department should not be empty")
    private List<String> department;
}