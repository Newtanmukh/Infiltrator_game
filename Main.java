import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static double average(int[] timetaken) {
        double avg = 0;
        for (int currenttime : timetaken) {
            avg = avg + currenttime;
        }

        avg = avg / 50;

        return avg;

    }

    public static void main(String[] args) {
        double[] probabilities = new double[] { 0.3, 0.4, 0.45, 0.67, 0.7 };
        int[] widths = new int[] { 10, 20, 30, 40, 50 };
        double[] a = new double[25];

        {

            for (int i = 0, lambda = 0; i < 5; i += 1) {
                for (int j = 0; j < 5; j += 1) {
                    int[] time = new int[50];

                    for (int k = 0; k < 50; k += 1)
                        time[k] = 0;

                    for (int k = 0; k < 50; k += 1) {
                        Infiltrator infiltrator = new Infiltrator(probabilities[i]);

                        Border border = new Border(widths[j], probabilities[i]);

                        while (widths[i] - 1 > infiltrator.x) {
                            infiltrator.movenext();

                        }
                        time[k] = infiltrator.time;

                    }

                    a[lambda] = average(time);

                    System.out.println(probabilities[i] + ", " + widths[j] + ", " + a[lambda]);

                    lambda = lambda + 1;

                }
            }

        }
    }
}
