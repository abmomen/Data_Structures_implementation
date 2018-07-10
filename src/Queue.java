import java.util.NoSuchElementException;

/**
 * Created by momin on 11/20/17.
 */
public class Queue<T> {
    T[] array;
    int front,rear,size,length;

    public Queue(int size) {
        this.size=size;
        front=-1;
        rear=-1;
        length=0;
        array=(T[]) new Object[size];
    }
    public boolean isEmpty(){
        if(front<0)
            return true;
        else
            return false;
    }

    public void insert(T i) {

        if (rear == -1)
        {
            front = 0;
            rear = 0;
            array[rear] = i;
        }
        else if (rear + 1 >= size)
            throw new IndexOutOfBoundsException("Overflow Exception");
        else if ( rear + 1 < size)
            array[++rear] = i;
        length++ ;
    }
    public T remove()
    {
        if (isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        else
        {
            length-- ;
            T ele = array[front];
            if ( front == rear)
            {
                front = -1;
                rear = -1;
            }
            else
                front++;
            return ele;
        }
    }
    public void display()
    {
        System.out.print("\nQueue = ");
        if (length == 0)
        {
            System.out.print("Empty\n");
            return ;
        }

        for (int i = front; i <= rear; i++)
            System.out.print(array[i]+" ");


    }
    public boolean isFull()
    {

        if(front==0 && rear == size -1)
            return true;
        else
            return false;
    }

    /*  Function to get the size of the queue */
    public int getSize()
    {
        return length ;
    }
    /*  Function to check the front element of the queue */

    public T peek()

    {

        if (isEmpty())

            throw new NoSuchElementException("Underflow Exception");

        return array[front];

    }

}

