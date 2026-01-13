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

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = scanner.next();

            if (exit.equals("exit")) { // exit 입력 시 반복 종료
                System.out.println("계산기 종료");
                break;
            }
        }
    }
}
