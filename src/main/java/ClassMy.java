import com.sun.source.util.SourcePositions;

public class ClassMy {

    public static void main(String[] args) {
        //Присваивает значения 4 полям типа int.
        int a = 20;
        int b = 50;
        int c = 99;
        int d = 133;

        // Суммирует их попарно.
        int x = a + d;
        int y= c + b;
        // Выводит результат сравнения сумм (true если первая сумма больше).
            System.out.println("Первая сумма больше " + (x > y));

        // Увеличивает первую сумму на 1.
        x += 1;
        // Вторую сумму уменьшает на 2.
        y -= 2;
        // Выводит результат сравнения (true если первая сумма больше).
            System.out.println("Первая сумма больше " + (x > y));

        //Выводит true если хотя б одна сумма кратна 2, в противном случае — false.
        int n = x % 2;
        int m = y % 2;
            System.out.println("если хотя б одна сумма кратна 2 " + (n == 0 || m == 0));
    }
}
