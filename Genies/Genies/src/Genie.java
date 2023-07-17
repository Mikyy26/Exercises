public class Genie {
        private static int maxWishes;
        public int currentWishes;

        public static int wishCounter = 0;

        public String name;



        public Genie(int maxWishes) {
            this.maxWishes = maxWishes;
            currentWishes = maxWishes;
            name = genieNames[(int)(Math.random()*50)];
        }



        public void grantWish() {
            if (currentWishes > 0) {
                currentWishes--;
                System.out.println("Wish granted. You have " + currentWishes + " remaining.");
                wishCounter++;

            } else {
                System.out.println("I will grant you no more wishes.");
            }
        }

        public void wishesAsked(){
            System.out.println("You have been granted these many wishes: " + wishCounter);
        }

    String[] genieNames = {
            "Azazel", "Zephyr", "Zarathustra", "Alara", "Kasim", "Jazira", "Malachi", "Zahara", "Samir", "Amara",
            "Razi", "Zara", "Malik", "Farah", "Nizar", "Soraya", "Aziza", "Zahir", "Layla", "Nadir",
            "Amina", "Darius", "Zarael", "Yasmin", "Amar", "Nasira", "Sabir", "Farida", "Rashid", "Zaina",
            "Jamal", "Marika", "Rafiq", "Azra", "Tariq", "Aleela", "Hakeem", "Zuleika", "Khalid", "Farah",
            "Rahma", "Zain", "Aaliyah", "Idris", "Safiya", "Aziza", "Kareem", "Sana", "Najib", "Layla"
    };
    String[] demonNames = {
            "Malevolus", "Vexar", "Morgrath", "Lilith", "Belial", "Draugr", "Malum", "Hades", "Ravenna", "Bane",
            "Nefarian", "Xanthos", "Styx", "Seraphine", "Azazel", "Zephyrus", "Morgana", "Mordred", "Draven", "Vespera",
            "Lucius", "Desdemona", "Infernus", "Maleficent", "Kael'thas", "Nemesis", "Hexen", "Erebos", "Sable", "Abaddon"
    };

    public String getName(){
        return name;
    }





}

