import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

class SimpleLinkedList<T> {
    private int size;
    ArrayList<T> arr =new ArrayList<>();
    SimpleLinkedList() {
        size=0;
    }

    SimpleLinkedList(T[] values) {
         arr =new ArrayList<>();
        for(int i=0; i< values.length; i++){
            push(values[i]);
        }

    }

    void push(T value) {
        arr.add(value);
        size++;
    }

    T pop() {
        if(size!=0) {
            T removed = arr.get(size-1);
            arr.remove(size-1);
            size--;
            return removed;
        }
        if(size==0){
            throw new NoSuchElementException();
        }
        return null;
    }

    void reverse() {
        int start=0; int end=size-1;
        while(start<end){
            T a =arr.get(start);
            T b=arr.get(end);

            arr.set(start,b);
            arr.set(end,a);


            start++; end--;

        }
    }

    T[] asArray(Class<T> clazz) {
        reverse();

        return (T[]) arr.toArray();
    }

    int size() {
        return this.size;
    }
}
