package java_adv3.stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperationsMain {

  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 2, 3, 3, 4, 5, 5, 6, 7, 8, 9, 10);

    System.out.println("1. collect - List 수집");
    List<Integer> evenNumbers1 = numbers.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());
    System.out.println("짝수 리스트: " + evenNumbers1);
    System.out.println();

    System.out.println("2. toList() Java 16+");
    List<Integer> evenNumbers2 = numbers.stream()
        .filter(n -> n % 2 == 0)
        .toList();
    System.out.println("짝수 리스트: " + evenNumbers2);
    System.out.println();

    System.out.println("3. toArray() - 배열로 변환");
    Integer[] arr = numbers.stream()
        .filter(number -> number % 2 == 0)
        .toArray(Integer[]::new);
    System.out.println("짝수 배열: " + Arrays.toString(arr));
    System.out.println();

    System.out.println("4. forEach() - 각 요소에 대한 동작 수행");
    numbers.stream()
        .limit(5)
        .forEach(n -> System.out.print(n + " "));
    System.out.println();

    System.out.println("5. count() - 요소 개수 세기");
    long count = numbers.stream()
        .filter(n -> n > 5)
        .count();
    System.out.println("5보다 큰 숫자의 개수: " + count);
    System.out.println();

    System.out.println("6. reduce() - 요소들의 합");
    System.out.println("초기값이 없는 reduce");
    Optional<Integer> sum1 = numbers.stream()
        .reduce((a, b) -> a + b);
    System.out.println("합계(초기값 없음): " + sum1.get());

    System.out.println("초기값이 있는 reduce");
    int sum2 = numbers.stream()
        .reduce(100, (a, b) -> a + b);
    System.out.println("합계(초기값 100): " + sum2);
    System.out.println();

    System.out.println("7. min - 최소값 찾기");
    Optional<Integer> min = numbers.stream()
        .min(Integer::compareTo);
    System.out.println("최소값: " + min.get());
    System.out.println();

    System.out.println("8. max - 최대값 찾기");
    Optional<Integer> max = numbers.stream()
        .max(Integer::compareTo);
    System.out.println("최대값: " + max.get());
    System.out.println();

    System.out.println("9. findFirst() - 첫 번째 요소 찾기");
    Integer first = numbers.stream()
        .filter(n -> n > 5)
        .findFirst().get();
    System.out.println("5보다 큰 첫 번째 숫자: " + first);
    System.out.println();

    // 병렬 스트림의 경우 더 효율적
    System.out.println("10. findAny() - 임의의 요소 찾기");
    Integer any = numbers.stream()
        .filter(number -> number > 5)
        .findAny().get();
    System.out.println("5보다 큰 임의의 숫자: " + any);
    System.out.println();

    System.out.println("11. allMatch() - 조건을 만족하는 요소 존재 여부");
    boolean hasEven = numbers.stream()
        .anyMatch(n -> n % 2 == 0);
    System.out.println("모든 숫자가 짝수인가? " + hasEven);
    System.out.println();

    System.out.println("12. allMatch() - 모든 요소가 조건을 만족하는지 확인");
    boolean allPositive = numbers.stream()
        .allMatch(n -> n > 0);
    System.out.println("모든 숫자가 양수인가? " + allPositive);
    System.out.println();

    System.out.println("13. noneMatch() - 조건을 만족하는 요소가 없는지 확인");
    boolean noneNegative = numbers.stream()
        .noneMatch(n -> n < 0);
    System.out.println("음수는 없는가? " + noneNegative);
    System.out.println();
  }

}
