package io.khwj.example.mapstruct.springdi;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper {
  PatientDto toDto(Patient patient);
}
