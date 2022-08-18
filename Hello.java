package ;

import com.google.errorprone.annotations.CheckReturnValue;

/**
 *
 */
@CheckReturnValue
final class Hello {

  private Hello() {
  
  }

  public static void main(String[] argv]) {
    System.out.println("Hello");
  }
}
