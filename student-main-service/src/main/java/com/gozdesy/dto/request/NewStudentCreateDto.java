package com.gozdesy.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class NewStudentCreateDto {

    String firstName;
    String lastName;
    String email;

}
