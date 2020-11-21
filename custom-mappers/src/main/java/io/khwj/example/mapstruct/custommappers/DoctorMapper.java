package io.khwj.example.mapstruct.custommappers;

import java.util.List;
import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class DoctorMapper {
  static DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

  @BeforeMapping
  protected void validation(Doctor doctor) {
    if (doctor.getPatientList() == null) {
      doctor.setPatientList(List.of());
    }
  }

  @AfterMapping
  protected void updateResult(@MappingTarget DoctorDto doctorDto) {
    doctorDto.setName(doctorDto.getName().toUpperCase());
    doctorDto.setSpecialization(doctorDto.getSpecialization().toUpperCase());
  }

  @Mapping(source = "specialty", target = "specialization")
  @Mapping(source = "patientList", target = "patientDtoList")
  public abstract DoctorDto toDoctorDto(Doctor doctor);

}
