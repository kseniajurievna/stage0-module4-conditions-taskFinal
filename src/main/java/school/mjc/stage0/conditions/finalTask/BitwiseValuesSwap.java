package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        second = first & second;
        first = first | second;
    }
}
