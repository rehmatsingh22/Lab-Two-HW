import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void linkedList() {
        // 1. Create a LinkedList<String> object called progLanguages
        LinkedList<String> progLanguages = new LinkedList<>();

        // 2. Add elements to progLanguages: "Java", "Python", "JavaScript", "C++"
        progLanguages.add("Java");
        progLanguages.add("Python");
        progLanguages.add("JavaScript");
        progLanguages.add("C++");

        // 3. Remove the element "C++" from the list using .remove()
        progLanguages.remove("C++");

        // 4. Add an element "HTML" at index 2.
        progLanguages.add(2, "HTML");

        // 5. Iterate over progLanguages and output each element
        Iterator<String> iterator = progLanguages.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void queue() {
        // 6. Create a Queue<String> called q
        Queue<String> q = new LinkedList<>();

        // 7. Add 5 first names to q.
        q.add("Alice");
        q.add("Bob");
        q.add("Charlie");
        q.add("Diana");
        q.add("Eve");

        // 8. Uncomment the following line
        System.out.println("Elements of queue: " + q);

        // 9. Remove the head of the queue and assign it to a String variable removedElement.
        String removedElement = q.poll(); // poll() removes and returns the head
        System.out.println("Removed element: " + removedElement);

        // 10. View the head of the queue using peek(). Output its value.
        System.out.println("Head of queue: " + q.peek());

        // 11. Using for(String element : q), output all of the values in the queue
        for (String element : q) {
            System.out.println(element);
        }
    }

    public static void stack() {
        // 13. Create a Stack<String> called bookStack
        Stack<String> bookStack = new Stack<>();

        // 14. Push the following book titles onto bookStack: "Clean Code", "Design Patterns", "Pragmatic Programmer"
        bookStack.push("Clean Code");
        bookStack.push("Design Patterns");
        bookStack.push("Pragmatic Programmer");

        // 15. pop() 1 book off the stack. Display its value
        String poppedBook = bookStack.pop();
        System.out.println("Popped book: " + poppedBook);

        // 16. Use the peek() method to view the top book on the stack
        System.out.println("Top book on stack: " + bookStack.peek());

        // 17. push() "Web DB Technologies" onto the stack
        bookStack.push("Web DB Technologies");

        // 18. Use the peek() method to view the top book on the stack
        System.out.println("Top book on stack after pushing: " + bookStack.peek());

        // 19. Search for "Design Patterns" in the stack. Display the results of the search.
        int position = bookStack.search("Design Patterns");
        System.out.println("Position of 'Design Patterns' in stack: " + position);

        // 20. Call empty(). Output the results
        System.out.println("Is the stack empty? " + bookStack.empty());

        // 21. Print the titles of all of the books on the stack
        System.out.println("Books in stack: " + bookStack);
    }

    public static void main(String[] args) {
        // Call each method to test the functionality
        linkedList();
        queue();
        stack();
    }
}
