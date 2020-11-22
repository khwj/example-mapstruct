package io.khwj.example.mapstruct.exceptionhandling;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {Validator.class})
public interface DoctorMapper {

  DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

  @Mapping(source = "doctor.specialty", target = "specialization")
  DoctorDto toDto(Doctor doctor) throws ValidationException;
}
