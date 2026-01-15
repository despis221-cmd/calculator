public enum OperatorType { PLUS, MINUS, MULTIPLY, DIVIDE; // 연산자 묶기

    public static OperatorType classify(char ops) {
        if (ops == '+') return PLUS;
        if (ops == '-') return MINUS;
        if (ops == '*' || ops == 'x' || ops == 'X') return MULTIPLY;
        if (ops == '/' || ops == '÷') return DIVIDE;

        return null; // 해당되지 않는 연산자
    }
}
