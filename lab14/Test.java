public class Test {
    public static void main(String [] args){
        final double scorePerTest = 12.5;

        // Testing Library.max
        double score = 0;
        int result1 = Library.max(3, 7, 1, 4);
        int expected1 = 7;
        if (result1 == expected1) score += scorePerTest;

        // Testing Library.quadratic
        double result2 = Library.quadratic(1.0, 2.2, 1.21, 0.1);
        double expected2 = 1.44;
        double epsilon = 0.01;
        if (Math.abs(result2-expected2) <= epsilon) score += scorePerTest; 

        // Testing Library.firstDigit
        int result3 = Library.firstDigit(435236);
        int expected3 = 4;
        if (result3 == expected3) score += scorePerTest;

        // Testing Library.oddMinusEven(43598)
        int result4 = Library.oddMinusEven(43598);
        int expected4 = 5;
        if (result4 == expected4) score += scorePerTest;

        // Testing Library.countChange(10, 5, 1, 2) ïƒ 3.05
        double result5 = Library.countChange(10, 5, 1, 2);
        double expected5 = 3.07;
        if (Math.abs(result5-expected5) <= epsilon) score += scorePerTest; 

        // Testing Library.parityCheck
        String result6 = Library.parityCheck(42682);
        String expected6 = "Even Parity";
        if (result6.equals(expected6)) score += scorePerTest;

        // Testing Library.digitMatch(423, 463, 1413)
        int result7 = Library.digitMatch(423, 463, 1413);
        int expected7 = 2;
        if (result7 == expected7) score += scorePerTest; 

        // Testing Library.removeOddDigits
        int result8 = Library.removeOddDigits(458721);
        int expected8 = 482;
        if (result8 == expected8) score += scorePerTest; 
        
        System.out.printf("Your Lab score is %.2f\n", score);
    }
} //end-Test
