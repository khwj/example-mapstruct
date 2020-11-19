package io.khwj.example.mapstruct.differentsource;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Doctor {
  private int id;
  private String name;
  private String specialty;
  private Education education;
}
