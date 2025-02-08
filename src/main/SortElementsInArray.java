package main;

public class SortElementsInArray {
    public static void main (String[] args) {
        int arr[] = {13, 7, 6, 45, 21, 9, 101, 102};

        //Java Program to Sort the array in ascending order without using built in method
//    bubbleSort ( arr );
    selectionSort ( arr );



    }

    public static void bubbleSort(int [] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println ("Sorted array using Bubble Sort:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int arr[]){

        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
           for(int j=i+1;j<n;j++){
               if(arr[j]<arr[minIndex]){
                   minIndex = j;
               }
           }
           int temp = arr[minIndex];
           arr[minIndex] = arr[i];
           arr[i] = temp;
        }
        System.out.println ("Sorted Array using selection sort: " );
        for (int num : arr){
            System.out.print(num + " ");
        }

    }

}
