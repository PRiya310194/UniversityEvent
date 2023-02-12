package com.example.universityEvent.model;

import lombok.*;
import org.springframework.stereotype.Service;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    int studentId;
    String firstName;
    String lastName;
    int age;
    String department;

}
