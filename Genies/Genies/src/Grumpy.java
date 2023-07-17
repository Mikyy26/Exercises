public class Grumpy extends Genie{
    public Grumpy(int maxWishes){
        super(maxWishes);
        currentWishes = 1;
    }


    @Override
    public void grantWish() {
        if(currentWishes > 0){
            System.out.println("I'll only grant you this wish, no more.");
            currentWishes--;
            wishCounter++;
        } else {
            System.out.println("I told you no more wishes!");
        }
    }
}