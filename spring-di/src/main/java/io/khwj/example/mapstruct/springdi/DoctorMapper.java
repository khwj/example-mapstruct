package io.khwj.example.mapstruct.springdi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {PatientMapper.class}, componentModel = "spring")
public interface DoctorMapper {
  @Mapping(source = "doctor.specialty", target = "specialization")
  @Mapping(source = "education.degreeName", target = "degree")
  @Mapping(source = "doctor.patientList", target = "patients")
  DoctorDto toDto(Doctor doctor, Education education);

}
