
class Calculator {

    int num1 = 100;
    int num2 = 100;

    int result = num1 + num2;

    public int addition() {
        // System.out.println("Addition here " + result);
        return result;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

}

class ObjectClass {

    public static void main(String a[]) {

        Calculator calc = new Calculator();
        int result = calc.addition();
        int subtraction = calc.subtract(3000, 2500);

        System.out.println(result);
        System.out.println(("The Subtraction is " + subtraction));
    }

}