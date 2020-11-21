package io.khwj.example.mapstruct.custommappers;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Patient {
  private Long id;
  private String name;
}
