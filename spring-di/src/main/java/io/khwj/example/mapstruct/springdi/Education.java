package io.khwj.example.mapstruct.springdi;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Education {
  private String degreeName;
  private String institution;
  private int yearOfPassing;
}
