package Class20Hw;
    /*Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.
     */
public class CreditCard {
     double balance;
     double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void calculateInterest() {
        double calculatedInterest = balance * interest;
        System.out.println("Interest for the given balance: " + calculatedInterest);
    }
}

         class Visa extends CreditCard {
    public Visa(double balance, double interest) {
        super(balance, interest);
    }
}

         class AX extends CreditCard {
    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    public void calculateInterest() {
        double calculatedInterest = balance * interest * 2;
        System.out.println("Interest for AX card with given balance: " + calculatedInterest);
    }
}

     class Main1 {
    public static void main (String[] args) {
        CreditCard card = new CreditCard(1000, 0.1);
        Visa visa = new Visa(1500, 0.12);
        AX ax = new AX(2000, 0.15);

        card.calculateInterest();
        visa.calculateInterest();
        ax.calculateInterest();
    }
}
