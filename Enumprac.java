public class Enumprac {
    enum House{
        E19(86), E20(57), E21(77), E22(92), E23(84);

        public int price;

        House(int p){
            price=p;
        }
        int getPrice(){
            return price;
        }
    }

    public static void main(String[] args) {
        System.out.println("All prices of houses are: ");
        for(House p:House.values()){
            System.out.println(
                    p+" costs "+p.getPrice()+" lakhs."
            );

        }
    }

}
