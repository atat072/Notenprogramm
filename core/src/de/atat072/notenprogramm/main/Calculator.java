package de.atat072.notenprogramm.main;

public class Calculator {

    public  Calculator(){

    }
    public int average(int[] smallGrades, int bigGrade, boolean level){
        if(level){
            return average_high(smallGrades,bigGrade);
        } else {
            return average_low(smallGrades, bigGrade);
        }
    }

    public int total(int[] averages, boolean level){
        if(level){
            return total_high(averages);
        }else {
            return total_low(averages);
        }
    }

    private int average_low(int[] smallGrades, int bigGrade){
        return 0;
    }

    private int average_high(int[] smallGrades, int bigGrade){
        return 0;
    }

    private int total_low(int[] averages){
        return 0;
    }

    private int total_high(int[] averages){
        return 0;
    }
}
