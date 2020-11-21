package io.khwj.example.mapstruct.datatypes;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PatientMapper {
  PatientMapper INSTANCE = Mappers.getMapper(PatientMapper.class);

  @Mapping(source = "dateOfBirth", target = "dateOfBirth", dateFormat = "dd/MM/YYYY")
  PatientDto toDto(Patient patient);
}
