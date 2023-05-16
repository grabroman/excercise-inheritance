package com.inheritance;

import java.math.BigDecimal;

public class Manager extends Employee {
    private final int clientAmount;

    public Manager(String name, BigDecimal salary, int clientAmount) {
        super(name, salary);
        try {
            if (clientAmount < 0) {
                throw new IllegalArgumentException();
            } else {
                this.clientAmount = clientAmount;
            }
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        try {
            if (0 > bonus.doubleValue()) {
                throw new IllegalArgumentException();
            }
            if (clientAmount > 150) {
                super.setBonus(bonus.add(BigDecimal.valueOf(1000)));
            } else if (clientAmount > 100) {
                super.setBonus(bonus.add((BigDecimal.valueOf(500))));
            }else {
                super.setBonus(bonus);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }

    }

    @Override
    public BigDecimal toPay() {
        return super.toPay();
    }

    public int getClientAmount() {
        return clientAmount;
    }
}
