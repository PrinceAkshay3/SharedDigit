// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        int lastDigit1, lastDigit2;

        if ((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)) {
            return false;
        }else{
            lastDigit1 = number1 % 10;
            lastDigit2 = number1 % 10;
            number1 = number1 /10;
            number2 = number2 /10;

            return  ((number1 == number2) || (number1 == lastDigit1) || (number2 == lastDigit1) || (number1 == lastDigit2) || (number2 == lastDigit2) || (lastDigit1==lastDigit2));
        }

    }
    }
