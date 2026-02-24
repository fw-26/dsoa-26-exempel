public class Hashy {

    private Person[] hashTable;

    public Hashy(int dataSize) {
        // 10 x större för att få "luft" emellan värdena
        hashTable = new Person[dataSize*10]; // 10 000
    }

    public int hash(String str) {
        int ret = 0;
        for (int i = 0; i < str.length(); i++) {
            ret += str.charAt(i) * 10;
        }
        return ret % hashTable.length;
    }

    public Person find(String name) {
        int idx = hash(name);
        int ops = 0;

        // så länge idx inte är det vi söker...
        while (!hashTable[idx].getName().equals(name)) {
            idx++;
            idx %= hashTable.length; // gå till början vid behov
            ops++;

            if (ops > hashTable.length) {
                System.out.println("Not found");
                return null;
            }
        }
        System.out.println("HashTable O(1) ops: " + ops);
        return hashTable[idx];
    }

    public void add(Person person) {
        int idx = hash(person.getName());

        while (hashTable[idx] != null) {
            //System.out.println("COLLISION on " + idx );
            idx++;
            idx %= hashTable.length; // gå till början vid behov
        }
        hashTable[idx] = person;

    }

}
