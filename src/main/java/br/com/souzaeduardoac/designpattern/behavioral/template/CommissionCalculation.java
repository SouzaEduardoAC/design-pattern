package br.com.souzaeduardoac.designpattern.behavioral.template;

import java.util.Calendar;

abstract class CommissionCalculation {

    double calculate(int totalSoldValue) {
        Calendar calendar = getCompanyOficialCalendar();
        double calculationBase = discountMinimumValue(totalSoldValue);
        return calculationBase * getComissionPercentage();
    }

    abstract double getComissionPercentage();

    abstract double discountMinimumValue(int totalSoldValue);

    abstract Calendar getCompanyOficialCalendar();
}
