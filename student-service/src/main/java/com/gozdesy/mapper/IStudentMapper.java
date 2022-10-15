package com.gozdesy.mapper;


import com.gozdesy.dto.request.EditStudentRequestDto;
import com.gozdesy.model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IStudentMapper {

    IStudentMapper INSTANCE = Mappers.getMapper(IStudentMapper.class);
    Student toStudent (final EditStudentRequestDto dto);
}
