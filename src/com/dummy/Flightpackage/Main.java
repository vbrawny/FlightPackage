package com.dummy.Flightpackage;

public class Main {
    //flight code
    public static void main(String[] args) {
	// write your code here
        System.out.println("venky the man!");
        Flight columbusBA = new Flight("British Airways",2,1);
        Flight newyorkVA = new Flight("Virgin Atlantic",1,1);
        Flight lax3=null;
        columbusBA.setSeats(200);
        columbusBA.add1Passenger();
        columbusBA.add1Passenger();
        newyorkVA.add1Passenger();
        newyorkVA.add1Passenger();

        if(columbusBA.hasRoom(newyorkVA)) {
            lax3 = columbusBA.createNewWithBoth(newyorkVA);
        }
        if(lax3!=null) {
            System.out.println("flights combined:");
            lax3.add1Passenger();
        }
        System.out.println("count: " + lax3.getSeats());
//        for(int i=0;i<=150;i++) {
//            columbusBA.add1Passenger();
////            columbusBA.add1Passenger();
////            columbusBA.add1Passenger();
//        }
//        newyorkVA.add1Passenger();
//        newyorkVA.add1Passenger();
//        newyorkVA.add1Passenger();
//        newyorkVA = columbusBA;
//        newyorkVA.add1Passenger();
    }

//    public static void main(String[] args){
//        performCalculations();
//    }

    static void performCalculations() {
        double[] leftVals = {100.0d,25.0d,225.0d,11.0d};
        double[] rightVals = {50.0d,92.0d,17.0d,3.0d};
        char[] opCodes = {'d','a','s','m'};
        double[] results = new double[opCodes.length];
        for(int i=0;i<opCodes.length;i++) {
            //PRIOR MOVING TO A CLASS FILE
//            results[i]=  execute(opCodes[i],leftVals[i],rightVals[i]);
            MathEquation mathResult = new MathEquation(opCodes[i],leftVals[i],rightVals[i]);
            mathResult.execute();
            results[i] = mathResult.result;
        }
        for(double currentResult : results) {
            System.out.println("result = " +  currentResult);
        }
    }

    //PRIOR MOVING TO A CLASS FILE
//    static double execute(char opcode,double leftval,double rightval) {
//        double result=0;
//        switch (opcode) {
//            case 'd':
//                result = rightval!=0? leftval/rightval:0.0d;
//                break;
//            case 'a':
//                result = leftval +rightval;
//                break;
//            case 's':
//                result = leftval-rightval;
//                break;
//            case 'm':
//                result = leftval*rightval;
//                break;
//            default:
//                System.out.println("invalid opCode: " + opcode);
//                result = 0.0d;
//                break;
//        }
//        return result;
//    }
}
