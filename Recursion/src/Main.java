public class Main {
    public static void main(String[] args) {

        System.out.println(recursionFactorial(25));

    }

    public static long recursionFactorial(long factorial) {

        if (factorial == 0) {
            return 1;
        }
        return factorial * recursionFactorial(factorial - 1);
    }

}