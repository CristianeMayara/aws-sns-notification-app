package com.ferreira.notificationapp.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Proposal {

    private Long id;

    private Double requestedAmount;

    private int paymentDeadline;

    private Boolean isApproved;

    private Boolean isIntegrated;

    private String observation;

    private User user;
}
