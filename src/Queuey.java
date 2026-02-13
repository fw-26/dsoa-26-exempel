public class Queuey {
    Node front, rear;

    private class Node {
        String value;
        Node next = null;

        Node(String value) {
            this.value = value;
        }
    }

    public void enqueue(String value) {
        Node n = new Node(value);
        if (front == null) {
            front = n;
        } else {
            rear.next = n;
        }
        rear = n;
    }

    public String dequeue() {
        String ret;
        ret = front.value;
        front = front.next;
        return ret;
    }


    @Override
    public String toString() {
        Node current = front;
        String ret = "Queuey: [ (front)";
        while (current != null) {
            ret += " " + current.value;
            current = current.next;
        }
        return ret + " (rear) ]";
    }
}
