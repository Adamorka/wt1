package by.bsuir.adam.wt.tasks.first.task7.runner;


import by.bsuir.adam.wt.tasks.first.printer.PrintData;
import by.bsuir.adam.wt.tasks.first.scanner.InputData;
import by.bsuir.adam.wt.tasks.first.task7.logic.ShellSort;

public class SeventhTask {
    public static void main(String[] argv) {
        System.out.println("Введите размер массива: ");
        int n = InputData.inputInt();

        System.out.println("Введите элементы массива: ");
        double[] array = InputData.inputDoubleArray(n);

        try {
            double[] arr = ShellSort.sort(array);
            PrintData.printDoubleArray(arr);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


}
