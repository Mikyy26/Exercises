import java.util.Iterator;

public class IntegerRange implements Iterable<Integer> {

private int max;
private int counter;

public IntegerRange(int min,int max){

    this.max = max;
    this.counter = min;

    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<Integer>{

        @Override
        public boolean hasNext() {
            if(counter<=max){
                return true;
            }

            return false;
        }

        @Override
        public Integer next() {
            if(hasNext() == true){
                return counter++;
            }
            return null;
        }
    }
}
