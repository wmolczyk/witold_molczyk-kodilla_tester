package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a=5;
        int b=8;
        int sumResult = calculator.Sum(a,b);
        boolean correct = ResultChecker.assertEquals(13,sumResult);
        if(correct){
            System.out.println("ok");
        } else {System.out.println("fuk no");}
        int subResult = calculator.Sub(a,b);
        boolean correctSub = ResultChecker.assertEquals(-3,subResult);
        if(correctSub){
            System.out.println("sub ok");
        }else{System.out.println("fuk no - something wrong with sub");}
        double powerResult = calculator.Power(a);
        boolean correctPower = ResultChecker.assertEqualsPower(25.0,powerResult);
        if(correctPower){
            System.out.println("power result ok");}
        else{System.out.println("fuk power result is wrong");
        }
    }
}
