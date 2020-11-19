package io.khwj.example.mapstruct.javacdi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import javax.inject.Inject;
import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class DoctorMapperTest {

  @Inject
  private DoctorMapper doctorMapper;

  @Test
  public void doctorMapperIsInjected() {
    assertNotNull(doctorMapper);
  }

  @Test
  public void shouldMapToDto() {
    // given
    var doctor = new Doctor(0, "Alice", "Doctor of Medicine");

    // when
    var doctorDto = doctorMapper.toDto(doctor);

    // then
    assertNotNull(doctorDto);
    assertEquals(doctor.getId(), doctorDto.getId());
    assertEquals(doctor.getName(), doctorDto.getName());
    assertEquals(doctor.getSpecialty(), doctorDto.getSpecialization());
  }

}
