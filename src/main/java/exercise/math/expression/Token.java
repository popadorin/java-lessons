package exercise.math.expression;

public class Token {
    Operator operator = Operator.Plus;
    int digit;

    public Token(Operator operator, int digit) {
        this.operator = operator;
        this.digit = digit;
    }

    public Token(int digit) {
        this.digit = digit;
    }

    @Override
    public String toString() {
        switch (operator) {
            case Minus: return  "-" + digit;
            case Plus: return "+" + digit;
            case Concatenate: return "" + digit;
            default: return "unknown operator";
        }
    }
}
