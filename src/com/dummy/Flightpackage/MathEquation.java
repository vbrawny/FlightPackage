package com.dummy.Flightpackage;


public class MathEquation {

    //represents the state of the class
    double leftVal;
    double rightVal;
    char opCode;
    double result;

    MathEquation(char opCode) {
        this.opCode = opCode;
    }

    MathEquation(char opcode,double leftval,double rightVal) {
        this(opcode);
        leftVal=leftval;
        this.rightVal = rightVal;
        //opCode = opcode;
    }
    //operations
    void execute() {
        switch (opCode) {
            case 'd':
                result = rightVal!=0? leftVal/rightVal:0.0d;
                break;
            case 'a':
                result = leftVal +rightVal;
                break;
            case 's':
                result = leftVal-rightVal;
                break;
            case 'm':
                result = leftVal*rightVal;
                break;
            default:
                System.out.println("invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }
    }


}
