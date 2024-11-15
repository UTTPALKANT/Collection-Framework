import java.util.LinkedList;
public class linkedListExample {


        public static void main(String[] args) {

            LinkedList<String> list = new LinkedList<>();


            list.add("Apple");
            list.add("Banana");
            list.add("Orange");
            list.add("Grapes");


            System.out.println("LinkedList: " + list);


            list.addFirst("Mango");
            list.addLast("Pineapple");
            System.out.println("LinkedList after adding elements at positions: " + list);


            String firstElement = list.getFirst();
            String lastElement = list.getLast();
            System.out.println("First Element: " + firstElement);
            System.out.println("Last Element: " + lastElement);

            list.set(2, "Strawberry");
            System.out.println("Updated LinkedList: " + list);

            list.removeFirst();
            list.removeLast();
            list.remove(2);
            System.out.println("LinkedList after removals: " + list);

            System.out.println("Size of LinkedList: " + list.size());


            System.out.println("Iterating over LinkedList:");
            for (String item : list) {
                System.out.println(item);
            }

            list.clear();
            System.out.println("LinkedList after clearing: " + list);
        }
    }


