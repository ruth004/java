package datastructure;

    public class MyStack {

        private  String[] elements;
        private  int topPosition;
        private  int HighSize;

        public MyStack() {
            HighSize = 0;
            elements = new String[HighSize];
            topPosition = 0;
        }


        public void push(String element) {
            String [] newArray = new String[this.elements.length + 1];
            for(int count = 0; count < this.elements.length; count++){
                newArray[count] = this.elements[count];
            }
            newArray[newArray.length-1] = element;

            this.elements = newArray;
        }

        public String pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }

            String removedElement = elements[this.elements.length-1];

            String [] newArray = new String[this.elements.length-2];

            for(int count = 0; count < newArray.length; count++){
                newArray[count] = this.elements[count];
            }

            this.elements = newArray;

            return removedElement;
        }

        public String peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }

            return elements[topPosition];
        }

        public boolean isEmpty() {
            if(this.elements.length == 0){
                return true;
            }else {
                return false;
            }
        }

        public int size() {
            return topPosition;
        }


    }


