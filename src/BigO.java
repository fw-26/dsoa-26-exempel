public class BigO {

    int[] data = new int[10000];
    int ops; // antal operationer

    public BigO() {

        System.out.println("Datamängdens storlek: " + data.length);

        /**
         * O(n)
         */
        for (int i = 0; i < data.length; i++) {
            ops++;
        }
        System.out.printf("O(n): %d operationer\n", ops);

        /**
         * O(n^2)
         */
        ops = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                ops++;
            }
        }
        System.out.printf("O(n^2): %d operationer\n", ops);

        /**
         * O(log n)
         */
        ops = 0;
        int len = data.length;
        while (len > 0) {
            len = len / 2;
            ops++;
        }
        System.out.printf("O(log n): %d operationer\n", ops);

        /**
         * O(n log n)
         */
        ops = 0;
        len = data.length;
        while (len > 0) {
            len = len / 2;
            for (int i = 0; i < data.length; i++) {
                ops++;
            }
        }
        System.out.printf("O(n log n): %d operationer\n", ops);




    }
}
