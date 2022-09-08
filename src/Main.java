public class Main {

    public static int n1=0,n2=1,n3=0;
    public static int sum = 0;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int five = factorial(5);
        System.out.println(five);
        int pow = power(2, 2);
        System.out.println(pow);
        int count = 34;
        sumFibonacci(count);
        System.out.println(sum);
    }

    public static int factorial(int num) {
        if (num <= 1) {
            return 1;
        }
        return num*factorial(num-1);
    }

    public static int power(int base, int exponent) {
        if (exponent <=1) {
            return base;
        }
        return base*power(base, exponent-1);
    }

    public static void sumFibonacci(int count){
        if(count>0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            if (n3 % 2 == 0) {
                sum += n3;
            }

            sumFibonacci(count-1);
        }
    }
}