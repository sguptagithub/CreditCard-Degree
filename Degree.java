package Class20Hw;
    /*Create a class 'Degree' having a method 'getPrerequisite' that prints "
    "To get a degree you need high school diploma"".
    Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
    In Masters class override method 'getPrerequisite'.
    Call the method by creating an object of each of the three classes.
     */
public class Degree {
    public void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}

     class Bachelors extends Degree {
}

     class Masters extends Degree {
    @Override
    public void getPrerequisite() {
        System.out.println("To get a Master's degree you need a Bachelor's degree");
    }
}

        class Main {
    public static void main(String[] args) {
        Degree degree = new Degree();
        Bachelors bachelors = new Bachelors();
        Masters masters = new Masters();

        degree.getPrerequisite();
        bachelors.getPrerequisite();
        masters.getPrerequisite();
    }
}
