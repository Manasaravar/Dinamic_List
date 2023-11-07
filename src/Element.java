public class Element <T> { // Generic type - обобщенный тип
    T Data;
    Element <T> Next;

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }

    public Element<T> getNext() {
        return Next;
    }

    public void setNext(Element<T> next) {
        Next = next;
    }

    public Element(T data) {
        setData(data);
        setNext(null);
        //System.out.println("Econstructor:\t" + Integer.toHexString(this.hashCode()));
    }

    public Element(T data, Element<T> next) {
        setData(data);
        setNext(next);
        //System.out.println("Econstructor2:\t" + Integer.toHexString(this.hashCode()));
    }
}
