package io.khwj.example.mapstruct.differentsource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class DoctorMapperTest {

  @Test
  public void shouldMapDoctorToDto() {
    var phD = new Education("Doctor of Medicine", "Harvard School of Medicine", 6);
    var doctor = new Doctor(0, "Alice", "Radiology", phD);

    // when
    var doctorDto = DoctorMapper.INSTANCE.toDto(doctor, phD);

    // then
    assertNotNull(doctorDto);
    assertEquals(doctor.getId(), doctorDto.getId());
    assertEquals(doctor.getName(), doctorDto.getName());
    assertEquals(doctor.getSpecialty(), doctorDto.getSpecialization());
    assertEquals(doctor.getEducation().getDegreeName(), doctorDto.getDegreeName());
  }
}
