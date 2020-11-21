package io.khwj.example.mapstruct.custommethods;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
import org.junit.jupiter.api.Test;

public class DoctorMapperTest {

  @Test
  public void shouldMapToDoctorPatientSummary() {
    // given
    var education = new Education("Doctor of Clinical Surgery", "Harvard School of Medicine");
    var patients = List.of(new Patient(0L, "Patient Zero"), new Patient(1L, "Patient One"));
    var doctor = new Doctor(0L, "Alice", education, patients);

    // when
    DoctorPatientSummary summary = DoctorMapper.INSTANCE.toDoctorPatientSummary(doctor);

    // then
    assertNotNull(summary);
    assertEquals(summary.getDoctorId(), doctor.getId());
    assertEquals(summary.getDoctorName(), doctor.getName());
    assertEquals(summary.getPatientCount(), patients.size());
    assertEquals(summary.getInstitution(), education.getInstitution());
    assertEquals(summary.getSpecialization(), education.getDegreeName());
  }
}
