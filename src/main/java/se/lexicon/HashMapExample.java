package se.lexicon;

import javax.sound.midi.Soundbank;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap <String, String> contacts = new HashMap<>();  //declare a Key and Value.

        contacts.put("Mar", "Martin@gmail.com");
        contacts.put("Mar", "Martin@gmail.com");
        contacts.put("Jose", "Johan@gmail.com");
        contacts.put("John", "Johan@gmail.com");
        System.out.println("create a hashmap with key: Name and value: Email: ");
        System.out.println(contacts);

        System.out.println("--------------------------");
        System.out.println("We get the Key: to the system and the Value Email will printed: ");
        System.out.println(contacts.get("Mar"));
        System.out.println("--------------------------");







    } // end of main
} // end of class
