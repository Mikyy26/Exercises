package org.bootcamp88;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Alarm {

    private Timer timer;

    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        int[] intervals = alarm.getInputFromTerminal();
        alarm.start(intervals[0], intervals[1]);

        System.out.println(Thread.currentThread().getName());
    }

    private void start(int numbRings, int ringItv) {
        timer = new Timer();
        timer.scheduleAtFixedRate(new Ring(numbRings), ringItv * 80, ringItv * 80);
    }

    private void stop() {
        timer.cancel();
    }

    private int[] getInputFromTerminal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of times to ring?");
        int numbRings = Integer.parseInt(scanner.next());
        System.out.println("Ring interval in seconds?");
        int ringItv = scanner.nextInt();

        return new int[]
        {numbRings, ringItv};
    }

    private class Ring extends TimerTask {

        private int numbRings;

        public Ring(int numbRings) {
            this.numbRings = numbRings;
        }

        @Override
        public void run() {

            System.out.println(Thread.currentThread().getName());
            System.out.println("Alarm is ringing...ACORDA!!!!!");
            numbRings--;

            if(numbRings == 0) {
                System.out.println("Alarm cancelled");
                stop();
            }
        }
    }
}
