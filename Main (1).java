import java.util.*;

public class Main {
  public static double calc(double x, double y, char op){
    if (op == '+'){
      return x+y;
    }
    else if(op=='-'){
      return x-y;
    }
    else if(op=='*'){
      return x*y;
    }
    else if(op=='/'){
      if (y == 0){
        return 0;
      }
      else{
        return x/y;
      }
    }
    return 0;
  }
  
  
  public static void main(String[] args) {
    double x = 1000;
    double y = 2000;
    System.out.println("Hello, World!");
    System.out.println(calc(x,y,'*'));
  }
}