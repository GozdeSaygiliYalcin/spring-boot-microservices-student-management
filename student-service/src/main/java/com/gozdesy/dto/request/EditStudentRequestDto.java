package com.gozdesy.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class EditStudentRequestDto {

    String id;
    String firstName;
    String lastName;
    String email;
}
