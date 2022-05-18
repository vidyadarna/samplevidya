package MethodsInJava;

 class Method2 {
  public void disply1() {
   System.out.println("method without parameter");
  }
   public void display2(int a) {
    System.out.println("method with parameter"  +a);
   }

  public static void main(String[] args) {
   Method2  obj = new Method2();
   obj .display2(2);
   obj.disply1();

  }
  }


