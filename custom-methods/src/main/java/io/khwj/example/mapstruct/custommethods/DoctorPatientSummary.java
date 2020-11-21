package io.khwj.example.mapstruct.custommethods;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DoctorPatientSummary {
  private Long doctorId;
  private String doctorName;
  private long patientCount;
  private String institution;
  private String specialization;
}
