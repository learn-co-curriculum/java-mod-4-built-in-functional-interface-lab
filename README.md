# Java Built-In Functional Interface Lab

## Instruction

The starter code relies on user defined functional interfaces.  
Evolve the code to use Java's functional interfaces from package [java.util.function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html).

### Task1

```java
public interface MyInterface1 {
    boolean test(String s);
}
```

```java
public class Task1 {
    public static void main(String[] args) {
        //Replace MyInterface1 with an equivalent interface from java.util.function
        MyInterface1 startsWithDigit = s -> !s.isEmpty() && Character.isDigit(s.charAt(0));
        System.out.println(startsWithDigit.test("9abc"));  //true
        System.out.println(startsWithDigit.test("hello")); //false
        System.out.println(startsWithDigit.test("")); //false
    }
}
```

- Update the variable declaration `MyInterface1 startsWithDigit` to use an equivalent interface from [java.util.function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html).
  - Hint: The interface takes a string as a parameter and returns a boolean.
- Delete the file `MyInterface1.java`.

### Task2

```java
public interface MyInterface2 {
    String apply(int i);
}
```

```java
public class Task2 {
    public static void main(String[] args) {
        //Replace MyInterface2 with an equivalent interface from java.util.function
        MyInterface2 exclaim = i -> "!".repeat(i);
        System.out.println(exclaim.apply(4)); //!!!!
    }
}
```

- Update the variable declaration `MyInterface2 exclaim` to use an equivalent interface from [java.util.function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html).
- Delete the file `MyInterface2.java`.

### Task3

```java
public interface MyInterface3 {
    void accept(String s);
}
```

```java
public class Task3 {
    public static void main(String[] args) {
        //Replace MyInterface3 with an equivalent interface from java.util.function
        MyInterface3 question = s -> System.out.println(s+"?");
        question.accept("huh"); //huh?
    }
}
```

- Update the variable declaration `MyInterface3 question` to use an equivalent interface from [java.util.function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html).
- Delete the file `MyInterface3.java`.


### Task4

```java
public class Task4 {
  public static void main(String[] args) {
    ?????  hypotenuse = (a, b) -> java.lang.Math.sqrt(a*a + b*b);
    System.out.println(hypotenuse.?????(3.5, 4.2));
  }
}
```

- Edit the main method to add the assignment and print statements shown above.
- Update  `????? hypotenuse` to replace  ?????  with a functional interface from [java.util.function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html).
  - HINT: What is the data type of argument values 3.5 and 4.2?  What data type does Math.sqrt return?
- Update the print statement to replace ????? with the appropriate method for the functional interface.

