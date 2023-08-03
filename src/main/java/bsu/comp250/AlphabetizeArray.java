package bsu.comp250;

public class AlphabetizeArray {
    // This function takes an array of objects and returns a new array that is sorted
    public IndexedWordObject[] mergeSort(IndexedWordObject[] arrayToSort) {

        // Base case: if array has 1 element, it is sorted by default
        if (arrayToSort.length == 1) {
            return arrayToSort;
        }
        // Split the array into two half size arrays
        int halfway = arrayToSort.length / 2;
        IndexedWordObject[] leftWordsArray = new IndexedWordObject[halfway];
        IndexedWordObject[] rightWordsArray = new IndexedWordObject[arrayToSort.length - halfway];
        // Copy array[0 - halfway] to another array
        for (int i = 0; i < halfway; i++) {
            leftWordsArray[i] = arrayToSort[i];
        }
        // Copy array[halfway - end] to another array
        for (int i = halfway; i < arrayToSort.length; i++) {
            rightWordsArray[i - halfway] = arrayToSort[i];
        }
        // Call to mergeSort to get each half array sorted
        leftWordsArray = mergeSort(leftWordsArray);
        rightWordsArray = mergeSort(rightWordsArray);
        // Return the sored array
        return merge(leftWordsArray, rightWordsArray);
    }
    // Takes two sorted arrays and puts them together into one sorted array
    public IndexedWordObject[] merge(IndexedWordObject[] leftWordsArray, IndexedWordObject[] rightWordsArray) {

        IndexedWordObject[] sortedWords = new IndexedWordObject[leftWordsArray.length + rightWordsArray.length];
        // Points to next element in the "left" and "right" arrays to be compared
        int leftPointer = 0;
        int rightPointer = 0;
        // Points to the next location to put something in the return array
        int returnPointer = 0;
        // Run this until one of the arrays is finished
        // leftPointer = leftWordsArray.length then done.  rightPointer = rightWordsArray.length, also done
        while (leftPointer < leftWordsArray.length && rightPointer < rightWordsArray.length) {
            // Does "right" word come first?
            if (rightWordsArray[rightPointer].word.compareToIgnoreCase(leftWordsArray[leftPointer].word) < 0) {
                // "Right" word comes first, move it to new array
                sortedWords[returnPointer] = rightWordsArray[rightPointer];

                returnPointer++; // Advance returnPointer to next empty space
                rightPointer++; // Move to next element in right array
            }
            else {
                // "Left" word comes first, move it to new array
                sortedWords[returnPointer] = leftWordsArray[leftPointer];

                returnPointer++; // Advance returnPointer to next empty space
                leftPointer++; // Move to next element in left array
            }
        }
        // If "right" array is finished, copy "left" array
        if (leftPointer == leftWordsArray.length) {
            // Go until we finish "right" array
            while (rightPointer < rightWordsArray.length) {
                // Copy from "right" array to return array
                sortedWords[returnPointer] = rightWordsArray[rightPointer];

                returnPointer++; // Advance returnPointer to next empty space
                rightPointer++; // Move to next element in "right" array
            }
        }
        // If "left" array is finished, copy "left" array
        if (rightPointer == rightWordsArray.length) {
            // Go until we finish "left" array
            while (leftPointer < leftWordsArray.length) {
                // Copy from "left" array to return array
                sortedWords[returnPointer] = leftWordsArray[leftPointer];

                returnPointer++; // Advance returnPointer to next empty space
                leftPointer++; // Move to next element in "left" array
            }
        }
        return sortedWords;
    }
}
