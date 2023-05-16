package com.inheritance;

import java.math.BigDecimal;

public class SalesPerson extends Employee {
    private final int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        try {
            if (percent < 0) {
                throw new IllegalArgumentException();
            } else {
                this.percent = percent;
            }
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        try {
            if (0 >= bonus.doubleValue()) {
                throw new IllegalArgumentException();
            }
            if (percent > 200) {
                super.setBonus(bonus.multiply(BigDecimal.valueOf(3)));
            } else if (percent > 100) {
                super.setBonus(bonus.multiply(BigDecimal.valueOf(2)));
            }else {
                super.setBonus(bonus);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }

    }

    public int getPercent() {
        return percent;
    }
}
