package myLinkList;

public class MyLinkList<E> {
    private  Node<E> head;
    private  int numNodes;

    public MyLinkList(Node<E> head, int numNodes) {
        this.head = head;
        this.numNodes = numNodes;
    }
    public MyLinkList() {
        this.head = null;
        this.numNodes = 0;
    }


    public void addFirst(E data) {
        Node temp = head; // biến được thêm vào
        head = new Node<E>(data);
        head.next = temp;
        numNodes++;// tăng độ dài của lode
    }

    public void add(int index,E data) {

        Node<E> temp = head;
        Node<E> beforIndex;
        Node<E> afterIndex;

        //Dùng for để tìm kiếm phần tử( index-1) có thuộc tính next là phần tử index.
        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        beforIndex=temp;
        afterIndex= temp.next;
        beforIndex.next = new Node<E>(data);
        beforIndex.next.next = afterIndex;
        numNodes++;
    }
    public void addLast(E data ){
        Node<E> temp= head;
        for (int i = 0; i <this.numNodes-1 ; i++) {
            temp=temp.next;
        }
        temp.next=new Node<E>(data);
        this.numNodes++;
    }
    public void remove(int index ){
        Node<E> temp= head;
        Node<E> beforIndex;
        Node<E> afterIndex;

        for (int i = 0; i <index-1 ; i++) {
            temp=temp.next;
        }
        beforIndex=temp;
        afterIndex= temp.next.next;

        beforIndex.next=afterIndex;
        this.numNodes--;
    }

    @Override
    public String toString() {
        String result="[" ;
        Node<E> temp=head;
        for (int i = 0; i <this.numNodes ; i++) {
            result +=  temp.item;
            temp=temp.next;
            if(temp!=null){
                result += ",";
            }
        }
        return result+"]";
    }
}
