package com.inheritance;

import java.math.BigDecimal;
import java.util.Arrays;

public class Employee {
    private final String name;
    private final BigDecimal salary;
    private BigDecimal bonus;

    public Employee(String name, BigDecimal salary) {
        try {
            if (0 > salary.doubleValue() || name==null||name.isBlank()) {
                throw new IllegalArgumentException();
            } else {
                this.salary = salary;
                this.name = name;
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Employee(String name, BigDecimal salary, BigDecimal bonus) {
        try {
            if (0 > bonus.doubleValue() || 0 > salary.doubleValue() || name==null||name.contains(" ")||name.matches("")) {
                throw new IllegalArgumentException();
            } else {
                this.salary = salary;
                this.bonus = bonus;
                this.name = name;
            }
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    public void setBonus(BigDecimal bonus) {
        try {
            if (0 >= bonus.doubleValue()) {
                throw new IllegalArgumentException();
            } else {
                this.bonus = bonus;
            }
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    public BigDecimal toPay() {

        String[] splitter = bonus.toString().split("\\.");

        if(splitter.length>1){
            return salary.add(BigDecimal.valueOf(bonus.doubleValue()));
        }else{
            return salary.add(BigDecimal.valueOf(bonus.intValue()));
        }
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
