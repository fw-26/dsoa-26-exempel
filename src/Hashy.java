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

    public void add(Person person) {
        int idx = hash(person.getName());

        hashTable[idx] = person;

    }

}
