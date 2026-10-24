public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddStrategy());

        System.out.println("Addition: 10 + 5 = "
                + calculator.calculate(10, 5));

        calculator.setStrategy(new SubtractStrategy());
        System.out.println("Subtraction: 10 - 5 = "
                + calculator.calculate(10, 5));

        calculator.setStrategy(new MultiplyStrategy());
        System.out.println("Multiplication: 10 * 5 = "
                + calculator.calculate(10, 5));

        System.out.println();
        System.out.println("Additional checks:");

        calculator.setStrategy(new AddStrategy());
        System.out.println("-4 + 2 = "
                + calculator.calculate(-4, 2));

        calculator.setStrategy(new SubtractStrategy());
        System.out.println("2.5 - 0.5 = "
                + calculator.calculate(2.5, 0.5));

        calculator.setStrategy(new MultiplyStrategy());
        System.out.println("7 * 0 = "
                + calculator.calculate(7, 0));
    }
}