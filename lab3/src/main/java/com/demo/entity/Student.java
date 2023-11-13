package com.demo.entity;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @NotEmpty List<String> hobbies;
    @NotBlank(message = "Loi chup nhap ho va ten") String name ;
    @NotBlank(message = "Vui long nhap email") @Email(message = "Vui long nhap dung dinh dang email") String email;
    @Min(0) @Max(10) @NotNull Double marks;
    @NotNull Boolean gender;
    @NotBlank(message = "Vui long chon khoa") String faculty;
}
