import java.util.Comparator;
import java.util.Iterator;

public class SortedArrayBag implements SortedBag{
    private Student arr[];
    private int size = 0;
    private Comparator<Student> compare;

    public SortedArrayBag(){
        arr = new Student[4];
        compare = new Comparator<Student>(){
            public int compare(Student s1, Student s2) {
                return s1.compareTo(s2);
                }
            };
    }

    public SortedArrayBag(Comparator<Student> comp){
        this(4, comp);
    }


    public SortedArrayBag(int capacity){
        if(capacity < 4)
            capacity = 4;
        
        arr = new Student[capacity];
        compare = new Comparator<Student>(){
            public int compare(Student s1, Student s2) {
                return s1.compareTo(s2);
                }
            };
        }
    

    public SortedArrayBag(int capacity, Comparator<Student> comp){
        if(capacity < 4)
            capacity = 4;
        
        arr = new Student[capacity];
        compare = comp;
    }

    @Override
    public void add(Student s) {
        if (size == arr.length) {
            throw new BagFullException();
        }
        int size1 = size; 
        while (size1 > 0 && compare.compare(arr[size1 - 1], s) > 0) {
            size1--;
        }
        for (int i = size; i > size1; i--) {
            arr[i] = arr[i - 1];
        }
    
        arr[size1] = s;
        size++; 
    }
     

    @Override
    public void remove(Student s) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (compare.compare(arr[i], s) == 0) {
                index = i; // find the index of the student that theyu entered!!!!!!!!!!!!!!!!!!!
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[size - 1] = null; 
            size--; 
        }
    }

    @Override
    public boolean contains(Student s) {
        for(int i = 0; i < size; i++){
            if(arr[i] == s)
                return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for(int i = 0; i < size; i++){
            arr[i] = null;
        }
        size = 0;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator();
    }
    private class StudentIterator implements Iterator<Student>{
        private int index = 0;
        @Override
        public boolean hasNext() {
          return index < size;
        }

        @Override
        public Student next() {
            return arr[index++];
        }

    }

    @Override
    public Student first() {
        if(size == 0)
           return null;
        return arr[0];
    }

    @Override
    public Student last() {
        if(size == 0)
            return null;
        return arr[size-1];
    }

    @Override
    public Student lower(Student s) {
        for (int i = size - 1; i >= 0; i--) {
            if (compare.compare(arr[i], s) < 0) {
                return arr[i];
            }
        }
        return null;
    }

    @Override
    public Student higher(Student s) {
        for (int i = 0; i < size; i++) {
            if (compare.compare(arr[i], s) > 0) {
                return arr[i];
            }
        }
        return null;
    }
    
}
