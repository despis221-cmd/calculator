import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int posint1 = scanner.nextInt(); // 입력받은 integer posint1에 담기

        System.out.println("두 번째 숫자를 입력하세요: ");
        int posint2 = scanner.nextInt(); // 입력받은 integer posint2에 담기

        System.out.println("사칙연산 기호를 입력하세요: ");
        String arith = scanner.next(); // 입력받은 string arith에 담기
        char ops = arith.charAt(0); // arith의 첫 글자를 문자로 변환하여 ops에 담기

        int result = 0;
        switch(ops) {
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
                if(posint2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                    // break; 사용 시 결과: 0이 출력되어 값을 계산한 것처럼 보임
                }
                else {
                    result = posint1 / posint2;
                    break;
                }
            default:
                System.out.println("올바른 연산자을 입력하세요. (Hint: + - * /)");
        }

        System.out.println("결과: " + result);
    }
}
