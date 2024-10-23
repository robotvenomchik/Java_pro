package Homeworks.Homework16;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        MathOperator mathOperator=new MathOperator() {
            @Override
            public int operate(int arg1, int arg2) {
                return arg1+arg2;
            }
        };
        System.out.println("mathOperator: " + mathOperator.operate(5, 3));

        StringManipulator toUpperCase = s -> s.toUpperCase();
        System.out.println("Uppercase: " + toUpperCase.process("Hello"));

        Function<String, Integer> countUpper = StringListProcessor::countUppercase;
        System.out.println("Uppercase letters: " + countUpper.apply("Hello World!"));

        Supplier<Integer> randomNumberSupplier = () -> RandomNumberGenerator.generateRandom(1, 100);
        System.out.println(randomNumberSupplier.get());
    }
}
