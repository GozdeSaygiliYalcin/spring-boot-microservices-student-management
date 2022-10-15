package com.gozdesy.mapper;

import com.gozdesy.dto.request.EditStudentRequestDto;
import com.gozdesy.model.Student;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-15T15:17:42+0300",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class IStudentMapperImpl implements IStudentMapper {

    @Override
    public Student toStudent(EditStudentRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Student.StudentBuilder student = Student.builder();

        student.id( dto.getId() );
        student.firstName( dto.getFirstName() );
        student.lastName( dto.getLastName() );
        student.email( dto.getEmail() );

        return student.build();
    }
}
