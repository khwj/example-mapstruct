package io.khwj.example.mapstruct.configurations;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PatientDto {
  private Long id;
  private String name;
  private String dateOfBirth;
}
