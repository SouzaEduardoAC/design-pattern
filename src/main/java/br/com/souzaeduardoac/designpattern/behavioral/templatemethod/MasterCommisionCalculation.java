package br.com.souzaeduardoac.designpattern.behavioral.templatemethod;

import java.util.Calendar;

class MasterCommisionCalculation extends CommissionCalculation {
    @Override
    double getComissionPercentage() {
        return 0.10;
    }

    @Override
    double discountMinimumValue(int totalSoldValue) {
        return totalSoldValue;
    }

    @Override
    Calendar getCompanyOficialCalendar() {
        return null;
    }
}
