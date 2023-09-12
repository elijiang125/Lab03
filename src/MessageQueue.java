public class MessageQueue
{

    private Message[] elements;
    private int head;
    private int tail;
    private int count;
    public MessageQueue(int capacity)
    {
        elements = new Message[capacity];
        count = 0;
        head = 0;
        tail = 0;
    }

    public Message removeFirst()
    {
        Message r = elements[head];
        head = (head + 1) % elements.length;
        count--;
        return r;
    }

    public void add(Message m)
    {
        // precondition size() < getCapacity(); no longer required
        if (count == elements.length)  // ie size() == getCapacity()
        {
            // Double the array size (amortized doubling)
            int newSize = 2 * elements.length;
            Message[] newElements = new Message[newSize];
            int i = 0;
            for (Message e : elements)
            {
                newElements[i] = e;
                i++;
            }
            elements = newElements;
        }

        elements[tail] = m;
        tail = (tail + 1) % elements.length;
        count++;
    }

    public int size()
    {
        return count;
    }

    public int getCapacity()
    {
        return elements.length;
    }

    public Message getFirst()
    {
        return elements[head];
    }

}