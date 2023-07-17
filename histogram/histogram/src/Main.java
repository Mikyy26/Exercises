public class Main {

    public static final String STRING = "test word words test 1 10 1";

    public static void main(String[] args) {

        WordHistogram wordHistogram = new WordHistogram(STRING);
        System.out.println("MAP has " + wordHistogram.size() + " disctinct words");

        for(String word : wordHistogram){

            System.out.println(word + " : " + wordHistogram.get(word));
        }
    }
}
