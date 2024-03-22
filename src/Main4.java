import java.util.Optional;

public class Main4 {
    public static void main(String[] args) {
        Optional<Integer> op = Optional.ofNullable(3);
        Integer i = op.get();
        System.out.println("i = " + i);

        Optional<Object> op2 = Optional.ofNullable(null);
        Object o = op2.get();// exception
        
    }
}
