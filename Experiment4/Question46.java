package Experiment4;

interface Function {
    int evaluate(int x);
}

class Half implements Function {
    @Override
    public int evaluate(int x) {
        return x / 2;
    }
}

public class Question46 {
    public static int[] halveArray(int[] inputArray) {
        Function half = new Half();

        int[] resultArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            resultArray[i] = half.evaluate(inputArray[i]);
        }
        
        return resultArray; 
    }

    public static void main(String[] args) {
        int[] inputArray = {10, 20, 30, 40, 50};
        
        int[] halvedArray = halveArray(inputArray);
        
        System.out.print("Halved values: ");
        for (int val : halvedArray) {
            System.out.print(val + " ");
        }
    }
}



