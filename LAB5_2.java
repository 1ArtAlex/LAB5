import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class LAB5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        try {
            System.out.println("введите количество элементов ");
            a = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("введены некорректные данные");
            System.exit(1);
        }
        if (a >= 1) {
            ArrayList<Integer> Alist = new ArrayList<>();
            try {
                System.out.println("введите элементы");
                for (int i = 0; i < a; i++) {
                    Alist.add(i, in.nextInt());
                }
            } catch (InputMismatchException e) {
                System.out.println("введены некорректные данные");
                System.exit(1);
            }
            LinkedList<Integer> AlistNew = new LinkedList<>();
            AlistNew.addAll(Alist);
            int b = 0;
            try {
                System.out.println("введите значение");
                b = in.nextInt();
                in.close();
            } catch (InputMismatchException e) {
                System.out.println("введены некорректные данные");
                System.exit(1);
            }
            for (int j = 0; j < a; j++) {
                if (AlistNew.get(j) == b) {
                    AlistNew.remove(j);
                    a--;
                    j--;
                }
            }
            int size = AlistNew.size();
            if (size >= 1) {
                System.out.println("начальный список");
                System.out.println(Alist);
                System.out.println("конечный список");
                System.out.println(AlistNew);
            } else {
                System.out.println("начальный список");
                System.out.println(Alist);
                System.out.println("все элементы удалены");
            }
        } else {
            System.out.println("количество элементов должно быть больше нуля");
        }
    }
}
