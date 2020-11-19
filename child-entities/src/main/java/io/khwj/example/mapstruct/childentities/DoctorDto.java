package io.khwj.example.mapstruct.childentities;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DoctorDto {
  private int id;
  private String name;
  private List<PatientDto> patientDtoList;
}
