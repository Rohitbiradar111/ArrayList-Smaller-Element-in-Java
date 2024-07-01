//This program prints an ArrayList less than a given Number in Java

import java.util.ArrayList;
public class ArrayListsmallerelement {
    public static void main(String args[])
    {
        int a[] = {1,20,15,36,48,65,0,99,87,9};
        int x = 50;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<x)
            {
                al.add(a[i]);
            }
        }
        System.out.print(al+" ");
    }
}