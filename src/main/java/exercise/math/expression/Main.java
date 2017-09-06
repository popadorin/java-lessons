package exercise.math.expression;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // digits: 1 2 3 4 5 6 7 8 9 ;
        // operations: +, -, concatenation;
        // condition: = 50
        // test1: - 12 + 3 + 4 + 5 + 67 - 8 - 9 = 50;
        Calculator calculator = new Calculator();
        List<Expression> expressions = new ArrayList<>();


//*******************************************************************************
        int nrOfOperations = 0;

        Operator[] firstOperator = {Operator.Concatenate, Operator.Minus};

        for (Operator op1 : firstOperator) {
            for (Operator op2 : Operator.values()) {
                for (Operator op3 : Operator.values()) {
                    for (Operator op4 : Operator.values()) {
                        for (Operator op5 : Operator.values()) {
                            for (Operator op6 : Operator.values()) {
                                for (Operator op7 : Operator.values()) {
                                    for (Operator op8 : Operator.values()) {
                                        for (Operator op9 : Operator.values()) {
                                            nrOfOperations++;

                                            List<Token> tokens = new ArrayList<>();

                                            tokens.add(new Token(op1, 1));
                                            tokens.add(new Token(op2, 2));
                                            tokens.add(new Token(op3, 3));
                                            tokens.add(new Token(op4, 4));
                                            tokens.add(new Token(op5, 5));
                                            tokens.add(new Token(op6, 6));
                                            tokens.add(new Token(op7, 7));
                                            tokens.add(new Token(op8, 8));
                                            tokens.add(new Token(op9, 9));

                                            Expression expression = new Expression(tokens);
                                            if (calculator.calculate(expression) == 50) {
                                                expressions.add(expression);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
//******************************************************************************************

        int i = 0;
        for (Expression expression : expressions) {
            i++;
            System.out.println("-----------------" + i + expression);
        }

        System.out.println("nrOfOperations = " + nrOfOperations);

        int nrOfExpressions = expressions.size();

        System.out.println("number of expressions: " + nrOfExpressions);


    }
}
