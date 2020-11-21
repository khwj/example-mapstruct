package io.khwj.example.mapstruct.custommethods;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DoctorMapper {

  DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

  default DoctorPatientSummary toDoctorPatientSummary(Doctor doctor) {
    return DoctorPatientSummary.builder()
      .doctorId(doctor.getId())
      .doctorName(doctor.getName())
      .patientCount(doctor.getPatients().stream().count())
      .institution(doctor.getEducation().getInstitution())
      .specialization(doctor.getEducation().getDegreeName())
      .build();
  }

}
