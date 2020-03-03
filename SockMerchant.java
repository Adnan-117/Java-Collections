package com.collections;

import java.util.Arrays;


/**
 * Problem: It must return an integer representing the number of matching pairs of socks that are available.
 *
 */
public class SockMerchant {

	public static void main(String[] args) {
		int n = 9;
		int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		int result = sockMerchant(n, ar);
		System.out.println(result);
	}

	static int sockMerchant(int n, int[] ar) {
		int pairs = 0;
		Arrays.sort(ar);
		for (int i = 0; i < n - 1; i++) {
			if (ar[i] == ar[i + 1]) {
				pairs++;
				i = i + 1;
			}
		}
		return pairs;
	}
}
