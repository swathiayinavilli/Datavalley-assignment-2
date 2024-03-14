public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 200, b = 300;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        swapWithoutThirdVariable(a, b);
    }

    public static void swapWithoutThirdVariable(int a, int b) 
  {

        System.out.println("Before swapping: a = " + a + ", b = " + b);


        a = a ^ b;
        b = a ^ b;
        a = a ^ b;


        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
