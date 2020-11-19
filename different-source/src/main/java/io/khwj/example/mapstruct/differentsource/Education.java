package io.khwj.example.mapstruct.differentsource;

public class Education {
  private String degreeName;
  private String institution;
  private int yearPassing;

  public Education(String degreeName, String institution, int yearPassing) {
    this.degreeName = degreeName;
    this.institution = institution;
    this.yearPassing = yearPassing;
  }

  public String getDegreeName() {
    return degreeName;
  }

  public String getInstitution() {
    return institution;
  }

  public int getYearPassing() {
    return yearPassing;
  }
}
