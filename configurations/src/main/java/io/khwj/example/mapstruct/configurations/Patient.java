package io.khwj.example.mapstruct.configurations;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Patient {
  private long id;
  private String name;
  private LocalDate dateOfBirth;
}
