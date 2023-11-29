package session1Practice;

import java.util.Scanner;

public class BinerySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = { 56, 2, -1, 100, 26, 48, 32, 5 };
		System.out.println("Enter the number to search in array......");
		int findingNum = sc.nextInt();

		array = BinerySearch.sortingArray(array);
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();

		int res = binerySearch(array, findingNum);

		if (res == -1) {
			System.out.println("The number deos not Existed");
		} else {
			System.out.println("the position of the number in array is : " + (res + 1));
		}
		sc.close();
	}

	private static int binerySearch(int[] arr, int num) 
	{
		
		int start = 0;
		int end = arr.length - 1;
		int mid;
		while (start <= end) {
			mid = ((start + end) / 2);
			if (arr[mid] == num) {
				return mid;
			} else if (arr[mid] > num) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static int[] sortingArray(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			for (int indexIn = index + 1; indexIn < arr.length; indexIn++) {
				if (arr[index] > arr[indexIn]) {
					arr[index] = arr[index] + arr[indexIn];
					arr[indexIn] = arr[index] - arr[indexIn];
					arr[index] = arr[index] - arr[indexIn];
				}
			}
		}
		return arr;
	}

}
