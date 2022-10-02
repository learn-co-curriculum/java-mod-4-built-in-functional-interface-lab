
public class Task1 {
    public static void main(String[] args) {
        //Replace MyInterface1 with a java.util.functions functional interface
        MyInterface1 startsWithDigit = s -> !s.isEmpty() && Character.isDigit(s.charAt(0));
        System.out.println(startsWithDigit.test("9abc"));  //true
        System.out.println(startsWithDigit.test("hello")); //false
        System.out.println(startsWithDigit.test("")); //false
    }
}
