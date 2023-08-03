package bsu.comp250;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // Instantiating IndexedBook objects for each .txt file
        IndexedBook alice = new IndexedBook("aliceInWonderland.txt");
        IndexedBook dante = new IndexedBook("dantesInferno.txt");
        IndexedBook bible = new IndexedBook("kingJamesBible.txt");
        // Calling the search() method on each object
        alice.search();
        dante.search();
        bible.search();
    }
}
