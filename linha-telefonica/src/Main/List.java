/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

public class List<T> {
    // create global top reference variable global
    Node top;
    // Constructor
    List(){
        this.top = null;
    }
 
    public void push(T x) {
        Node temp = new Node();
 
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }

        temp.setData(x);
        temp.setNext(top);
        top = temp;
    }
 
    public boolean isEmpty(){
        return top == null;
    }
 
    public T peek() throws Exception{
        if (!isEmpty()) {
            return (T)top.getData();
        }
        else {
            throw new Exception("No items");
        }
    }
 
    public void pop(){
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
        top = (top).getNext();
    }
 
    public void display(){
        if (top == null) {
            return;
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.printf("%d->", temp.getData());
                temp = temp.getNext();
            }
        }
    }
}
