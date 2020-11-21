package io.khwj.example.mapstruct.custommappers;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DoctorDto {
  private Long id;
  private String name;
  private String specialization;
  private List<PatientDto> patientDtoList;
}
