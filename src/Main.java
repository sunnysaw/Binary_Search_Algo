/*
Question : Given an array of integers nums which is sorted in ascending order, and an integer target, write a function
          to search target in nums. If target exists, then return its index. Otherwise, return -1.
          You must write an algorithm with O(log n) runtime complexity.
________________________________________________________________________________________________________________________
Example 1:
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
_______________________________________________________________________________________________________________________
Example 2:
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
 */


import java.util.Scanner;

public class Main {
    static  int binar_Search(int[] arr, int target){
        int start,left = 0,middle = 0,right = arr.length - 1,result = -1;
        while (left <= right){
            middle = left + (right - left) / 2;
            if (arr[middle] == target){
                result = middle;
                break;
            } else if (arr[middle] < target) {
                left = middle + 1;
            }
            else {
                right = middle - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int arr = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[arr];
        for (int start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Enter the element you want to search :");
        int target = input.nextInt();
        System.out.println("Printing the result :");
        System.out.println(binar_Search(array,target));
    }
}