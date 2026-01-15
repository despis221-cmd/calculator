import java.util.List;

public class Calculator<T extends Number> {
// T만 적으면 연산이 불가능하기 떄문에 숫자 타입으로 제한

    private final Storage storage = new Storage();
    // 외부 접근 불가

    public double calculate(T posint1, T posint2, char ops) {

        double result = 0;
        boolean error = false; // 상태 확인

        double num1 = posint1.doubleValue(); // Number 클래스가 제공하는 double을 사용하여 변환
        double num2 = posint2.doubleValue();
        // 제네릭 타입은 연산이 불가한 것 같아 추가 자료를 더 찾아보았다.

        OperatorType operatorType = OperatorType.classify(ops); // enum

        if(operatorType == null) {
            System.out.println("올바른 연산자을 입력하세요. (Hint: + - * /)");
            error = true; // 에러 발생
        } else {
            switch (operatorType) {
                case PLUS:
                    result = num1 + num2;
                    break;
                case MINUS:
                    result = num1 - num2;
                    break;
                case MULTIPLY:
                    result = num1 * num2;
                    break;
                case DIVIDE:
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                        error = true; // 에러 발생
                    } else {
                        result = num1 / num2;
                    }
                    break;
            }
        }
        if (!error) { // 에러가 발생하지 않았을 때만 출력, 저장
            System.out.println("결과: " + result);
        }
        return result;
    }

    // storage에 위임
    public List<Double> getList() {
        return storage.getAll();
    }

    public void reset() {
        storage.reset();
    }

    public void remove() {
        storage.remove();
    }

    public List<Double> inquiry(double input) {
        return storage.inquiryResult(input);
    }
}
