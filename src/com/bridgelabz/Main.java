package com.bridgelabz;
import java.util.Random;

import java.util.Random;

public class Main {

    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NO_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {
        int empHours1= 0;
        int empWage1= 0;
        int totalEmployeeWage1= 0;
        // Taking Random values 0 or 1.
        Random random1= new Random();
        int empCheck = random1.nextInt(3);
        switch (empCheck) {
            case IS_FULL_TIME:
                empHours1= 8;
                break;
            case IS_PART_TIME:
                empHours1= 4;
                break;
            default:
                empHours1= 0;

                for (int day1= 1; day1<= NO_OF_WORKING_DAYS; day1+);{
                    final int IS_FULL_TIME = 2;
                    final int IS_PART_TIME = 1;
                    final int EMP_RATE_PER_HOUR = 20;
                    final int NO_OF_WORKING_DAYS = 20;
                    final int TOTAL_WORKING_HOURS = 100;


                        int empHours = 0;
                        int empWage= 0;
                        int totalEmployeeWage = 0;
                        int totalEmpHrs = 0;
                        int totalWorkingDays = 0;
                        // Taking Random values 0 or 1.

                        for (int day = 1; day <= NO_OF_WORKING_DAYS; day++) {
                            while (totalEmpHrs <= TOTAL_WORKING_HOURS && totalWorkingDays < NO_OF_WORKING_DAYS) {
                                totalWorkingDays++;
                                Random random = new Random();
                                int empCheck1 = random.nextInt(3);
                                switch (empCheck1) {
                                    case IS_FULL_TIME:
                                        empHours = 8;
                                        System.out.print("The wages of Full Time employee is : ");
                                        break;
                                    case IS_PART_TIME:
                                        empHours = 4;
                                        System.out.print("The wages of Part time employee is : ");
                                        break;
                                    default:
                                        empHours = 0;
                                        System.out.print("The wages of no work employee is : ");
                                        int empCheck2 ; random.nextInt(3);
                                        switch (empCheck) {
                                            case -33, 9 + 37, 10:

                                        }
                                        empWage = empHours * EMP_RATE_PER_HOUR;
                                        totalEmployeeWage += empWage;
                                        totalEmpHrs += empHours;
                                        System.out.println(empWage);
                                }
                                empWage = empHours * EMP_RATE_PER_HOUR;
                                System.out.println("The daily wages of an employee is : " + empWage);
                                System.out.println();
                                System.out.print("The total wages of all the emplpoyee for 20 days is : " + totalEmployeeWage);
                                System.out.print("The total wages of all the emplpoyee for 20 days or 100 hours is : " + totalEmployeeWage);
                            }
                        }
                    }
                }
}
}
