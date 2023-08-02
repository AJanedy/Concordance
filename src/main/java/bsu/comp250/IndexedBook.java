package bsu.comp250;
import java.io.IOException;

public class IndexedBook {
    String originalText;
    String originalFileName;
    int arrayLength;
    String[] UncleanedWordsArray;
    String[] cleanedWordsArray;
    String[] alphabetizedArray;
    int[] sortedIndices;
    int[] indicesArray;
    public IndexedBook(String originalFileName) throws IOException {

        CountWords countWords = new CountWords();
        StringBuilder stringBuilder = new StringBuilder();
        BuildWordsArray buildWordsArray = new BuildWordsArray();
        CleanWords cleanWords = new CleanWords();
        AlphabetizeArray alphabetizeArray = new AlphabetizeArray();



        this.originalText = stringBuilder.StringBuilder(originalFileName);
        this.originalFileName = originalFileName;
        this.arrayLength = countWords.CountWords(originalFileName);
        this.UncleanedWordsArray = buildWordsArray.BuildWordsArray(originalText, arrayLength);
        this.cleanedWordsArray = cleanWords.Cleanwords(UncleanedWordsArray, arrayLength);
        this.indicesArray= makeIndexArray(arrayLength);
        alphabetizeArray.AlphabetizeArray(cleanedWordsArray, indicesArray);
        this.alphabetizedArray = alphabetizeArray.sortedWordsArray;
        this.sortedIndices = alphabetizeArray.sortedIndicesArray;
    }
    public void start() throws IOException {

        System.out.println("Starting the program");
//        System.out.println(arrayLength);
//        System.out.println(originalFileName);
//        System.out.println(originalText);
//        for (int i = 0; i < arrayLength; i++) {
//            System.out.println(UncleanedWordsArray[i]);
//        }
        for (int i = 0; i < alphabetizedArray.length; i++) {
            System.out.println(alphabetizedArray[i]);
        }
        BuildWordsDotTxt buildWordsDotTxt = new BuildWordsDotTxt();
        buildWordsDotTxt.BuildWordsDotTxt(cleanedWordsArray, originalFileName, arrayLength);

        BuildSortedDotTxt buildSortedDotTxt = new BuildSortedDotTxt();
        buildSortedDotTxt.BuildSortedDotTxt(cleanedWordsArray, originalFileName, arrayLength);
    }
    public int[] makeIndexArray(int arrayLength) {

        arrayLength = arrayLength;
        indicesArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            indicesArray[i] = i;
        }
        return indicesArray;
    }
}

