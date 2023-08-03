package bsu.comp250;
import java.io.IOException;

public class IndexedBook {
    String originalText; // String holding the entire file as a string
    String originalFileName; // String holding the original file name
    int arrayLength; // int representing the length of the array needed to hold every word in the text
    String[] uncleanedWordsArray; // An array of the words without non-alphanumeric characters stripped
    String[] cleanedWordsArray; // An array of the words having been stripped of leading and trailing non-alphas
    IndexedWordObject[] indexedWords; // An array of IndexedWordObject objects (alphabetized index)
    int indexedArrayLength; // int representing the length of the array needed to hold the indexed words

    // This is the constructor for IndexedBook.  The only parameter is the name of the file (file.txt)
    public IndexedBook(String originalFileName) throws IOException {

        CountWords countWords = new CountWords();
        StringBuilder stringBuilder = new StringBuilder();
        BuildWordsArray buildWordsArray = new BuildWordsArray();
        CleanWords cleanWords = new CleanWords();
        AlphabetizeArray alphabetizeArray = new AlphabetizeArray();

        this.originalText = stringBuilder.StringBuilder(originalFileName);
        this.originalFileName = originalFileName;
        this.arrayLength = countWords.CountWords(originalFileName);
        this.uncleanedWordsArray = buildWordsArray.BuildWordsArray(originalText, arrayLength);
        this.cleanedWordsArray = cleanWords.Cleanwords(uncleanedWordsArray, arrayLength);
        this.indexedWords = new IndexedWordObject[arrayLength];

        // Loop iterating through the length of the original array that then adds and object "IndexedWordObject"
        // That contains each word (in alphabetical order) and its corresponding index.
        for (int i = 0; i < arrayLength; i++) {
            indexedWords[i] = new IndexedWordObject();
            indexedWords[i].IndexedWordObject(cleanedWordsArray[i], i);
        }
        long startTime = System.currentTimeMillis(); // Used to calculate the runtime of mergeSort
        this.indexedWords = alphabetizeArray.mergeSort(indexedWords);
        long endTime = System.currentTimeMillis(); // Used to calculate the runtime of mergeSort

        System.out.println("It took " + (endTime - startTime) + "ms to merge sort " + originalFileName);
        System.out.println("If runtime = k x arrayLength x log(arrayLength), then k = runtime / (arrayLength x log(arrayLength");
        System.out.println("Thus, k = " + (endTime - startTime) / (arrayLength * Math.log(arrayLength)));
        System.out.println();

        start();
    }
    public void start() throws IOException {

        BuildWordsDotTxt buildWordsDotTxt = new BuildWordsDotTxt();
        buildWordsDotTxt.BuildWordsDotTxt(cleanedWordsArray, originalFileName, arrayLength);

        BuildSortedDotTxt buildSortedDotTxt = new BuildSortedDotTxt();
        buildSortedDotTxt.BuildSortedDotTxt(indexedWords, originalFileName);

        BuildIndexDotTxt buildIndexDotTxt = new BuildIndexDotTxt();
        buildIndexDotTxt.BuildIndexDotTxt(indexedWords, originalFileName);
        indexedArrayLength = buildIndexDotTxt.getArrayLength();
    }
    public void search() throws IOException {
        QueryAndSearch queryAndSearch = new QueryAndSearch();
        queryAndSearch.searchQuery(originalFileName + "_index.txt", indexedArrayLength, uncleanedWordsArray);
    }
}

