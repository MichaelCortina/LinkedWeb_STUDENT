import java.util.ArrayList;
import java.util.Collection;

public class LinkedWeb<E> implements Web<E>{
    
    ArrayList<Node<E>> web;

    public LinkedWeb(){
        web = new ArrayList<Node<E>>();
    }
    
    @Override
    public Object[] getNodes(int index) {
        return web.get(index).toArray();
    }

    @Override
    public boolean addAllNodes(int index, Collection<? extends E> c) {
        return web.get(index).addAll(c);
    }


    @Override
    public boolean addNode(int index, E element) {
        return web.get(index).add(element);
    }

    @Override
    public boolean removeNode(int index, Object o) {
        return web.get(index).remove(o);
    }


    @Override
    public boolean containsNode(int index, Object o) {
        return web.get(index).contains(o);
    }


    @Override
    public boolean removeAllNodes(int index, Collection<?> c) {
        return web.get(index).removeAll(c);
    }

    @Override
    public boolean add(E element) {
        return web.add(new Node<E>(element));
    }

    @Override
    public void add(int index, E element) {
        web.add(index, new Node<E>(element));
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        if (c.size() <= 0){
            return false;
        }
        for (E e : c) {
            add(e);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        if (c.size() <= 0){
            return false;
        }
        for (E e : c) {
            add(index, e);
            index++;
        }
        return true;
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
    private ArrayList<E> nodes;

    //constructor
    public Node(E e){
        this.element = e;
        nodes = new ArrayList<>(); 
    }

    public E getElement(){
        return element;
    }

    public Object[] toArray(){
        return nodes.toArray();
    }

    public void set(E e){
        this.element = e;
    }
    
    public E set(int index, E e){
        return nodes.set(index, e);
    }

    public boolean removeAll(Collection<?> c){
        return nodes.removeAll(c);
    }

    public boolean remove(Object o){
        return nodes.remove(o);
    }

    public boolean addAll(Collection<? extends E> c){
        return addAll(c);
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        return addAll(index, c);
    }

    public boolean add(E element){
        return nodes.add(element);
    }

    public void add(int index, E element) {
        nodes.add(index, element);
    }

    public void clear(){
        nodes.clear();
    }

    public boolean contains(Object o){
        return nodes.contains(o);
    }
}