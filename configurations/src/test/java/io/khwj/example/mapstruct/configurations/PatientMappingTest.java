package io.khwj.example.mapstruct.configurations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

public class PatientMappingTest {

  @Test
  public void shouldMapToDto() {
    // given
    Patient patient = new Patient(0L, "patient zero", LocalDate.of(2020, 11, 19));

    // when
    PatientDto patientDto = PatientMapper.INSTANCE.toDto(patient);

    // then
    assertNotNull(patientDto);
    assertEquals(patient.getId(), patientDto.getId());
    assertEquals(patient.getName(), patientDto.getName());
    assertEquals("19/11/2020", patientDto.getDateOfBirth());
  }

  @Test
  public void shouldMapToModel() {
    // given
    PatientDto patientDto = new PatientDto(0L, "patient zero", "19/11/2020");

    // when
    Patient patient = PatientMapper.INSTANCE.toModel(patientDto);

    // then
    assertNotNull(patient);
    assertEquals(patientDto.getId(), patient.getId());
    assertEquals(patientDto.getName(), patient.getName());
    assertEquals(LocalDate.of(2020, 11, 19), patient.getDateOfBirth());
  }
}
