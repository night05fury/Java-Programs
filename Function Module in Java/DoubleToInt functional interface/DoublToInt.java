import java.util.function.DoubleToIntFunction;

public class DoublToInt {
    public static void main(String[] args) {
        DoubleToIntFunction func = a -> (int) a;

        System.out.println(func.applyAsInt(3.5));

    }
}
