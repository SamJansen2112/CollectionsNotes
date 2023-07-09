import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class DifferentCollections {
    public static void main(String[] args) {
        //The Following File will go over the broad strokes of some of the different
        //implementations of Collections. The implementations covered in this file 
        //fall into three major categories. Please keep in mind that ALL of these 
        //implementations can use the functionality covered in CollectionsBaseInfo.java

        //Lists - great for storing data with duplicates 
        //Sets - great for storing data without duplicates 
        //Queues - great for keeping track of when elements entered the collection


        //LISTS
        // ArrayLists are the examples we are familiar with
        // These are great for storing and retrieving data
        ArrayList<Integer>numbers = new ArrayList<Integer>();
        numbers.add(3);

        //LinkedLists are better when we know we're going to be making edits to data AFTER its been added to the list
        LinkedList<String> characters = new LinkedList<String>();
        characters.add("Darth Vader");
        characters.add("Piccolo");
        characters.add("Yoshi");

        //Below is an example of how we would modify each element withing the list
        for(int i = 0; i < characters.size(); i++) {
            characters.set(i, characters.get(i) + " has a good arc");
        }

        //Using our friend the inline foreach loop to print all elements 
        characters.forEach(c -> System.out.println(c));

        //SETS
        //Sets function similarly to lists, DOES NOT ALLOW DUPLICATES
        //If you try to add the same element twice it will only keep one instance 
        HashSet<String> books = new HashSet<>();
        books.add("American Gods");
        books.add("American Gods");
        books.add("Lord of the Rings");
        books.add("Good Night Moon");

        books.forEach(b -> System.out.println(b));

        System.out.println(books.contains("Lord of the Rings"));

        //For larger sets, we want to use LinkedHashSet
        LinkedHashSet<String> library = new LinkedHashSet<>();
        library.addAll(books);
        library.addAll(characters);

        library.forEach(l -> System.out.println(l));

        //When we want to order our set, we can use a TreeSet
        TreeSet<String> trees = new TreeSet<String>(/*We can add a custom comparison in here*/);
        trees.add("Maple");
        trees.add("Oak");
        trees.add("Ent");
        trees.add("Entwive");
        trees.add("Ent");

        trees.forEach(t -> System.out.println(t));
        

        //QUEUE 
        //Queue represents a first in first out data structure where we likely have not processed the object yet 
        //PriorityQueue represents a basic way of representing a "line" as we experience them for concerts and at the store
        //NOTE: WHEN YOU PRINT QUEUES, THEY DON'T PRINT IN THE ORDER THE QUEUES ASSIGN THEM. YOU NEED TO USE PEEK OR PULL
        PriorityQueue<String> concertGoers = new PriorityQueue<String>();
        concertGoers.add("Sam");
        concertGoers.add("Mike");
        concertGoers.add("AAA");
        concertGoers.add("Ben");
        concertGoers.add("Sam");

        // Poll removes the top element in the queue
        System.out.println(concertGoers.poll());
        // Peek checks the top element in the queue 
        concertGoers.forEach(cg -> concertGoers.peek());


    }

    
}

// Polymorphism - writing a custom implementation of a function which already exists 
// Inheritance - implementing specific functions determined by the parent class, acting as a blue print
class BestTrees implements Comparable<String> {
    @Override
    public int compareTo(String o) {
        return 0;
    }
}