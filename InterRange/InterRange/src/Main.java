public class Main {
    public static void main(String[] args) {
        IntegerRange integerRange = new IntegerRange(-10,10);
        while (integerRange.iterator().hasNext()){
            int value = integerRange.iterator().next();
            System.out.println(value);
        }

        //System.out.println(integerRange);
    }
}
