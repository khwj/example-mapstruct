package io.khwj.example.mapstruct.springdi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DoctorMapperTest {

  @Autowired
  private DoctorMapper doctorMapper;

  @Test
  public void shouldMapDoctorToDoctorDto() {
    // given
    Education phD = new Education("PhD", "Harvard School of Medicine", 6);
    List<Patient> patients = List.of(new Patient(0, "Patient 0"), new Patient(1, "Patient 1"));
    Doctor doctor = Doctor.builder()
      .id(1)
      .name("Alice")
      .specialty("Radiology")
      .education(phD)
      .patientList(patients)
      .build();

    // when
    DoctorDto doctorDto = doctorMapper.toDto(doctor, doctor.getEducation());

    // then
    assertNotNull(doctorDto);
    assertEquals(doctor.getId(), doctorDto.getId());
    assertEquals(doctor.getName(), doctorDto.getName());
    assertEquals(doctor.getSpecialty(), doctorDto.getSpecialization());
    assertEquals(doctor.getEducation().getDegreeName(), doctorDto.getDegree());
    assertEquals(doctor.getPatientList().size(), doctorDto.getPatients().size());
  }

}
