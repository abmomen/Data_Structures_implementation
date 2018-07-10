/**
 * Created by momin on 11/20/17.
 */
public class MainClass {
    public static void main(String[] args){
        myStack<Object> stack=new myStack();
        stack.push(1);
        stack.push(2);
        stack.printAll();
       Queue<Object> myQueue=new Queue<>(100);
       myQueue.insert(3);
       myQueue.insert(4);
       myQueue.display();
    }
}
