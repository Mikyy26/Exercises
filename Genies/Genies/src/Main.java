public class Main {
    public static void main(String[] args){
    Lamp lamp1 = new Lamp(2);
    Lamp lamp2 = new Lamp(5);

    lamp1.rub(3);
    lamp1.getGenie(0).grantWish();
    lamp1.getGenie(0).grantWish();
    lamp1.rub(3);
    lamp1.getGenie(1).grantWish();
    lamp1.getGenie(1).grantWish();
    lamp1.rub(1);
    lamp1.rub(3);
    lamp1.getDemon().grantWish();
    lamp1.getDemon().grantWish();
    lamp1.rechargeLamp();






    }
}
