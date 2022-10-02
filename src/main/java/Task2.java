public class Task2 {
    public static void main(String[] args) {
        //Replace MyInterface2 with an equivalent interface from java.util.function
        MyInterface2 exclaim = i -> "!".repeat(i);
        System.out.println(exclaim.apply(4)); //!!!!
    }
}
