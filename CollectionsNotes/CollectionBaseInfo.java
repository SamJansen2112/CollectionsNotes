import java.util.ArrayList;

public class CollectionBaseInfo {
    public static void main(String[] args) {
        // Static way of storing data of the same type 
        String[] names = {"Sam", "Jay", "Goku"};
        for(int i = 0; i < names.length; i++) {
            if(i == 1) { break; }
            System.out.println(names[i]);
        }

        //ARRAY LISTS ARE USED BELOW AS AN EXAMPLE OF A COLLECTION
        //THIS FUNCTIONALITY CAN BE USED ON ANYTHING WHICH INHERITS THE COLLECTION CLASS

        //ArrayLists are a type of Collection, and they're the one we already know
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Cleveland");
        cities.add("Cincinnati");
        cities.remove("Cincinnati");

        cities.set(0, "CLE");

        //All Collections are iterable
        //This is a regular for loop, which is the best option when we care about the index variable
        for(int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        //isEmpty can tell you whether things are being added to an array
        System.out.println("cities: " + cities.isEmpty());
        ArrayList<String> accomplishments = new ArrayList<String>();
        System.out.println("accomplishments: " + accomplishments.isEmpty());

        //contains tells you whether or not an element is present in your collection
        System.out.println("Is Cleveland a valid city? " + cities.contains("Cleveland"));

        //Remove will return false if it cannot remove an item, add will also return false if it fails true if it is successful
        System.out.println(cities.remove("Cincinnati"));

        //Towns ArrayList
        ArrayList<String> towns = new ArrayList<String>();
        towns.add("Chagrin Falls");
        towns.add("The Shire");

        //Can make a Locations ArrayList by combining cities and towns 
        ArrayList<String> locations = new ArrayList<String>();
        locations.addAll(cities);
        locations.addAll(towns);

        for (int i = 0; i < locations.size(); i++) {
            System.out.println("Location: " + locations.get(i));
        }

        //Can also remove collections in the same 
        locations.removeAll(cities);
        for (int i = 0; i < locations.size(); i++) {
            System.out.println("Location: " + locations.get(i));
        }

        locations.addAll(cities);
        // Retains means "remove all except"
        locations.retainAll(cities);
        for (int i = 0; i < locations.size(); i++) {
            locations.get(i).length();
            System.out.println("Retained Location: " + locations.get(i));
        }

        //For each gives us access to each object within a collection 
        //Useful when we want to mostly process the object, especially when we're calling functions of the object within the collection
        locations.addAll(towns);
        for (String locale : locations) {
            locale.length();
            System.out.println("For each " + locale);
        }

        //This is called a lambda expression, and it allows us to write a one line function
        //Also allows us to use stream and lambdas 
        locations
        //Allows us to process elements within a collection 
        .stream()
        //Filter works more or less like an if statement
        .filter(locale -> cities.contains(locale))
        //Functions more like a for each loop
        .forEach(locale -> System.out.println("Over Complicated Retains: " + locale));
        
    }
}