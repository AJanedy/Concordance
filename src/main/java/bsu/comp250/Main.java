package bsu.comp250;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        IndexedBook firstIndexedBook = new IndexedBook("test.txt");
        firstIndexedBook.start();


        // FIXME: THIS IS THE ORIGINAL CODE

//        ReadFile alice = new ReadFile();
//        alice.readFile("aliceInWonderland.txt");
//
//        ReadFile inferno = new ReadFile();
//        inferno.readFile("dantesInferno.txt");
//
//        ReadFile bible = new ReadFile();
//        bible.readFile("kingJamesBible.txt");
//
//        QueryAndSearch aliceQuery = new QueryAndSearch();
//        aliceQuery.searchQuery(alice.getStringFileName(), alice.getArrayLength(), alice.getArray());
//
//        QueryAndSearch infernoQuery = new QueryAndSearch();
//        infernoQuery.searchQuery(inferno.getStringFileName(), inferno.getArrayLength(), inferno.getArray());
//
//        QueryAndSearch bibleQuery = new QueryAndSearch();
//        bibleQuery.searchQuery((bible.getStringFileName()), bible.getArrayLength(), bible.getArray());
    }
}
