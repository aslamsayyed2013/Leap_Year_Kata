package co.incubyte.FizzBuzz;

public class FizzBuzz {

  public static String check(int i) {
    if ((i % 3) == 0) {
      return "Fizz";
    }else if((i%5)==0){
      return "Buzz";
    }
    return "No FizzBuzz";
  }
}
