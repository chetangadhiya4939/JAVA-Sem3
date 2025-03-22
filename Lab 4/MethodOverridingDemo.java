// Parent class
class Bank {
    double getInterestRate() {
        return 0.0;
    }
}

// Child class 1
class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 4.0; // SBI interest rate
    }
}

// Child class 2
class ICICI extends Bank {
    @Override
    double getInterestRate() {
        return 3.5; // ICICI interest rate
    }
}

// Child class 3
class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 4.5; // HDFC interest rate
    }
}

// Main class to test method overriding
public class MethodOverridingDemo {
    public static void main(String[] args) {
        Bank bank;

        bank = new SBI();
        System.out.println("SBI Interest Rate: " + bank.getInterestRate());

        bank = new ICICI();
        System.out.println("ICICI Interest Rate: " + bank.getInterestRate());

        bank = new HDFC();
        System.out.println("HDFC Interest Rate: " + bank.getInterestRate());
    }
}

