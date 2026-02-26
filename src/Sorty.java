import java.util.Arrays;

public class Sorty {

    private String[] values;

    public Sorty(String[] values) {
        this.values = values.clone(); // skapar en deep copy så att vi inte ändrar på ursprungliga
    }

    public void insertionSort() {
        int ops = 0;
        for (int i = 1; i < values.length; i++) {
            String currentVal = values[i];

            int j = i-1; // vi jämför bakåt
            while (j >= 0 && values[j].compareTo(currentVal) > 0) {
                values[j+1] = values[j];
                j--;
                ops++;
            }
            values[j+1] = currentVal;
        }

        System.out.println("Insertion Sort operations: " + ops);
    }

    public void bubbleSort() {
        int ops = 0;
        // yttre loop
        for (int i = 0; i < values.length; i++) {
            //inre loop
            for (int j = 1; j < values.length-i; j++) {
                if (values[j-1].compareTo(values[j]) > 0) {
                    String temp = values[j-1];
                    values[j-1] = values[j];
                    values[j] = temp;
                    ops++;
                }
            }
        }
        System.out.println("Bubble Sort operations: " + ops);
    }


    @Override
    public String toString() {
        return Arrays.toString(values);
    }
}
