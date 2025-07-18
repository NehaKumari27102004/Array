class Stack {
    private int top; // top represents the index position of the top most element in the stack
    private int maxSize; // maxSize represents the maximum number of elements that can be stored in the stack
    private int[] arr;
    Stack(int maxSize) {
        this.top = -1; // top is -1 when the stack is created
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }
    //Checking if the stack is full or not
    public boolean isFull() {
        if (top >= (maxSize - 1)) {
            return true;
        }
        return false;
    }
    //Adding a new element to the top of the stack
    public boolean push(int data) {
        if (isFull()) {
            return false;
        } else {
            arr[++top] = data;
            return true;
        }
    }
}
class Tester {
    public static void main(String args[]) {
        Stack stack = new Stack(5);
        System.out.println("Stack created.\n");
        if (stack.push(1))
            System.out.println("The element is pushed to the stack!\n");
        else
            System.out.println("Stack is full!\n");
        if (stack.push(2))
            System.out.println("The element is pushed to the stack!\n");
        else
            System.out.println("Stack is full!\n");
        if (stack.push(3))
            System.out.println("The element is pushed to the stack!\n");
        else
            System.out.println("Stack is full!\n");
        if (stack.push(4))
            System.out.println("The element is pushed to the stack!\n");
        else
            System.out.println("Stack is full!\n");
        if (stack.push(5))
            System.out.println("The element is pushed to the stack!\n");
        else
            System.out.println("Stack is full!\n");
    }
}
