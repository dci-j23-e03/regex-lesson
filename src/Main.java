import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String hello = "Hello beautiful world";
        hello =  hello.replaceAll("e", "*"); // single character
        System.out.println(hello);
        hello =  hello.replaceAll("[aioue]", "*"); // simple regex
        System.out.println(hello);
        hello =  hello.replaceAll("[^aioue]", "*"); // negation
        System.out.println(hello);

        String hello2 = "Hello beautiful world";
        hello2 = hello2.replaceAll("[a-z]", "?"); // range
        System.out.println(hello2);

        String hello3 = "Hello beautiful world";
        hello3 = hello3.replaceAll("[A-Za-g]", "?"); // range union
        System.out.println(hello3);

        String hello4 = "Hello beautiful world";
        hello4 = hello4.replaceAll("[A-Z&&A-H]", "?"); // range intersection
        System.out.println("Result: " + hello4);

        String hello5 = "Hello beautiful world";
        hello5 = hello5.replaceAll("[A-Z&&[^A-G]]", "?"); // range subtraction
        System.out.println(hello5);

        String pinNumber = "1234";
        pinNumber = pinNumber.replaceAll("\\d", "*"); // digit character class
        System.out.println(pinNumber);

        String pinNumber1 = "1234";
        pinNumber1 = pinNumber1.replaceAll("\\D", "*"); // non-digit character class
        System.out.println(pinNumber1);

        String hello6 = "Hello beautiful world";
        hello6 = hello6.replaceAll("\\s", "?"); // a white space character class
        System.out.println(hello6);

        String hello7 = "Hello beautiful world!!! Here_is_some_pin:1234";
        hello7 = hello7.replaceAll("\\w", "*"); // a word character class
        System.out.println(hello7);

        String hello8 = "Hello beautiful world!!! Here_is_some_pin:1234";
        hello8 = hello8.replaceAll("\\W", "*"); // a non-word character class
        System.out.println(hello8);

        String regex = "[aeiou]";
        String string = "Hello world!\tHello again";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);


        while (matcher.find()) {
            System.out.println("Match: " + matcher.group(0));
        }

        System.out.println(Pattern.matches(".*", "Hello world"));

        for (String s : string.split("\\s")) {
            System.out.println(s);
        }

        System.out.println(pattern.pattern());

        String pinString = "Here is a pin number: 1234";
        Pattern pinPattern = Pattern.compile("(\\D+\\w+)(\\W+)(\\d{4})");
        Matcher pinMatcher = pinPattern.matcher(pinString);

        System.out.println(pinMatcher.groupCount());

        if (pinMatcher.find()) {
            System.out.println("Match: " + pinMatcher.group(0));
            System.out.println("Match: " + pinMatcher.group(1));
            System.out.println("Match: " + pinMatcher.group(2));
            System.out.println("Match: " + pinMatcher.group(3));
        }
        System.out.println(Pattern.matches(pinPattern.pattern(), pinString));


    }
}