public class Lamp {
    private int maxGenies;
    private int recharges;
    private int counter;
    private int dcounter;
    private Genie[] genies;
    private  Demon[] demons;

    public Lamp(int maxGenies){
        this.maxGenies = maxGenies;
        recharges = 0;
        counter = 0;
        dcounter = 0;
        genies = new Genie[maxGenies];
    }

    public void rub(int maxWishes){

        if (counter == maxGenies && dcounter == 0){
            System.out.println("This lamp is out of charges! Summoning a Djinn.");
            demons = new Demon[1];
            demons[0] = new Demon(maxWishes);
            dcounter++;
            System.out.println("lo, mortal, you are in the presence of " + demons[0].getName() + ". Your wish is my command.");



        }
        else if (counter < maxGenies && counter%2==0) {
            genies[counter] = new Grumpy(maxWishes);
            System.out.println("Who dares awaken the mighty " + genies[counter].getName() + " from their slumber?");
            counter++;

        }
        else if (counter < maxGenies && counter%2!=0){
            genies[counter] = new Friendly(maxWishes);
            System.out.println("Greetings mortal! You stand before the great " + genies[counter].getName() + "! What is your wish?");
            counter++;

        }
        else {
            System.out.println("A Djinn is out already.");
        }
    }

    public void rechargeLamp(){
        if (counter == maxGenies && dcounter == 1){
            demons[0] = null;
            recharges++;
            counter = 0;
            for (int i = 0; i < genies.length; i++){
                genies[i] = null;
            }
            System.out.println("The lamp is charged and ready to use once again.");
        }
        else {
            System.out.println("This lamp still has " + (maxGenies-counter) + " left");
        }
    }

    public int getCapacity(Lamp lamp){
        return lamp.maxGenies - lamp.counter;
    }


    public Genie getGenie(int genieNbr){
        return genies[genieNbr];
    }
    public Demon getDemon(){
        return demons[0];
    }
}









