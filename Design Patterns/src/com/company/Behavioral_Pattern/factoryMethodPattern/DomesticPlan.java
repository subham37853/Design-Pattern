package com.company.Behavioral_Pattern.factoryMethodPattern;

public class DomesticPlan extends Plan{
    @Override
    void getRate() {
        super.rate = 3.50;
    }
}
