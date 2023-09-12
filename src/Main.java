public class Main {

    public int totalOrdering(String a, String b) {
        return (a.length() - b.length());
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Main m = new Main();

        //Find two total orderings for String objects. Find a partial ordering
        //that is not a total ordering

        String s1 = "Hello";
        String s2 = "Apple";
        String s3 = "Hello";

        System.out.println(s1.compareTo(s2));
        //total ordering #1

        if (m.totalOrdering(s1, s2) <= 0) {
            System.out.println(true); //total ordering #2
        }
        else if (m.totalOrdering(s1, s2) >0) {
            System.out.println(true);
        }
        //partial ordering

        //Regarding exercise 3.27

        //When enqueueing an element, the tail index needs to be incremented by 1.
        //After the enqueue operation, the difference between tail and head increases by 1,
        //and the count increases by 1.
        //
        //Therefore, the condition still holds true
        //(tail - head - count) % elements.length == (oldTail + 1 - head - (oldCount + 1)) % elements.length

        //after simplified, it's this:
        //(oldTail - head - oldCount) % elements.length == 0

        //For dequeueing, it's the same increment, but on heads

        //(tail - head - count) % elements.length == (oldTail - (oldHead + 1) - (oldCount - 1)) % elements.length

        //(oldTail - oldHead - oldCount) % elements.length == 0

        //as a result, both the enqueue and dequeue operation shows that the invariant is maintained
        // and that it's an invariant of the bounded queue implementation.

    }
}