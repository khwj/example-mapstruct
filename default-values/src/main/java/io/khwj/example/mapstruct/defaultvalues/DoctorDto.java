package io.khwj.example.mapstruct.defaultvalues;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DoctorDto {
  private Long id;
  private String name;
  private String specialization;
  private List<PatientDto> patientDtoList;
}
