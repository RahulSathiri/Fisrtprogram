
import java.util.ArrayList;
import java.util.List;

public class Primefact {

 
 public static List<Integer> primeFactors(int number) {
  int n = number;
  List<Integer> primeFactors = new ArrayList<Integer>();
  for (int i = 2; i <= n; i++) {
   while (n % i == 0) {
    primeFactors.add(i);
    n /= i;
   }
  }
  return primeFactors;
 }

}


