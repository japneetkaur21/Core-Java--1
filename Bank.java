public class Bank {
    public void getDetails(){
        System.out.println("The details are: ");
    }
}
class SBI extends Bank{
    int rateOfInterest=4;
    int numberofloans=2500;
    int numberofbranches=110;
   public void getDetails(){
       System.out.println("Rate of interest = "+ rateOfInterest);
       System.out.println("Number of loans given= "+ numberofloans);
       System.out.println("Number of branches: "+numberofbranches);
   }
}
class BOI extends Bank {
    int rateOfInterest = 3;
    int numberofloans = 1798;
    int numberofbranches = 97;

    public void getDetails() {
        System.out.println("Rate of interest = " + rateOfInterest);
        System.out.println("Number of loans given= " + numberofloans);
        System.out.println("Number of branches: " + numberofbranches);

    }
}

    class ICICI extends Bank {
        int rateOfInterest = 4;
        int numberofloans = 2189;
        int numberofbranches = 256;

        public void getDetails() {
            System.out.println("Rate of interest = " + rateOfInterest);
            System.out.println("Number of loans given= " + numberofloans);
            System.out.println("Number of branches: " + numberofbranches);

        }

        public static void main(String[] args) {
            SBI sbi = new SBI();
            BOI boi = new BOI();
            ICICI icici = new ICICI();
            sbi.getDetails();
            boi.getDetails();
            icici.getDetails();
        }
    }
