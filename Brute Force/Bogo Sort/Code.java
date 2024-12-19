// import libraries {
import org.algorithm_visualizer.*;
import java.util.*;
// }

class Main {
    // define tracer variables {
    Array1DTracer arrayTracer = new Array1DTracer("Array");
    LogTracer logTracer = new LogTracer("Console");
    // }

    boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    int[] shuffle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int randomIndex = new Randomize.Integer(0, array.length - 1).create();
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
        return array;
    }

    void bogosort(int[] array) {
        while (!isSorted(array)) {
            logTracer.println("Array not sorted: " + Arrays.toString(array));

            // visualize {
            arrayTracer.set(array);
            Tracer.delay();
            // }

            logTracer.println("Shuffling array...");
            array = shuffle(array);
        }

        logTracer.println("Array sorted: " + Arrays.toString(array));

        // visualize {
        arrayTracer.set(array);
        for (int i = 0; i < array.length; i++) {
            arrayTracer.select(i);
            Tracer.delay();
        }
        // }
    }

    // Creating a unique array with random integers
    Integer[] uniqueArray = (Integer[]) new Randomize.Array1D(4, new Randomize.Integer(1, 9)).create();

    // Constructor
    Main() {
        int a = uniqueArray[0];
        int b = uniqueArray[1];
        int c = uniqueArray[2];
        int d = uniqueArray[3];

        // visualize {
        Layout.setRoot(new VerticalLayout(new Commander[]{arrayTracer, logTracer}));
        arrayTracer.set(new int[]{a, b, c, d});
        Tracer.delay();
        // }

        // Call the bogosort function
        bogosort(new int[]{a, b, c, d});
    }

    // Main method to run the program
    public static void main(String[] args) {
        new Main();
    }
}
