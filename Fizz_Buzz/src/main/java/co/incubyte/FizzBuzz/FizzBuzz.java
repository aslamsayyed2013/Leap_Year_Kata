package co.incubyte.FizzBuzz;

public class FizzBuzz {

  public static String check(int i) {
    if (((i % 3) == 0) && ((i % 5) == 0)) {
      return "FizzBuzz";
    }else if((i%5)==0){
      return "Buzz";
    }else{
      return "Fizz";
    }
  }
}
