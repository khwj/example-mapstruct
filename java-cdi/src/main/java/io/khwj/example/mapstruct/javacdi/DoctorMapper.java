package io.khwj.example.mapstruct.javacdi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi")
public interface DoctorMapper {

  @Mapping(source = "doctor.specialty", target = "specialization")
  DoctorDto toDto(Doctor doctor);

}
