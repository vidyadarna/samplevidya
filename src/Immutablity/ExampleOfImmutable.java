package Immutablity;

public final class ExampleOfImmutable {
 private final    long number;
    private final  String name;
   private final Float balance;
    private final String password;

    public ExampleOfImmutable(Long number, String name, Float balance, String password) {
        this.number = number;
        this.name = name;
        this.balance = balance;
        this.password = password;

    }

    public Long getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Float getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }
}
