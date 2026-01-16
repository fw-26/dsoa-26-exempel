abstract class Clothing {
    int condition;

    Clothing(int condition) {
        this.condition = condition;

        System.out.printf("Condition: %d\n", condition);
    }

    // Alla subklasser måste implementera abstrakta metoder
    abstract void mend();

    public int getCondition() {
        return condition;
    }
}
