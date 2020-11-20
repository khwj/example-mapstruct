package io.khwj.example.mapstruct.enums;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PaymentTypeMapper {
  PaymentTypeMapper INSTANCE = Mappers.getMapper(PaymentTypeMapper.class);

  @ValueMapping(source = "CARD_VISA", target = "CARD")
  @ValueMapping(source = "CARD_MASTER", target = "CARD")
  @ValueMapping(source = MappingConstants.ANY_REMAINING, target = "CARD")
  PaymentTypeView toPaymentTypeView(PaymentType type);
}
