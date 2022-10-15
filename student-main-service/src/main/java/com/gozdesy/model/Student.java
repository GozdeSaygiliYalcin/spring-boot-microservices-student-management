package com.gozdesy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
@Document
public class Student implements Serializable {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
