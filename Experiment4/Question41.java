package Experiment4;

public class Question41 {
    public static void set(int value, int indexX, int indexY, int indexZ, int[] array, int X, int Y, int Z) {
        int index = indexX * (Y * Z) + indexY * Z + indexZ;
        array[index] = value;
    }
    
    public static int get(int indexX, int indexY, int indexZ, int[] array, int X, int Y, int Z) {
        int index = indexX * (Y * Z) + indexY * Z + indexZ;
        return array[index];
    }

    public static void main(String[] args) {
        int X = 3, Y = 3, Z = 3;
        int[] array = new int[X * Y * Z]; 

        set(10, 0, 0, 0, array, X, Y, Z); 
        set(20, 1, 1, 1, array, X, Y, Z); 
        set(30, 2, 2, 2, array, X, Y, Z); 

        System.out.println("Value at (0, 0, 0): " + get(0, 0, 0, array, X, Y, Z)); 
        System.out.println("Value at (1, 1, 1): " + get(1, 1, 1, array, X, Y, Z)); 
        System.out.println("Value at (2, 2, 2): " + get(2, 2, 2, array, X, Y, Z)); 
    }
}

