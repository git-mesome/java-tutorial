package java_adv3.lambda.ex1;

import java.util.Arrays;
import java_adv3.lambda.Procedure;

public class M4MeasureTime {

  public static void measure(Procedure procedure) {
    long start = System.nanoTime();
    procedure.run();
    long end = System.nanoTime();
    System.out.println("실행 시간: " + (end - start) + "ns");
  }

  public static void main(String[] args) {

    measure(() -> {
      int N = 100;
      long sum1 = 0;
      for (int i = 1; i <= N; i++) {
        sum1 += i;
      }
      System.out.println("[1부터 100까지의 합] 결과: " + sum1);
    });

    System.out.println();

    measure(() -> {
      int[] arr = {4, 3, 2, 1};
      System.out.println("원본 배열: " + Arrays.toString(arr));
      Arrays.sort(arr);
      System.out.println("배열 정렬: " + Arrays.toString(arr));
    });
  }
}
