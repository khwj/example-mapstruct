package io.khwj.example.mapstruct.exceptionhandling;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DoctorMapperTest {

  @Test
  public void shouldThrowValidationException() {
    // given
    var doctor = new Doctor(-1, "Alice", "Radiology");

    // when
    var exception =
        assertThrows(ValidationException.class, () -> DoctorMapper.INSTANCE.toDto(doctor));

    // then
    assertTrue(exception.getMessage().contains("Invalid ID"));
  }

  @Test
  public void shouldMapToDto() {
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
