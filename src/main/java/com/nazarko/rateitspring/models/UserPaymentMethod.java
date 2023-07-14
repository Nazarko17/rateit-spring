package com.nazarko.rateitspring.models;

import com.nazarko.rateitspring.models.enums.UserPaymentMethodCardType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class UserPaymentMethod {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Long cardNumber;
    private String nameOnCard;
    private String dateOfExpiry;
    private String bankName;

    private UserPaymentMethodCardType userPaymentMethodCardType;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private User user;

}
