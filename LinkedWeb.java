import java.util.ArrayList;
import java.util.Collection;

public class LinkedWeb<E> implements Web<E>{
    
    ArrayList<Node<E>> web;

    public LinkedWeb(){
        web = new ArrayList<Node<E>>();
    }

    @Override
    public boolean add(E e) {
        // TODO Auto-generated method stub
        
        return false;
    }

    @Override
    public void add(int index, E element) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public void clear() {
        web.clear();
    }

    @Override
    public boolean contains(Object o) {
        return web.contains(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return web.containsAll(c);
    }

    @Override
    public E get(int index) {
        return web.get(index).getElement();
    }

    @Override
    public int indexOf(Object o) {
        return web.indexOf(o);
    }

    @Override
    public boolean isEmpty() {
        return web.isEmpty();
    }

    @Override
    public int lastIndexOf(Object o) {
        return web.lastIndexOf(o);
    }

    @Override
    public E remove(int index) {
        return web.remove(index).getElement();
    }

    @Override
    public boolean remove(Object o) {
        return web.remove(o);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return web.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return web.retainAll(c);
    }

    @Override
    public E set(int index, E element) {
        return web.set(index, new Node<E>(element)).getElement();
    }

    @Override
    public int size() {
        return web.size();
    }

    @Override
    public Object[] toArray() {
        return web.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return web.toArray(a);
    }


}

class Node<E>{

    private E element;
    private ArrayList<Node<E>> nodes;

    //constructor
    public Node(E e){
        this.element = e;
        nodes = new ArrayList<>(); 
    }

    public E getElement(){
        return element;
    }

    public Object[] getNodes(){
        return nodes.toArray();
    }
    public void set(E e){
        this.element = e;
    }

    public void set(Node<E>[] a){
        clear();
        add(a);
    }
    
    public void set(Node<E> current, Node<E> old){
        if(nodes.contains(old)){
            nodes.set(nodes.indexOf(old), current);
        }
    }

    public void remove(Node<E>[] a){
        for (Node<E> n : a) {
            if (nodes.contains(n)){
               nodes.remove(n);
            }
        }
    }
    public void remove(Node<E> n){
        if (nodes.contains(n)){
            nodes.remove(n);
        }
    }

    public void add(Node<E>[] a){
        for (Node<E> n : a) {
            nodes.add(n);
        }
    }
    public void add(Node<E> n){
        nodes.add(n);
    }

    public void clear(){
        nodes.clear();
    }
}
