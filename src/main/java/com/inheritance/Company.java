package com.inheritance;

import java.math.BigDecimal;

public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        try {
            if (employees == null) {
                throw new IllegalArgumentException();
            } else {
                for (Employee i : employees) {
                    if (i == null) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            this.employees = employees;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }

    }

    public void giveEverybodyBonus(BigDecimal companyBonus) {
        try {
            if (employees == null||companyBonus.doubleValue()<=0) {
                throw new IllegalArgumentException();
            } else {
                for (Employee i : employees) {
                    if (i == null) {
                        throw new IllegalArgumentException();
                    }
                }
                for (Employee i : employees) {
                    i.setBonus(companyBonus);
                }
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public BigDecimal totalToPay() {
        try {
            BigDecimal result=new BigDecimal(0);
            if (employees == null) {
                throw new IllegalArgumentException();
            } else {
                for (Employee i : employees) {
                    if (i == null) {
                        throw new IllegalArgumentException();
                    }
                }
                for (Employee i : employees) {
                    result=result.add(i.toPay());
                }
            }
            return result;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public String nameMaxSalary() {
        try {
            BigDecimal max=new BigDecimal(0);
            String result="";
            if (employees == null) {
                throw new IllegalArgumentException();
            } else {
                for (Employee i : employees) {
                    if (i == null) {
                        throw new IllegalArgumentException();
                    }
                }
                for (Employee i : employees) {
                    if(max.doubleValue()<i.toPay().doubleValue()){
                        max=i.toPay();
                        result=i.getName();
                    }
                }
            }
            return result;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
