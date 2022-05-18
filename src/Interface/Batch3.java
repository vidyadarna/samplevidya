package Interface;

public class Batch3 implements School{

    @Override
    public void studentClass() {
        System.out.println("7th");
    }

    @Override
    public int studentResult() {
        System.out.println("38%");
        return 0;
    }

    @Override
    public int studentId() {
        System.out.println("202278");
        return 0;
    }

    @Override
    public String studentAddress() {
        System.out.println("warangal");
        return null;
    }
}
