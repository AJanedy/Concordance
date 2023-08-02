package bsu.comp250;

public class AlphabetizeArray {
    String [] sortedWordsArray;
    int[] sortedIndicesArray;
    String[] wordsArray;
    int[] indicesArray;
    public void AlphabetizeArray(String[] wordsArray, int[] indicesArray) {

        this.wordsArray = wordsArray;
        this.indicesArray = indicesArray;
        this.sortedWordsArray = mergeSort(wordsArray, indicesArray);
    }
    public String[] mergeSort(String[] wordsArray, int[] indicesArray) {

        if (wordsArray.length == 1) {
            return wordsArray;
        }
        int halfway = wordsArray.length / 2;
        String[] leftWordsArray = new String[halfway];
        String[] rightWordsArray = new String[wordsArray.length - halfway];
        int[] leftIndicesArray = new int[halfway];
        int[] rightIndicesArray = new int[wordsArray.length - halfway];

        for (int i = 0; i < halfway; i++) {
            leftWordsArray[i] = wordsArray[i];
            leftIndicesArray[i] = indicesArray[i];
        }
        for (int i = halfway; i < wordsArray.length; i++) {
            rightWordsArray[i - halfway] = wordsArray[i];
            rightIndicesArray[i - halfway] = indicesArray[i];
        }
        leftWordsArray = mergeSort(leftWordsArray, leftIndicesArray);
        rightWordsArray = mergeSort(rightWordsArray, rightIndicesArray);

        sortedWordsArray = merge(leftWordsArray, rightWordsArray, leftIndicesArray, rightIndicesArray);

        return sortedWordsArray;
    }
    public String[] merge(String[] leftWordsArray, String[] rightWordsArray, int[] leftIndicesArray, int[] rightIndicesArray) {

        String[] sortedWords = new String[leftWordsArray.length + rightWordsArray.length];
        int[] sortedIndices = new int[leftWordsArray.length + rightWordsArray.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int returnPointer = 0;

        while (leftPointer < leftWordsArray.length && rightPointer < rightWordsArray.length) {
            if (rightWordsArray[rightPointer].compareToIgnoreCase(leftWordsArray[leftPointer]) < 0) {

                sortedWords[returnPointer] = rightWordsArray[rightPointer];
                sortedIndices[returnPointer] = rightIndicesArray[rightPointer];

                returnPointer++;
                rightPointer++;
            }
            else {
                sortedWords[returnPointer] = leftWordsArray[leftPointer];
                sortedIndices[returnPointer] = leftIndicesArray[leftPointer];

                returnPointer++;
                leftPointer++;
            }
        }
        if (leftPointer == leftWordsArray.length) {
            while (rightPointer < rightWordsArray.length) {
                sortedWords[returnPointer] = rightWordsArray[rightPointer];
                sortedIndices[returnPointer] = rightIndicesArray[rightPointer];

                returnPointer++;
                rightPointer++;
            }
        }
        if (rightPointer == rightWordsArray.length) {
            while (leftPointer < leftWordsArray.length) {
                sortedWords[returnPointer] = leftWordsArray[leftPointer];
                sortedIndices[returnPointer] = leftIndicesArray[leftPointer];

                returnPointer++;
                leftPointer++;
            }
        }
        sortedIndicesArray = sortedIndices;
        return sortedWords;
    }
    public String[] getSortedWordsArray() {
        return sortedWordsArray;
    }
    public int[] getIndicesArray() {
        return sortedIndicesArray;
    }
}
