package io.khwj.example.mapstruct.javacdi;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DoctorDto {
  private int id;
  private String name;
  private String specialization;
}
