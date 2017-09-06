package exercise.math.expression;

public class Calculator {

    public int calculate(Expression expression) {
        int sum = 0;

        String stringExpr = expression.getString();

        String[] tokens = stringExpr.split("\\+");
        for (String token : tokens) {
            if (token.trim().isEmpty()) {
                continue;
            }
            if (token.contains("-")) {
                String[] minusNumbers = token.split("\\-");
                if (!minusNumbers[0].trim().isEmpty()) {
                    sum += Integer.parseInt(minusNumbers[0].trim());
                }
                minusNumbers[0] = null;
                for (String minusNumber : minusNumbers) {
                    if (minusNumber != null) {
                        sum += Integer.parseInt("-" + minusNumber.trim());
                    }
                }
            } else {
                sum += Integer.parseInt(token.trim());
            }

        }

        return sum;
    }
}
