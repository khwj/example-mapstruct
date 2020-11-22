package io.khwj.example.mapstruct.defaultvalues;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {PatientMapper.class})
public interface DoctorMapper {

  DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

  @Mapping(target = "id", constant = "-1L")
  @Mapping(source = "specialty", target = "specialization", defaultValue = "Information not available")
  @Mapping(source = "patientList", target = "patientDtoList")
  DoctorDto toDoctorDto(Doctor doctor);

}
