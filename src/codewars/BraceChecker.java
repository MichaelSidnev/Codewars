package codewars;

public class BraceChecker {

    public boolean isValid(String braces) {
        if (braces.length() % 2 != 0) {
            return false;
        }
        int bracesC = 0;
        int curlyC = 0;
        int bracketsC = 0;

        switch (braces.charAt(braces.length() - 1)) {
            case (')'):
                bracesC++;
                break;
            case ('}'):
                curlyC++;
                break;
            case (']'):
                bracketsC++;
                break;
        }

        for (int i = 0; i < braces.length() - 1; i++) {
            if (braces.charAt(i) == ')') bracesC++;
            if (braces.charAt(i) == '(') {
                bracesC++;
                switch (braces.charAt(i + 1)) {
                    case ('}'):
                        return false;
                    case (']'):
                        return false;
                }
            }
            if (braces.charAt(i) == '}') curlyC++;
            if (braces.charAt(i) == '{') {
                curlyC++;
                switch (braces.charAt(i + 1)) {
                    case (')'):
                        return false;
                    case (']'):
                        return false;
                }
            }
            if (braces.charAt(i) == ']') bracketsC++;
            if (braces.charAt(i) == '[') {
                bracketsC++;
                switch (braces.charAt(i + 1)) {
                    case ('}'):
                        return false;
                    case (')'):
                        return false;
                }
            }
        }

        if (bracesC % 2 != 0 || curlyC % 2 != 0 || bracketsC % 2 != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        BraceChecker b = new BraceChecker();
        b.isValid("(){}[]");
    }
}
