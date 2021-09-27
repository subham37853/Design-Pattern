package com.company.Behavioral_Pattern.factoryMethodPattern;

public class CommercialPlan extends Plan{
    @Override
    void getRate() {
        super.rate = 5.50;
    }
}
