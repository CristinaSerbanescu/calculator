package Day7;

public interface BasicCalculator{
 // Long add (Integer a, Integerb); - fostul cod
 //modificam a si be in array
 Long add (Integer... array);
 //Long add (Long a, Long b);  - fostul cod
 Long add (Long a, Long b);
 //Double add (Double a, Double b);  - fostul cod
 Double add (Double a, Double b);
 Double add(Double... array);

 Double subtract(Double... array);


 Long multiply(Long a, Long b);
 Double multiply(Double... array);
 Double divide(Double... array);

}