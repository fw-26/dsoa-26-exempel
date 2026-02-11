import java.util.Arrays;

public class StringArray {

    String[] values;

    public StringArray(String[] values) {
        this.values = values;
        System.out.println("New StringArray, length: " + values.length);
    }

    /**
     * Lägg till nytt värde på slutet
     */
    public void append(String newValue) {
        String[] newValues = new String[values.length+1];
        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }
        newValues[values.length] = newValue;
        values = newValues;
        System.out.println("append: " + newValue);
    }

    /**
     * Lägg till värde på specifik plats
     */
    public void insert(int index, String value) {
        append(null);
        // Flyttar varje värde framåt, börjandes från slutet
        for (int i = values.length-1; i > index; i--) {
            values[i] = values[i-1]; // i får föregående värde
        }
        values[index] = value;
        System.out.printf("Insert %s at %d\n", value, index);
    }

    /**
     * CC: the reversal
     */
    public void reverse() {
        // ordnar arrayen i omvänd ordning
        String[] reverseArray = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            reverseArray[i] = values[values.length-i-1];
        }
        values = reverseArray;
    }

    public String toString() {
        return Arrays.toString(values);
    }

}
