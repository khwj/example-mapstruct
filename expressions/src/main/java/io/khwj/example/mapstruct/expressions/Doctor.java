package io.khwj.example.mapstruct.expressions;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Doctor {
  private Long id;
  private String name;
  private String specialty;
  private String externalId;
  private LocalDateTime availability;
  private List<Patient> patientList;
}
