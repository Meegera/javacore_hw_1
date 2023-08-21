package lambda_1.task_1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        // ошибка происходит в результате деления на ноль
        // следует предусмотреть ситуацию, когда делитель = 0
        calc.println.accept(c);
    }
}
