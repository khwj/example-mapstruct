package io.khwj.example.mapstruct.springdi;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class Doctor {
  private int id;
  private String name;
  private String specialty;
  private Education education;
  private List<Patient> patientList;
}
