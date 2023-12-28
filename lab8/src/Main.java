import java.util.Arrays;
class Array<T> {
    private final Object[] object_array;
    public final int len;
    private int top;
    private int capacity;
    public Array(int len)
    {
        object_array = new Object [len];
        this.len = len;
        top = -1;
        capacity=len;
    }
    T getArr()
    {
        final T t = (T)object_array[++top];
        return t;
    }
    void setArr(T t) throws ArrayExceptionFull
    {
        if (this.top == capacity-1)
            throw new ArrayExceptionFull("Array is full");
        object_array[++top] = t;
    }
    void dell() throws ArrayExceptionEmpty
    {
        if (this.top == -1)
            throw new ArrayExceptionEmpty("Array is empty");
        object_array[top--]=null;
    }
    int search(T temp) throws ArrayExceptionEmpty
    {
        T exm;
        int l=-1;
        if (this.top == -1)
            throw new ArrayExceptionEmpty("Array is empty");
        for (int i=0; i<this.len; i++)
        {
            if (temp == object_array[i])
            {
                 exm = temp;
                 l=i;
            }
        }
        return l;
    }
    @Override
    public String toString() {
        return Arrays.toString(object_array);
    }
}
class ArrayExceptionEmpty extends Exception{
    public ArrayExceptionEmpty(String message){
        super(message);
    }
}
class ArrayExceptionFull extends Exception{
    public ArrayExceptionFull(String message){
        super(message);
    }
}
class Main {
    public static void main(String[] args) throws ArrayExceptionFull, ArrayExceptionEmpty {
        final int length = 10;
        Array<Integer>arr = new Array(length);

        arr.setArr(6);
        arr.setArr(5);
        arr.setArr(4);
        arr.setArr(3);
        arr.setArr(2);
        arr.setArr(6);
        arr.setArr(5);
        arr.setArr(4);
        arr.setArr(3);
        arr.setArr(2);
        System.out.println(arr);

        arr.dell();
        /arr.dell();
        arr.dell();
        arr.dell();
        arr.dell();
        arr.dell();
        arr.dell();
        arr.dell();
        arr.dell();
        arr.dell();
        System.out.println(arr);

        System.out.println(arr.search(1));
    }
}