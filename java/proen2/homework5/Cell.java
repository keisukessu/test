package proen2.homework5;

public class Cell {
    Cell next;
    AddressData data;

    public Cell(AddressData d) {
        this.data = d;
        this.next = null;
    }
}
