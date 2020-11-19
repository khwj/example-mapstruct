package io.khwj.example.mapstruct.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class DoctorMapperTest {

  @Test
  public void shouldMapDoctorToDto() {
    // given
    var doctor = new Doctor(0, "Alice", "Radiology");

    // when
    var doctorDto = DoctorMapper.INSTANCE.toDto(doctor);

    // then
    assertNotNull(doctorDto);
    assertEquals(doctor.getId(), doctorDto.getId());
    assertEquals(doctor.getName(), doctorDto.getName());
    assertEquals(doctor.getSpecialty(), doctorDto.getSpecialization());
  }
}
