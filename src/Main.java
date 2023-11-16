public class Main {
    public static int[] combine(int[] array1, int[] array2) {
        int[] combinedArray = new int[array1.length + array2.length];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            combinedArray[index] = array1[i];
            index++;
        }

        for (int i = 0; i < array2.length; i++) {
            combinedArray[index] = array2[i];
            index++;
        }
        return combinedArray;
        }
    public static int[] zip(int[] array1, int[] array2) {
        int[] zippedArray = new int[array1.length * 2];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            zippedArray[index] = array1[i];
            zippedArray[index + 1] = array2[i];
            index += 2;
        }
        return zippedArray;
    }

    public static int[] product(int[] array1, int[] array2) {
        int productArray[] = new int[array1.length];
        for(int i = 0; i<array1.length; i++){
            productArray[i] = array1[i]*array2[i];
        }
        return productArray;
    }

    public static int[] capitalCount(String[] words) {
        int[] countArray = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            countArray[i] = countCapitalLetters(words[i]);
        }
        return countArray;
    }
    public static int countCapitalLetters(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isAlphabetic(c) && Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
}
