package ch9;

public class JavaInheritance {

  interface A {
    default String str(){
      return "A";
    }
  }

  interface B {
    default String str(){
      return "B";
    }
//      String str();
  }

  static class D implements A,B{

    @Override
    public String str() {
      return B.super.str();
    }
  }

  public static void main(String[] args) {
    System.out.println(new D().str());
  }

}
