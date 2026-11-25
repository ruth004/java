package datastructure;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyArrayList {
    private String[] array;

    public int size(){
        return this.array.length;
    }

    public boolean isEmpty(){
        if(this.array.length == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(String value){
        for(int count = 0; count < this.array.length; count++){
            if(this.array[count].equals(value)){
                return true;
            }
        }
        return false;
    }

    public int indexOf(String value){
        for(int count = 0; count < this.array.length; count++){
            if(this.array[count].equals(value)){
                return count;
            }
        }
        return -1;
    }

    public boolean add(String value){
        String [] newArray = new String[this.array.length + 1];
        for(int count = 0; count < this.array.length; count++){
            newArray[count] = this.array[count];
        }
        newArray[newArray.length-1] = value;
        this.array = newArray;
        return true;
    }

    public boolean add(int index, String value){
        String [] newArray = new String[this.array.length + 1];
        for(int count = 0; count < this.array.length; count++){
            newArray[count] = this.array[count];
        }
        newArray[newArray.length-1] = value;
        this.array = newArray;
        return true;
    }


}
