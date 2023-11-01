public class ForwarList {
    Element Head;
    Element Last;

    public ForwarList() {
        this.Head = null;
        System.out.println("LEconsructor:\t" + Integer.toHexString(this.hashCode()));
    }

    public void push_front (int Data) {
        Element New = new Element(Data);
        New.setNext(Head);
        Head = New;
    }

    public void push_back (int Data) {
        Element New = new Element(Data);
        Element current = Head;
        if (Head == null) {
            Head = New;
        } else {
            while (current.Next != null) {
                current = current.Next;
            }
            current.Next = New;
        }
    }
public void print() {
    Element temp = Head;
    while (temp != null) {
        System.out.print(temp.getData() + "\t");
        temp = temp.getNext();

    }
}



}
