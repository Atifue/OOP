public class Bag {
    private String arr[];
    public Bag(){
        arr = new String[]{"hello world"};
    }

    public Bag(String arr[]){
        this.arr = arr;
    }

    public String get(int index){
        return arr[index];
    }

    public Bag set(int index, String value){
        arr[index] = value;
        return this;
    }

   

    
        private int index;
        public boolean hasNext(){
            return index < arr.length;
        }
        public String next(){
            if(hasNext()){
                return arr[index++];
            }
            return "no more words";
        }
    

    
        
        public boolean hasPrevious(){
            return index > arr.length;
        }
        public String previous(){
            if(hasPrevious()){
                return arr[index--];
            }
            return "no more words";
        }
    
}
