package datastructure;

public class MyQueue {
    private int [] array = new int[0];

    public boolean add(int value){
        int [] newArray = new int[this.array.length+1];
        for(int count = 0; count < this.array.length; count++){
                newArray[count] = array[count];
        }
        newArray[newArray.length - 1] = value;
        this.array = newArray;
        return true;
    }

   public int element(){
        return this.array[0];
   }

   public Integer peek(){
        if(array.length != 0){
            return this.array[0];
        }
       return null;
   }

    public void replace() {
        int[] newArray = new int[this.array.length - 1];
        for (int counter = 0; counter < newArray.length; counter++) {
            newArray[counter] = this.array[counter + 1];
        }
        this.array = newArray;
    }

   public Integer poll(){
        if(array.length != 0){
            int firstElement = this.array[0];
            replace();
            return firstElement;
        }
        return null;
   }

    public int remove(){
        int firstElement = 0;
        if(array.length != 0){
            firstElement = this.array[0];
            replace();

        }
        return firstElement;
    }


}
