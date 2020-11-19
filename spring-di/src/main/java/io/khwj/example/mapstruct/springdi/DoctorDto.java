package io.khwj.example.mapstruct.springdi;

import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DoctorDto {
  private int id;
  private String name;
  private String specialization;
  private String degree;
  private List<PatientDto> patients;
}
