package io.khwj.example.mapstruct.childentities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
import org.junit.jupiter.api.Test;

public class DoctorMapperTest {
  @Test
  public void shouldMapDoctorToDto() {
    // given
    List<Patient> patients = List.of(new Patient(0, "patient zero"), new Patient(1, "patient one"));
    Doctor doctor = new Doctor(0, "Alice", patients);

    // when
    DoctorDto doctorDto = DoctorMapper.INSTANCE.toDto(doctor);

    // then
    assertNotNull(doctorDto);
    assertNotNull(doctorDto.getPatientDtoList());
  }

  @Test
  public void shouldMapPatientToDto() {
    // given
    Patient patient = new Patient(0, "patient zero");

    // when
    PatientDto patientDto = PatientMapper.INSTANCE.toDto(patient);

    // then
    assertNotNull(patientDto);
    assertEquals(patient.getId(), patientDto.getId());
    assertEquals(patient.getName(), patientDto.getName());
  }
}
