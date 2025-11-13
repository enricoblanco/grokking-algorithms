public class Recursion {

    public int factorial(int num){
        if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if(num <= 1){
            return 1;
        }
        return num * factorial(num - 1);
    }
}
