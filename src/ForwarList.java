import javax.swing.*;

public class ForwarList {
    Element Head;
    int size;

    public ForwarList() {
        this.Head = null;
        size = 0;
        System.out.println("LEconsructor:\t" + Integer.toHexString(this.hashCode()));
    }

    public void push_front (int Data) {
        Head = new Element(Data,Head);
/*      Element New = new Element(Data);
        New.setNext(Head);
        Head = New;*/
        size++;
    }


    public void push_back (int Data) {
        Element New = new Element(Data);
        Element current = Head;
        if (Head == null) {
            push_front(Data);
            return;
        } else {
            while (current.Next != null) {
                current = current.Next;
            }
            current.Next = New;
        }
        size++;
    }
    public void pop_front () {
        Head = Head.Next;
        size--;
    }

    public void pop_back() {
      Element temp = Head;
      while (temp.getNext().getNext() != null)
          temp = temp.getNext();
      temp.setNext(null);
        size--;
    }
    public void insert (int Data, int Index) {
        if (Index == 0) {
            push_front(Data);
            return;
        } if (Index > size)
            return;
        Element temp = Head;
        for (int i = 0; i < Index - 1; i++)
            temp = temp.getNext();
        temp.Next = new Element(Data,temp.getNext());
      /*  Element New = new Element(Data);
        New.setNext(temp.getNext());
        temp.setNext(New);*/
    }
    public void erase (int Index) {
        Element temp = Head;
        if (Index == 0) {
             Head = Head.getNext();
             return;
        }
        if (Index > size)
            return;
        for (int i = 0; i < Index - 1; i++)
            temp = temp.getNext();
        temp.setNext(temp.getNext().getNext());
        size--;
    }
    public void clear() {
        Head = null;
        System.out.println("ListClear:\t" + Integer.toHexString(this.hashCode()));
    }
    public void revers(){
       if (Head == null)  {
           return;
        }
            Element nextCurrent = null;
            Element prevCurrent = null;
            Element current = Head;
            while (current != null) {
            nextCurrent = current.Next; // сохраняем в переменную следующего указатель следующего
            current.Next = prevCurrent; // сохраняем с следующий предыдущий
            prevCurrent = current;      // сохраняем в предыдущий текущий
            current = nextCurrent;      // сохраняем в текущий следующий
            }
            Head = prevCurrent; // переворот головы
        }


public void print() {
    Element temp = Head;
    while (temp != null) {
        System.out.print(temp.getData() + "\t");
        temp = temp.getNext();
    }
    System.out.println();
}
}
