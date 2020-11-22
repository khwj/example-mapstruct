package io.khwj.example.mapstruct.exceptionhandling;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DoctorDto {
  private int id;
  private String name;
  private String specialization;
  private String degreeName;
}
