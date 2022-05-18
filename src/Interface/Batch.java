package Interface;

public class Batch implements School{
    @Override
    public void studentClass() {
        System.out.println("5th standard");
    }

    @Override
    public int studentResult() {
        System.out.println("99%");
        return 0;
    }

    @Override
    public int studentId() {
        System.out.println("202272");
        return 0;
    }

    @Override
    public String studentAddress() {
        System.out.println("telangana");
        return null;
    }
}
