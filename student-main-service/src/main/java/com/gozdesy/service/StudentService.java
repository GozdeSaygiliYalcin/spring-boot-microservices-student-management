package com.gozdesy.service;

import com.gozdesy.dto.request.EditStudentRequestDto;
import com.gozdesy.dto.request.NewStudentCreateDto;
import com.gozdesy.mapper.IStudentMapper;
import com.gozdesy.model.Student;
import com.gozdesy.repository.IStudentRepository;
import com.gozdesy.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService extends ServiceManager<Student, String> {

    private final IStudentRepository studentRepository;

    public StudentService(IStudentRepository studentRepository) {
        super(studentRepository);
        this.studentRepository = studentRepository;
    }

    public Student createStudent(NewStudentCreateDto dto) {
        return save(Student.builder()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .build());
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id).get();
    }




}
