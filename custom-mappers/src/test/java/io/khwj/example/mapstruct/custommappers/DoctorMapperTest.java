package io.khwj.example.mapstruct.custommappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class DoctorMapperTest {

  @Test
  public void shouldMapToDoctorPatientSummary() {
    // given
    var doctor = new Doctor(0L, "Alice", "Doctor of Clinical Surgery");

    // when
    DoctorDto doctorDto = DoctorMapper.INSTANCE.toDoctorDto(doctor);

    // then
    assertNotNull(doctorDto);
    assertNotNull(doctorDto.getPatientDtoList());
    assertEquals(doctorDto.getName(), "ALICE");
    assertEquals(doctorDto.getSpecialization(), "DOCTOR OF CLINICAL SURGERY");
  }
}
