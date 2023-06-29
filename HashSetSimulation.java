import java.util.ArrayList;

public class HashSetSimulation {
    private final ArrayList<Integer> elements;

    public HashSetSimulation() {
        elements = new ArrayList<>();
    }

    public void add(Integer element) {
        if (!elements.contains(element)) {
            elements.add(element);
        }
    }

    public String toString() {
        return elements.toString();
    }

    public Integer getElementByIndex(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
    }

    public static void main(String[] args) {
        HashSetSimulation set = new HashSetSimulation();

        set.add(5);
        set.add(10);
        set.add(15);
        set.add(10); // Adding a duplicate element, it will not be added

        System.out.println("Set: " + set);

        System.out.println("Element at index 1: " + set.getElementByIndex(1));
    }
}
