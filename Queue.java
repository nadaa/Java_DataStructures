package com.company;

public class Queue {
    final int size =3;
    int[] storage = new int[size];

    static int  indx=0;
    int ind=0;
    public void enqueue(int pushedElement){
        //indx=0;
        if(indx<size) {
            storage[indx] = pushedElement;
            indx++;
        }
    }

    public void dequeue(){

       int value= storage[ind];
       for(int i=ind+1;i<storage.length;i++){
           storage[i-1]=storage[i];
       }
       storage[storage.length-1]=0;
       indx--;
      // return value;
    }

    public void display(){
        for(int i=0;i<storage.length;i++){
            System.out.println(storage[i]);
        }
    }
}