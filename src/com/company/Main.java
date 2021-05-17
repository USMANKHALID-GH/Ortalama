package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// calculating the average of numbers and comparing them
        Scanner input = new Scanner(System.in);
        double math, phy, java;
        System.out.println("enter the marks for math");
        math= input.nextDouble();
        System.out.println("enter the marks for phy");
        phy=input.nextDouble();
        System.out.println("enter the marks for java");
        java= input.nextDouble();
        double total=math+phy+java;
        double average=total/3; //3 because there are only 3 courses
        if(average>60){
            System.out.println("sinifi gecti");
        }
        else{
            System.out.println("sinifta kaldi");
        }
    }
}
