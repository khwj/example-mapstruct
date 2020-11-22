package io.khwj.example.mapstruct.defaultvalues;

import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Doctor {
  private Long id;
  private String name;
  private String specialty;
  private List<Patient> patientList;
}
