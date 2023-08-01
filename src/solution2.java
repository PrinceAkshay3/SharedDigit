public class solution2 {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9,99));
    }

    public static boolean hasSharedDigit(int number1, int number2){

        if((number1 < 10 || number1 >99) || (number2 < 10 || number2 > 99)){
            return false;
        }
                                                                                    // number1 = 12 number2= 31

        while(number1 > 0){
            int lasDigit = number1 % 10;                            //  lastDigit = 1
            int tempNumber = number2;
            while (tempNumber > 0){                            // tempNumber is not equal to zero = true
                int lastDigit2 = tempNumber % 10;              // lastDigit2 = 1
                if(lasDigit == lastDigit2){                 // (1 == 1) = true
                    return true;                               // true
                }
                tempNumber /= 10;                          // number2 = 3
            }
            number1 /=10;                                  // number1 = 0
        }
        return false;
    }
}
