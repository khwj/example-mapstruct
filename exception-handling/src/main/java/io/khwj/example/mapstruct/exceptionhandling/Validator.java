package io.khwj.example.mapstruct.exceptionhandling;

public class Validator {

  public int validateId(int id) throws ValidationException {
    if (id == -1) {
      throw new ValidationException("Invalid ID");
    } else {
      return id;
    }
  }

}
