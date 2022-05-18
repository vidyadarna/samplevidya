package singleton;

public class SingleTon1 {
  private   static SingleTon1 singleTon1;

    private SingleTon1() {
    }

    static SingleTon1 getInstance() {
        if (singleTon1 == null) {
            singleTon1 = new SingleTon1();
            return singleTon1;
        }
        return null;
    }
       public void getConnection(){
           System.out.println("connected with singelTon1");
    }
    }
class main{
    public static void main(String[] args) {
        SingleTon1 singleTon1 ;
        singleTon1 = SingleTon1.getInstance();
        singleTon1.getConnection();
    }
}
