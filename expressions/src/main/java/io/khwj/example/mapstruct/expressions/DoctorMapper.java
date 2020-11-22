package io.khwj.example.mapstruct.expressions;

import java.time.LocalDateTime;
import java.util.UUID;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {PatientMapper.class}, imports = {UUID.class, LocalDateTime.class})
public interface DoctorMapper {

  DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

  @Mapping(target = "availability", defaultExpression = "java(LocalDateTime.now())")
  @Mapping(target = "externalId", expression = "java(UUID.randomUUID().toString())")
  @Mapping(source = "specialty", target = "specialization")
  @Mapping(source = "patientList", target = "patientDtoList")
  DoctorDto toDoctorDto(Doctor doctor);

}
