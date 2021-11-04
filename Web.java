import java.util.Collection;

public interface Web<E> {
    abstract Object[] getNodes(int index);
    abstract boolean addAllNodes(int index, Collection<? extends E> c);
    abstract boolean addNode(int index, E element);
    abstract boolean removeNode(int index, Object o);
    abstract boolean containsNode(int index, Object o);
    abstract boolean removeAllNodes(int index, Collection<?> c);

    abstract boolean add(E e);
    abstract void add(int index, E element);
    abstract boolean addAll(Collection<? extends E> c);
    abstract boolean addAll(int index, Collection<? extends E> c);
    abstract void clear();
    abstract boolean contains(Object o);
    abstract boolean containsAll(Collection<?> c);
    abstract boolean equals(Object o);
    abstract E get(int index);
    abstract int hashCode();
    abstract int indexOf(Object o);
    abstract boolean isEmpty();
    abstract int lastIndexOf(Object o);
    abstract E remove(int index);
    abstract boolean remove(Object o);
    abstract boolean removeAll(Collection<?> c);
    abstract boolean retainAll(Collection<?> c);
    abstract E set(int index, E element);
    abstract int size();
    abstract Object[] toArray();
    abstract <T> T[] toArray(T[] a);
}
