package com.dummy.Flightpackage;

public class Main {
    //flight code
//    public static void main(String[] args) {
//	// write your code here
//        System.out.println("venky the man!");
//        Flight columbusBA = new Flight();
//        columbusBA.add1Passenger();
//        columbusBA.add1Passenger();
//        columbusBA.add1Passenger();
//    }

    public static void main(String[] args){
        performCalculations();
    }

    static void performCalculations() {
        double[] leftVals = {100.0d,25.0d,225.0d,11.0d};
        double[] rightVals = {50.0d,92.0d,17.0d,3.0d};
        char[] opCodes = {'d','a','s','m'};
        double[] results = new double[opCodes.length];
        for(int i=0;i<opCodes.length;i++) {
            results[i]=execute(opCodes[i],leftVals[i],rightVals[i]);
        }
        for(double currentResult : results) {
            System.out.println("result = " +  currentResult);
        }
    }

    static double execute(char opcode,double leftval,double rightval) {
        double result=0;
        switch (opcode) {
            case 'd':
                result = rightval!=0? leftval/rightval:0.0d;
                break;
            case 'a':
                result = leftval +rightval;
                break;
            case 's':
                result = leftval-rightval;
                break;
            case 'm':
                result = leftval*rightval;
                break;
            default:
                System.out.println("invalid opCode: " + opcode);
                result = 0.0d;
                break;
        }
        return result;
    }
}
