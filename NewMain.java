/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drew
 */
public class DrewMedian {

    //Given two sorted arrays nums1 and nums2 of size m and n respectively, 
    //return the median of the two sorted arrays.
    public static void main(String[] args) {
        int[] Array_One = {1,2,3,4};
        int[] Array_Two = {5,6,7,8,9};
        
        int Array_One_Length = 4;
        int Array_Two_Length = 5;
        
        double Median;
        
        int[9] New_Array;
        
        System.arraycopy(Array_One, 0, New_Array, 0, 4);
        System.arraycopy(Array_Two, 0, New_Array, 4, 5);
        
        Median = New_Array[5];
        
        System.out.println("The median is %f", Median);
    }
    
}
