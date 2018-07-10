/**
 * Created by momin on 11/20/17.
 */
public class myStack<E> {
    int max=100,top=-1;
    E[] array;

    //Constructor for initializing array
    public myStack() {
        array=(E[]) new Object[max];
    }

    //Push a object in stack
    public void push(E e){
        if(top>=max)
            System.out.println("Stack Overflow");
        else
        {
            top++;
            array[top]=e;
        }
    }

    //pop a object from stack
   public E pop()
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return null;
        }
        else
        {
            E x = array[top--];
            return x;
        }
    }

    //checks that array is empty or not
    public boolean isEmpty(){
        if(top<0)
            return true;
        else return false;
    }


    //returns top value of stack
    public int top(){
        return top;
    }

    //prints all the element of stack
    public void printAll(){
        for (int i=0;i<=top;i++)
            System.out.print(array[i]+" ");
    }

}
