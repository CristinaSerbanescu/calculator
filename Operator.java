package Day7;

public enum Operator {


    ADD("\\+"),
    SUBTRACT("\\-"),
    MULTIPLY("\\*"),
    DIVIDE("\\/"),
    PARENTHESES("(",")");

    private  String endSign;
    private  String startSign;
    private String sign;



    private Operator(String sign){
        this.sign = sign;

    }

    private Operator(String startSign, String endSign) {
        this.startSign = startSign;
        this.endSign = endSign;

    }

    public String getSign() {
        return sign;

    }
    public String getEndSign() {
        return endSign;
    }

    public String getStartSign() {
        return startSign;
    }
    public static Operator[] getValues(){
        return new Operator[] { PARENTHESES, ADD, SUBTRACT, MULTIPLY, DIVIDE};
    }
}
