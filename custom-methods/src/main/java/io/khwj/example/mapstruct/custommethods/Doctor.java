package io.khwj.example.mapstruct.custommethods;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Doctor {
  private Long id;
  private String name;
  private Education education;
  private List<Patient> patients;
}
