package io.khwj.example.mapstruct.basic;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DoctorMapper {

  DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

  @Mapping(source = "doctor.specialty", target = "specialization")
  DoctorDto toDto(Doctor doctor);
}
