package com.springdemo.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class CreditAccount extends Account{

    BigDecimal creditList;
}
