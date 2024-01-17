public class Test {
    static int Test1(){
        Bag bag = new Bag();
        
        int score = 0;
        if (bag.get(0) == 1) score += 1;
        if (bag.get(1) == 2) score += 1;
        if (bag.get(2) == 3) score += 1;
        if (bag.get(3) == 4) score += 1;
        if (bag.get(4) == 5) score += 1;

        Bag.ForwardIterator forwardIterator = bag.forwardIterator();
        int currValue = 1;
        while (forwardIterator.hasNext()){
            if (forwardIterator.next() != currValue++)
                return score;
        } // end-while
        score += 8;
        
        Bag.ReverseIterator reverseIterator = bag.reverseIterator();
        currValue = 5;
        while (reverseIterator.hasPrevious()){
            if (reverseIterator.previous() != currValue--)
                return score;
        } // end-while
        score += 8;

        bag.set(0, 10)
            .set(1,15)
            .set(2,20)
            .set(3, 25)
            .set(4, 30);

        if (bag.get(0) == 10) score += 1;
        if (bag.get(1) == 15) score += 1;
        if (bag.get(2) == 20) score += 1;
        if (bag.get(3) == 25) score += 1;
        if (bag.get(4) == 30) score += 1;

        forwardIterator = bag.forwardIterator();
        currValue = 10;
        while (forwardIterator.hasNext()){
            if (forwardIterator.next() != currValue)
                return score;
            currValue += 5;
        } // end-while
        score += 8;

        reverseIterator = bag.reverseIterator();
        currValue = 30;
        while (reverseIterator.hasPrevious()){
            if (reverseIterator.previous() != currValue)
                return score;
            currValue -= 5;
        } // end-while
        score += 8;

        try {
            bag.get(7);
            return score;
        } catch (Exception e){
            score += 4;
        }

        try {
            bag.set(7, 8);
            return score;
        } catch (Exception e){
            score += 4;
        }        

        return score;
    } // end-Test

    static int Test2(){
        int [] arr = {100, 200, 300, 400, 500};
        Bag bag = new Bag(arr);
        
        int score = 0;
        if (bag.get(0) == 100) score += 1;
        if (bag.get(1) == 200) score += 1;
        if (bag.get(2) == 300) score += 1;
        if (bag.get(3) == 400) score += 1;
        if (bag.get(4) == 500) score += 1;

        Bag.ForwardIterator forwardIterator = bag.forwardIterator();
        int currValue = 100;
        while (forwardIterator.hasNext()){
            if (forwardIterator.next() != currValue)
                return score;
            currValue += 100;
        } // end-while
        score += 8;

        Bag.ReverseIterator reverseIterator = bag.reverseIterator();
        currValue = 500;
        while (reverseIterator.hasPrevious()){
            if (reverseIterator.previous() != currValue)
                return score;
            currValue -= 100;
        } // end-while
        score += 8;

        bag.set(0, 1000)
            .set(1,1500)
            .set(2,2000)
            .set(3, 2500)
            .set(4, 3000);

        if (bag.get(0) == 1000) score += 1;
        if (bag.get(1) == 1500) score += 1;
        if (bag.get(2) == 2000) score += 1;
        if (bag.get(3) == 2500) score += 1;
        if (bag.get(4) == 3000) score += 1;

        forwardIterator = bag.forwardIterator();
        currValue = 1000;
        while (forwardIterator.hasNext()){
            if (forwardIterator.next() != currValue)
                return score;
            currValue += 500;
        } // end-while
        score += 8;

        reverseIterator = bag.reverseIterator();
        currValue = 3000;
        while (reverseIterator.hasPrevious()){
            if (reverseIterator.previous() != currValue)
                return score;
            currValue -= 500;
        } // end-while
        score += 8;

        try {
            bag.get(-1);
            return score;
        } catch (Exception e){
            score += 4;
        }

        try {
            bag.set(-2, 8);
            return score;
        } catch (Exception e){
            score += 4;
        }        

        return score;
    } // end-Test2

    public static void main(String[] args) {
        int score = 0;
        score += Test1();
        score += Test2();

        System.out.printf("Your test score is: %d\n", score);
    } //end-main
} //end-Test