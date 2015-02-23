
package binsearch;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        int[] intArray=new int[10];
        int searchValue=0,index;
        System.out.println("Enter 10 numbers");
        Scanner input=new Scanner(System.in);
        for(int i=0;i<intArray.length;i++){
            intArray[i]=input.nextInt();
        }
        System.out.println("Enter a number to search for: ");
        searchValue=input.nextInt();
        index=binarySearch(intArray, searchValue);
        if(index!=1){
            System.out.println("Found a index: "+index);
        }
 else{
            System.out.println("Not found");
 }
    }
static int binarySearch(int[] search,int find)
    {
    int start = 0,end,mid;
    end=search.length-1;
    while(start<=end)
    {
        mid=(start+end)/2;
        if(search[mid]==find){
            return mid;
        }
 else if(search[mid]<find)
        {
     start=mid+1;
 }
 else{
            end=mid-1;
 }
    }
    return-1;
}
}
