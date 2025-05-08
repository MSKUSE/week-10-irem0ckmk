public class Main {
    public static void main(String[] args){
        /*
        Stack stack = new StackArray();
        stack.push("String");
        stack.push(12);
        stack.peek();
        System.out.println("Pop= "+stack.pop());
        stack.peek();
        System.out.println("Pop= "+stack.pop());
        System.out.println("Is empty "+ stack.isEmpty());
        stack.peek();
        System.out.println("Pop= "+stack.pop());

         */
        StackLinkedList stack = new StackLinkedList();
        System.out.println(stack.top.getNext());
        stack.push(5);
        stack.push("It is a String");
        stack.peek();
        System.out.println(stack.top.getNext().getNext());




    }
}
