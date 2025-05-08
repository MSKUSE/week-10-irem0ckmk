public class StackItem {
    private Object item;
    private StackItem next;

    public StackItem(Object item) {
        this.item = item;

    }

    public StackItem(StackItem next, Object item) {
        this.next = next;
        this.item = item;
    }
    public  StackItem(){

    }

    public Object getItem() {

        return item;

    }

    public void setItem(Object item) {
        this.item = item;
    }

    public StackItem getNext() {
        return next;
    }

    public void setNext(StackItem next) {
        this.next = next;
    }

}
