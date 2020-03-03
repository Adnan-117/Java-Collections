package com.collections;

public class Staircase {

	public static void main(String[] args) {
        staircase(6);
	}

	private static void staircase(int n) {
        int counter=0;
        for(int i=0; i<=n; i++) {
            counter++;
            for (int j=0; j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int k=0; k<=counter-1;k++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
	}

}
