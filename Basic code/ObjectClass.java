
class Calculator {

    int num1 = 100;
    int num2 = 100;

    int result = num1 + num2;

    public int addition() {
        return result;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

}

class Computer {

    public void getDrive() {
        System.out.println("You are getting drive information");
    }

    public int driveStorage(int storage) {

        if (storage > 10)
            return 100;
        else

            return storage;
    }
}

class ObjectClass {

    public static void main(String a[]) {

        Calculator calc = new Calculator();
        Computer c1 = new Computer();
        int result = calc.addition();
        int subtraction = calc.subtract(3000, 2500);

        System.out.println(c1.driveStorage(20));
        // System.out.println(("The Subtraction is " + subtraction));

        System.out.println(c1.driveStorage(2));
        c1.getDrive();
    }

}