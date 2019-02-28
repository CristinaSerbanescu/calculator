package Day7;

public class TestCalculator {
    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculatorImpl();
        ExpertCalculator expertCalculator = new ExpertCalculatorImpl();
        //System.out.println(basicCalculator.add(1,2)); - cod vechi cand am invatat sa adunam pe a cu b
        //pe urma am transformat in array ca sa putem aduna mai mult de doua numere
        //Integer[] array = {6,2,4};//declaram o matrice
       // System.out.println(basicCalculator.add(1, 5, 8, 10));//afisam matricea creata mai sus
        //nu mai e nevoie sa definim array-ul la inceput pt ca am transformat {} in ...
        //System.out.println(basicCalculator.add(1L, 5L, 8L, 10L));
      //  System.out.println(basicCalculator.multiply(2.0, 3.0));
       // System.out.println(expertCalculator.pow(3, 2));
       // System.out.println(expertCalculator.root(9));
      //  System.out.println(expertCalculator.factorial(3));

        //Scriem testele pentru metoda pe care o facem pentru calcularea unui string
        System.out.println(expertCalculator.evaluate("2+3"));
        System.out.println(expertCalculator.evaluate("4-3"));
        System.out.println(expertCalculator.evaluate("4*3"));
        System.out.println(expertCalculator.evaluate("4/2"));

        System.out.println(expertCalculator.evaluate("2+3+4+10"));
        System.out.println(expertCalculator.evaluate("2+3*4"));
        System.out.println(expertCalculator.evaluate("20-3*4"));
       System.out.println(expertCalculator.evaluate("(2+3)/5"));





    }
}