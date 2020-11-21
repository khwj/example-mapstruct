package io.khwj.example.mapstruct.custommappers;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Doctor {
  private Long id;
  private String name;
  private String specialty;
  private List<Patient> patientList;

  public Doctor(Long id, String name, String specialty) {
    this.id = id;
    this.name = name;
    this.specialty = specialty;
  }
}
