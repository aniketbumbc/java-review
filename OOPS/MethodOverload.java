
class Calculator {

    public int add(int a, int b) {

        int addition = a + b;

        return addition;
    }

    public int add(int a, int b, int c) {

        int addition = a + b + c;

        return addition;
    }

    public double add(double a, double b, double c) {

        double addition = a + b + c;

        return addition;
    }

}

class MethodOverload {

    public static void main(String args[]) {
        Calculator cal = new Calculator();
        Calculator cal1 = new Calculator();

        System.out.println(cal + " " + cal1);

        int result = cal.add(11, 23);
        int resultAddition = cal.add(11, 23, 30);
        double resultDouble = cal.add(11.34, 23.23, 30.44);

        System.out.println(resultAddition);
        System.out.println(resultDouble);
    }
}