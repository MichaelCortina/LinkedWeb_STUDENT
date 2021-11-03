import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LinkedWeb<E> implements Web<E>{
    
    ArrayList<Point<E>> web;

    public LinkedWeb(){
        web = new ArrayList<Point<E>>();
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
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public E get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public E remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public E set(int index, E element) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        return null;
    }


}

class Point<E>{

    Object obj;
    ArrayList<Point<E>> surroundings;

    //constructor
    public Point(Object obj){
        this.obj = obj;
        surroundings = new ArrayList<>(); 
    }

    public void set(Object obj){
        this.obj = obj;
    }

    public void set(Point<E>[] points){
        clear();
        add(points);
    }
    
    public void set(Point<E> current, Point<E> old){
        if(surroundings.contains(old)){
            surroundings.set(surroundings.indexOf(old), current);
        }
    }

    public void remove(Point<E>[] points){
        for (Point<E> p : points) {
            if (surroundings.contains(p)){
               surroundings.remove(p);
            }
        }
    }
    public void remove(Point<E> point){
        if (surroundings.contains(point)){
            surroundings.remove(point);
        }
    }

    public void add(Point<E>[] points){
        for (Point<E> p : points) {
            surroundings.add(p);
        }
    }
    public void add(Point<E> point){
        surroundings.add(point);
    }

    public void clear(){
        surroundings.clear();
    }
}
