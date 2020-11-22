package io.khwj.example.mapstruct.defaultvalues;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
import org.junit.jupiter.api.Test;

public class DoctorMapperTest {

  @Test
  public void shouldMapToDoctorDto() {
    // given
    var patients = List.of(new Patient(0L, "Patient Zero"), new Patient(1L, "Patient One"));
    var doctor = Doctor.builder()
      .id(0L)
      .name("Alice")
      .patientList(patients)
      .build();

    // when
    DoctorDto doctorDto = DoctorMapper.INSTANCE.toDoctorDto(doctor);

    // then
    assertNotNull(doctorDto);
    assertEquals(-1, doctorDto.getId());
    assertEquals("Information not available", doctorDto.getSpecialization());
  }
}
