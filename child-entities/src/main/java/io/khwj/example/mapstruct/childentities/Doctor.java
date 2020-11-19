package io.khwj.example.mapstruct.childentities;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Doctor {
  private int id;
  private String name;
  private List<Patient> patientList;
}
