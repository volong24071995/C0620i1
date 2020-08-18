import java.util.Arrays;
//tao ra hamf mang co cac chuc nay giong ArrayList cua may mac dinh.

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public void add(E e,int index) {
        if (index>elements.length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }else if(index==elements.length){
            ensureCapa();
        }
        if (elements[index]==null){
            elements[index]=e;
            size++;
        }else {
            for (int i=size+1;i>=index;i--){
                elements[i]=elements[i-1];
            }
            elements[index]=e;
            size++;
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    private int size(){
        return this.size;
    }

    public void clear(){
        this.size=0;
        for (int i=0;i< elements.length;i++){
            elements[i]=null;
        }
    }

    public int indexOf(E e){
        int index=-1;
        for (int i=0;i<size;i++){
            if (elements[i].equals(e)){
               return i;
            }
        }
        return index;
    }

    public boolean contains(E e){
            return indexOf(e)>=0;
    }

    public MyList<E> clone(){
        MyList<E> v=new MyList<>();
        v.elements=Arrays.copyOf(elements, size);
        v.size=this.size;
        return v;
    }

    public E remove(int index){
        if (index>= size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        E element=(E) elements[index];
        for (int i=0;i<size-1;i++){
            elements[i]=elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return element;
    }
}

