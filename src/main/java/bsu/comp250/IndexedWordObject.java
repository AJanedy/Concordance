package bsu.comp250;

// This is a class to create objects to add to our array of objects, indexedWords in the IndexedBook class.
// This is the array that will be used to more efficiently and more readably execute the merge sort
public class IndexedWordObject {
    public String word;
    public int index;
    public void IndexedWordObject(String word, int index) {
        this.word = word;
        this.index = index;
    }
}
