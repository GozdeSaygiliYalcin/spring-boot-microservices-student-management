package com.gozdesy.controller;


import com.gozdesy.dto.request.EditStudentRequestDto;
import com.gozdesy.dto.request.NewStudentCreateDto;
import com.gozdesy.exception.ErrorType;
import com.gozdesy.exception.StudentException;
import com.gozdesy.model.Student;
import com.gozdesy.service.StudentService;
import com.gozdesy.utility.JwtTokenManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.Optional;

import static com.gozdesy.constants.ApiUrl.*;

@RestController
@RequestMapping(BASE_URL+STUDENT)
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping(NEW_CREATE_STUDENT)
    public ResponseEntity<Boolean> newUserCreate(@RequestBody @Valid NewStudentCreateDto dto) {
        try {
            studentService.createStudent(dto);
            return ResponseEntity.ok(true);
        } catch (Exception exception) {
            throw new StudentException(ErrorType.STUDENT_DOESNT_CREATED);
        }
    }

    @PostMapping(UPDATE_STUDENT)
    public Student updateStudent(@RequestBody @Valid EditStudentRequestDto dto) {

        Student existingStudent = studentService.getStudentById(dto.getId());
        existingStudent.setFirstName(dto.getFirstName());
        existingStudent.setLastName(dto.getLastName());
        existingStudent.setEmail(dto.getEmail());

        return studentService.updateStudent(existingStudent);
    }

}
