public class Library {
    public static int max(int a, int b, int c, int d){
        return Math.max(Math.max(a,b),Math.max(c,d));
    }

    public static double quadratic(double a, double b, double c, double x){
        return a*x*x + b*x + c;
    }

    public static int firstDigit(int num){
        while(num > 9){
            num /= 10;
        }
        return num;
    }

    public static int oddMinusEven(int num){
        int even = 0;
        int odd = 0;
        while(num > 0){
            if(num % 2 == 0){
                even += num % 10;
            }
            else{
                odd += num % 10;
            }
            num /= 10;
        }
        return odd-even;
    }

    public static double countChange(int q, int d,  int n, int p){
        return q*.25 + d * .10 + n * .05 + p *.01;
    }

    public static String parityCheck(int num){
        boolean even = false;
        boolean odd = false;

        while(num > 0){
            if(num % 10 % 2 == 0){
                even = true;
            }
            else{
                odd = true;
            }
            num /= 10;
        }

        if(odd  && even){
            return "Mixed Parity";
        }
        else if(odd){
            return "Odd Parity";
        }
        else{
            return "Even Parity";
        }
    }

    public static int digitMatch(int a, int b, int c){
        int match = 0;
        while(a > 0 && b > 0 && c > 0){
            int digitA = a % 10;
            int digitB = b % 10;
            int digitC = c % 10;

            if(digitA == digitB && digitB == digitC){
                match++;
            }
            a /= 10;
            b /= 10;
            c /= 10;
        }
        return match;
    }

    public static int removeOddDigits(int num){
        int result = 0;
        int place = 1;
        while(num > 0){
            int digit = num % 10;
            if(digit % 2 == 0){
                result += digit * place;
                place *= 10;
            }
            num /= 10;
        }
        return result;
    }


}
