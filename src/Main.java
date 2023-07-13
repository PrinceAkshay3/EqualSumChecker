public class Main {
    public static void main(String[] args) {

            System.out.println(hasEqualSum(1,1,2) ? "The sum of Number 1 and Number 2 are equal to Number3"
                    : "The sum of Number 1 and Number 2 are not equal to Number3");
    }

    public static boolean hasEqualSum(int number1, int number2, int number3){

        return (number1 + number2) == number3;
    }
}