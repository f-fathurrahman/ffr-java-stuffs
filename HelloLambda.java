public class HelloLambda {

  public interface HelloType {
    /**
     * function that will be implemented within the lambda
     * @param text
     */
    void hello(String text);
  }

  public static void main(String[] args) {
    // create a lambda, passing a parameter named "text" to hello() method,
    // returning the string.
    // The lambda is assigned to the helloLambda variable.
    HelloType helloLambda = (String text) -> System.out.println("Hello " + text);

    // invoke the method call
    helloLambda.hello("ffr lambda");
    helloLambda.hello("ffr again");

    // another lambda
    HelloType hello2 = (String text) -> {
      System.out.println("\nThis is from hello2");
      System.out.println("text is " + text);
      System.out.println("length of text is " + text.length());
    };
    hello2.hello("Fadjar Fathurrahman");
  }

}