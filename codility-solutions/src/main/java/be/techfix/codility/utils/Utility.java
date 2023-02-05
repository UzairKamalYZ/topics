package be.techfix.codility.utils;

public class Utility {
    public char[] rotateClockWise(char[] array, int n)
    {
        char temp;
        int i;
        temp = array[n - 1];
        for (i = n-1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
        return array;
    }

    public char[] rotateAntiCWArrayByOne(char[] array) {
        char temp;
        int i;
        temp = array[0];
        for (i = 0; i < array.length - 1; i++)
        {
            array[i] = array[i + 1];
        }
        array[i] = temp;
        return array;
    }

}
