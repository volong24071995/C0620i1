class CalculatorTest {

    public static void main(String[] args) {
        int firstOperand = 1;
        int secondOperand = 1;
        char operator = '+';
        int expected = 2;

        if (expected == Calculator.calculate(firstOperand, secondOperand, operator)) {
            System.out.println(true);
        } else System.out.println(false);
    }
}