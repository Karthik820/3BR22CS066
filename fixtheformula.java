import java.util.*;

public class fixtheformula {

    public static int fix(String formula) {
        String digits = "";
        String ops = "";

        for (char ch : formula.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits += ch;
            }
            else if ("+-*/".indexOf(ch) != -1) {
                ops += ch;
            }
        }

        int result = digits.charAt(0) - '0';

        for (int i = 0; i < ops.length(); i++) {
            int nextNum = digits.charAt(i + 1) - '0';
            char currentOp = ops.charAt(i);

            if (currentOp == '+') {
                result += nextNum;
            }
            else if (currentOp == '-') {
                result -= nextNum;
            }
            else if (currentOp == '*') {
                result *= nextNum;
            }
            else if (currentOp == '/') {
                result /= nextNum;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter Formula: ");
        String userInput = scannerObj.nextLine();
        System.out.println(fix(userInput));
        scannerObj.close();
    }
}


