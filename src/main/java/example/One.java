package example;

public class One {
  String message = "foo";
  String message2 = "toto";

  public String foo() {
    return message;
  }

  public String toto() {
    return message2;
  }

  public String titi() {
    System.out.println("Adding a line");
    return message2;
  }

  public void uncoveredMethod() {
    System.out.println(foo());
  }
}
