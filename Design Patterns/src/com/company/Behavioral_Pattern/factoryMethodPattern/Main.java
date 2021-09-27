package com.company.Behavioral_Pattern.factoryMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        GetPlanFactory getPlanFactory = new GetPlanFactory();
        System.out.println("Enter the plan");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planType = br.readLine();
        int units = Integer.parseInt(br.readLine());
        Plan p = getPlanFactory.getPlan(planType);
        p.getRate();
        p.calculateBill(units);
    }
}
