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

    }
}
