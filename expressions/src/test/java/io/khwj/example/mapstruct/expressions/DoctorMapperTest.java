package io.khwj.example.mapstruct.expressions;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
import org.junit.jupiter.api.Test;

public class DoctorMapperTest {

  @Test
  public void shouldMapToDoctorDto() {
    // given
    var doctor = Doctor.builder()
      .id(0L)
      .name("Alice")
      .patientList(List.of())
      .build();

    // when
    DoctorDto doctorDto = DoctorMapper.INSTANCE.toDoctorDto(doctor);

    // then
    assertNotNull(doctorDto);
    assertNotNull(doctorDto.getExternalId());
    assertNotNull(doctorDto.getAvailability());
  }
}
