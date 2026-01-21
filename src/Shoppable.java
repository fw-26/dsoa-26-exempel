
public interface Shoppable {
    // Gränssnittet innehåller metoder som behövs för att objekten ska "gå att shoppa"

    // "abstract" behövs inte, metoder i gränssnitt blir automatiskt abstrakta
    double getPrice();

    int getStock();
}
