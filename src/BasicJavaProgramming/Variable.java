package BasicJavaProgramming;

public class Variable {
    public int value =48;
//  public Variable(){
//      this.value=4;
//  }

static int name=2;
    public static void main(String[] args) {
        int sum1=20;
        int sum2=30;
        int sum3=sum1+sum2;
        System.out.println(sum3);
        System.out.println(name);
    Variable v1=new Variable();
    System.out.print(v1.value);
    }
}
