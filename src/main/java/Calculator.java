import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> resultList = new ArrayList<>(); // 결과 저장할 리스트
    // 외부 접근 불가

    public int calculate(int posint1, int posint2, char ops) {

        int result = 0;
        boolean error = false; // 상태 확인

        switch (ops) {
            case '+':
                result = posint1 + posint2;
                break;
            case '-':
                result = posint1 - posint2;
                break;
            case '*':
            case 'x':
            case 'X':
                result = posint1 * posint2;
                break;
            case '/':
            case '÷':
                if (posint2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                    error = true; // 에러 발생
                } else {
                    result = posint1 / posint2;
                }
                break;
            default:
                System.out.println("올바른 연산자을 입력하세요. (Hint: + - * /)");
                error = true; // 에러 발생
        }
        if (!error) { // 에러가 발생하지 않았을 때만 출력, 저장
            System.out.println("결과: " + result);
            resultList.add(result);
        }
        return result;
    }

    public ArrayList<Integer> getResultList() { // 간접 접근으로 필드 값 가져옴
        return resultList;
    }

    public void setResultList(ArrayList<Integer> resultList) { // 간접 접근으로 필드 값 수정
        this.resultList = resultList;
    }

    public void removeResult() {
        if(resultList.size() > 0) { // 저장된 값 있는지 확인
            resultList.remove(0); // 가장 먼저 저장된 값 삭제
        } else {
            System.out.println("저장된 값이 없습니다.");
        }
    }
}
