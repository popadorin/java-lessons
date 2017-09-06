package exercise.math.expression;

import java.util.ArrayList;
import java.util.List;

public class Expression {
    List<Token> tokens;

    public Expression(List<Token> tokens) {
        this.tokens = tokens;
    }

    public Expression() {
        tokens = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tokens.add(new Token(i));
        }
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder().append("Expression: \n");
        for (Token token : tokens) {
            if (token.operator == Operator.Concatenate) {
                result.append(token);
            } else {
                result.append(" " + token);
            }
        }

        return result.toString();
    }

    public String getString() {
        StringBuilder result = new StringBuilder();
        for (Token token : tokens) {
            if (token.operator == Operator.Concatenate) {
                result.append(token);
            } else {
                result.append(" " + token);
            }
        }

        return result.toString();
    }
}
