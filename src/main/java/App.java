import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int posint1 = scanner.nextInt(); // 입력받은 integer posint1에 담기

            System.out.println("두 번째 숫자를 입력하세요: ");
            int posint2 = scanner.nextInt(); // 입력받은 integer posint2에 담기

            System.out.println("사칙연산 기호를 입력하세요: ");
            char ops = scanner.next().charAt(0); // 입력받은 문자의 첫 글자를 문자로 변환하여 ops에 담기

            calculator.calculate(posint1, posint2, ops);

            System.out.println("Getter 활용: " + calculator.getResultList()); // 저장된 리스트 가져와서 출력

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = scanner.next();

            if (exit.equals("exit")) { // exit 입력 시 반복 종료
                System.out.println("계산기 종료");
                break;
            } else if (exit.equals("reset")) { // reset 입력 시 새로운 리스트 덮어쓰기 (기록 삭제)
                calculator.setResultList(new ArrayList<>());
                System.out.println("연산 기록 초기화");
            } else if (exit.equals("remove")) { // remove 입력 시 가장 먼저 저장된 값 삭제
                calculator.removeResult();
            } else if (exit.equals("inquiry")) { // 추가된 기능 호출
                System.out.println("기준 값을 입력하세요: ");
                double num = scanner.nextDouble();
                System.out.println("기분 값보다 큰 결과 값: ");
                calculator.inquiryResult(num);
            }
        }
    }
}
