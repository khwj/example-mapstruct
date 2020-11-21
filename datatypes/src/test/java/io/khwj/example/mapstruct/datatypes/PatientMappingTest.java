package io.khwj.example.mapstruct.datatypes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

public class PatientMappingTest {

  @Test
  public void shouldMapToPatientDto() {
    // given
    Patient patient = new Patient(0L, "patient zero", LocalDate.of(2020, 11, 17));

    // when
    PatientDto patientDto = PatientMapper.INSTANCE.toDto(patient);

    // then
    assertNotNull(patientDto);
    assertEquals(patient.getId(), patientDto.getId());
    assertEquals("17/11/2020", patientDto.getDateOfBirth());
  }
}
