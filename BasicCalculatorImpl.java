package Day7;

public class BasicCalculatorImpl implements BasicCalculator {//clasa aceasta implementeaza interfata BasicCalculator

    @Override
    public Long add(Integer... array) {//pot folosi public Long add(Integer... array) in loc de Long add(Integer [] array)- nr variabil de argumente
        //aceasta e metoda noastra de suma
        Long sum = 0L;
        for (Integer number : array) {
            sum += number;//- prescurtarea lui sum = sum + number;
        }
        return Long.valueOf(sum);
    }

    @Override
    public Long add(Long a, Long b) {
        return a + b;
    }

    @Override
    public Double add(Double a, Double b) {
        return a + b;
    }

    @Override
    public Double add(Double... array) {
        Double sum = 0D;
        for (Double number : array ) {
            sum += number;

        }
        return Double.valueOf(sum);
    }

    @Override
    public Double subtract(Double... array) {
        Double sum = array[0];
        for (int i=1; i<array.length; i++) {
            sum -= array[i];

        }

        return Double.valueOf(sum);
    }

    @Override
    public Long multiply(Long a, Long b) {
        return null;
    }

    public Long multiply(Integer a, Integer b) {
        return Long.valueOf(a * b);
    }

    public Double multiply(Double... array) {
        Double multipl = 1D;
        for (Double number : array) {
            multipl *= number;

        }
        return Double.valueOf(multipl);

    }


    public Double divide(Double... array) {
        Double result = array[0];
        for (int i=1; i<array.length; i++) {
            result /= array[i];

        }

        return Double.valueOf(result);
    }
}
