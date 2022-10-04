public class Task3 {
    public static void main(String[] args) {
        //Replace MyInterface3 with an equivalent interface from java.util.function
        MyInterface3 question = s -> System.out.println(s+"?");
        question.accept("huh"); //huh?
    }
}
