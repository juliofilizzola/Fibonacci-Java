package fibonacci;

import java.util.List;
import java.util.ArrayList;

public class Fibonacci {
  public static List<Integer> fibonacci() {
    List<Integer> array = new ArrayList<Integer>();
    array.add(0);
    array.add(1);

    for (int index = 1;; index +=1) {
      if (array.get(index) >= 350) {
        break;
      }
      array.add(array.get(index) + array.get(index -1));
    }
    return array;
  }

  public static Boolean validFibonacci(Integer numb) {
    List<Integer> fibonacciArray = fibonacci();
    return fibonacciArray.contains(numb);
  }

}
