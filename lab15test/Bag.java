import java.util.NoSuchElementException;

public class Bag {
    private int arr[];

    Bag(){
        
        arr = new int[] {1,2,3,4,5};

    }

    Bag(int arr[]){
        this.arr = arr;
    }

    public int get(int index){
        if(index < 0 || index >= arr.length){
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }
    public Bag set(int index, int value){
        if(index < 0 || index >= arr.length){
            throw new IndexOutOfBoundsException();
        }
        arr[index] = value;
        return this;
    }

    public ForwardIterator forwardIterator(){
        return new ForwardIterator();
    }
    public ReverseIterator reverseIterator(){
        return new ReverseIterator();
    }

    public class ReverseIterator{
        private int index;
        public boolean hasPrevious(){
            return index > arr.length;
        }
        public int previous(){
            if(hasPrevious()){
                return arr[index--];
            }
            throw new NoSuchElementException();
        }
    }
    public class ForwardIterator{
        private int index;

        public boolean hasNext(){
            return index < arr.length;
        }
        public int next(){
            if(hasNext()){
                return arr[index++];
            }
            else{
                throw new NoSuchElementException();
            }
        }
    }
}
