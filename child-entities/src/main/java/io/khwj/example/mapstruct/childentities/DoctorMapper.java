package io.khwj.example.mapstruct.childentities;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {PatientMapper.class})
public interface DoctorMapper {
  DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

  @Mapping(source = "doctor.patientList", target = "patientDtoList")
  DoctorDto toDto(Doctor doctor);
}
