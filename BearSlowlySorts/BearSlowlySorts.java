/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

/**
 *
 * @author K
 */
public class BearSlowlySorts {

//    private static void merge(int[] a, int[] b)
    
    private static void subSort(int [] w, int beg, int end)
    {
        int[] sub = Arrays.copyOfRange(w, beg, end);
        
        Arrays.sort(sub);
        for(int i = beg; i < end; i++)
        {
            w[i] = sub[i-beg];
        }
        
    }
    
    private static void printArray(int[] w)
    {
        System.out.print("{");
        System.out.print(w[0]);
        
        for(int i = 1; i < w.length; i++)
        {
            System.out.print(", ");
            System.out.print(w[i]);
        }
        System.out.println("};");
    }
    
    private static boolean isSorted(int[] w)
    {
        for(int i = 0; i < w.length-1; i++)
        {
            if(w[i] > w[i+1]){
                return false;
            }
        }
        
        return true;
    }
    
    public static int minMoves(int[] w)
    {
        int last = w.length;
        if(isSorted(w))
            return 0;
        
        int[] clone = w.clone();
        subSort(clone, 0, last-1);
        printArray(clone);
        if(isSorted(clone))
            return 1;
        
        clone = w.clone();
        printArray(clone);
        subSort(clone, 1, last);
        printArray(clone);
        if(isSorted(clone))
            return 1;
        
        clone = w.clone();
        subSort(clone, 1, last);
        subSort(clone, 0, last-1);
        printArray(clone);
        if(isSorted(clone))
            return 2;
        
        clone = w.clone();
        subSort(clone, 0, last-1);
        subSort(clone, 1, last);
        printArray(clone);
        if(isSorted(clone))
            return 2;
        
        return 3;
    }
    public static void main(String[] args) {
        int[] tobe = {2,4,5,10,1};
        
        System.out.println(minMoves(tobe));
        
    }
    
}
