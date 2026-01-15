import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Storage {
    private List<Double> list = new ArrayList<>();

    public void save(double result) { // 결과를 리스트에 추가
        list.add(result);
    }

    public List<Double> getAll() { // 간접 접근으로 필드 값 가져옴
        return list;
    }

    public void reset() { // 간접 접근으로 필드 값 수정
        list.clear();
    }

    public void remove() {
        if(list.size() > 0) {  // 저장된 값 있는지 확인
            list.remove(0); // 가장 먼저 저장된 값 삭제
        } else {
            System.out.println("저장된 값이 없습니다.");
        }
    }

    public List<Double> inquiryResult(double input) {
        return list.stream()
                .filter(result -> result > input) // 결과가 input보다 큰지 확인
                .collect(Collectors.toList()); // 필터링된 결과를 리스트로 변환
    }
}
