public class Node extends List {
    private int value;
    private List next;

    public Node(int value, List next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return value + " " + next.toString();
    }

    @Override
    public List add(int x, int i) {
        if(i==0) {
            this.next = new Node(this.value, this.next);
            this.value = x;
        }else{
            this.next = this.next.add(x, i-1);
        }
        return this;
    }

    @Override
    public List remove(int x) {
        if(this.value == x)
            return this.next.remove(x);
        else {
            this.next = this.next.remove(x);
            return this;
        }
    }


    @Override
    public int countOdd() {
        if(this.next instanceof Nil)
            return 0;
        else if(this.value % 2 ==0){
            return 1 + this.next.countOdd();
        }else{
           return  this.next.countOdd();
        }
    }

    @Override
    public List doubleValue() {
        if(this.next instanceof Nil)
            return this;
        else {
            this.value *= 2;
            this.next.doubleValue();
            return this;
        }
    }

    @Override
    public boolean equals(Object obj) {
        while ((this.getNext() instanceof  Nil) && (((Nil) obj).getNext() instanceof  Nil)){
            if (this.getNext().getValue()!=((Nil) obj).getNext().getValue()) return false;
        }
        return (obj == this);
    }

    @Override
    public List getNext(){
        return next;
    }

    public int getValue() {
        return value;
    }

}