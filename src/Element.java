public class Element {
    int Data;
    Element Next;

    public int getData() {
        return Data;
    }

    public void setData(int data) {
        Data = data;
    }

    public Element getNext() {
        return Next;
    }

    public void setNext(Element next) {
        Next = next;
    }

    public Element(int data) {
        setData(data);
        setNext(null);
        System.out.println("Econstructor:\t" + Integer.toHexString(this.hashCode()));
    }

    public Element(int data, Element next) {
        setData(data);
        setNext(next);
        System.out.println("Econstructor2:\t" + Integer.toHexString(this.hashCode()));
    }
}
