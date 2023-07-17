public class Demon extends Genie{
    public Demon(int maxWishes){
        super(maxWishes);
        name = demonNames[(int)(Math.random()*20)];
    }

    @Override
    public void grantWish() {
        if (currentWishes > 0) {
            currentWishes--;
            wishCounter++;
            System.out.println("Wish granted. You have " + currentWishes + " remaining.");

        } else {
            wishCounter++;
            System.out.println("You have no wishes left, but I'll grant you this wish anyway.");
        }
    }
}