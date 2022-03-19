interface StringFunction {
    String greet(String str);
}
public class LambdaExpressionDemo {
    public static void main(String[] args) {
        StringFunction withoutLambda = new StringFunction() {
            @Override
            public String greet(String str) {
                return "Without Lambda " + str;
            }
        };

        process("Java" , withoutLambda);


        //with lambda - java 8
        StringFunction withLambda = (s) -> {return "With Lambda " + s;};
        process("Java", withLambda);

    }

    public static void process(String s, StringFunction function) {
        String result = function.greet(s);
        System.out.println(result);
    }
}
