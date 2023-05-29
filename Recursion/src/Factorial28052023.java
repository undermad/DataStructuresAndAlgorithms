public class Factorial28052023 {

    public static void main(String[] args) {

        System.out.println(factorial(25));


    }

    private static long factorial(long factorial) {
        if (factorial == 0) {
            return 1;
        }

        return factorial * factorial(factorial - 1);
    }

}
