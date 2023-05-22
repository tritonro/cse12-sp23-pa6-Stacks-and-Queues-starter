
/**
 * file header
 * @param <E>
 */

 class MyDeque<E> implements DequeInterface<E> {

    /**Instance variables */
    Object[] data; 
    int size, rear, front; 

    /**constants */
    int initFrontNRear = 0; 

    /**Constructor */
    public MyDeque(int initialCapacity){
        if (initialCapacity < 0){
            throw new IllegalArgumentException(); 
        }
        this.data = new Object[initialCapacity]; 
        this.rear = initFrontNRear; 
        this.front = initFrontNRear; 


    }


    /**Inherited methods */
    public int size(){
        return 0; 
    }

    public void expandCapacity(){}

    public void addFirst(E element){}

    public void addLast(E element){}

    public E removeFirst(){
        return (E) new Object(); 
    }

    public E removeLast(){
        return (E) new Object(); 
    }

    public E peekFirst(){
        return (E) new Object(); 
    }

    public E peekLast(){
        return (E) new Object(); 
    }


 }