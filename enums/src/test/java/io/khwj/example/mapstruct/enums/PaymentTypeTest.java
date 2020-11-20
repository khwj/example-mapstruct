package io.khwj.example.mapstruct.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PaymentTypeTest {
  @Test
  public void shouldMapToPaymentTypeView() {
    // when
    var cashView = PaymentTypeMapper.INSTANCE.toPaymentTypeView(PaymentType.CASH);
    var chequeView = PaymentTypeMapper.INSTANCE.toPaymentTypeView(PaymentType.CHEQUE);
    var visaCardView = PaymentTypeMapper.INSTANCE.toPaymentTypeView(PaymentType.CARD_VISA);
    var masterCardView = PaymentTypeMapper.INSTANCE.toPaymentTypeView(PaymentType.CARD_MASTER);
    var creditCardView = PaymentTypeMapper.INSTANCE.toPaymentTypeView(PaymentType.CARD_CREDIT);

    // then
    assertEquals(PaymentTypeView.CASH, cashView);
    assertEquals(PaymentTypeView.CHEQUE, chequeView);
    assertEquals(PaymentTypeView.CARD, visaCardView);
    assertEquals(PaymentTypeView.CARD, masterCardView);
    assertEquals(PaymentTypeView.CARD, creditCardView);
  }
}
