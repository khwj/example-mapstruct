package io.khwj.example.mapstruct.expressions;

import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DoctorDto {
  private final Long id;
  private final String name;
  private final String specialization;
  private final String externalId;
  private final LocalDateTime availability;
  private final List<PatientDto> patientDtoList;
}
