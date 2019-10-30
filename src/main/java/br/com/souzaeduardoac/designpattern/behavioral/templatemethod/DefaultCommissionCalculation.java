package br.com.souzaeduardoac.designpattern.behavioral.templatemethod;

import java.util.Calendar;

class DefaultCommissionCalculation extends CommissionCalculation {
    private static final double MINIMUM_VALUE = 800.00;

    @Override
    double getComissionPercentage() {
        return 0.025;
    }

    @Override
    double discountMinimumValue(int totalSoldValue) {
        if (totalSoldValue <= MINIMUM_VALUE)
            return 0.00;
        return totalSoldValue - MINIMUM_VALUE;
    }

    @Override
    Calendar getCompanyOficialCalendar() {
        return null;
    }
}
