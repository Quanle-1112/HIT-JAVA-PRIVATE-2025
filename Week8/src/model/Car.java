package model;

import constant.Message;
import exception.BrokenCarException;
import java.util.Random;

public class Car implements Runnable{
    private String name;
    private double speed;
    private Random random = new Random();

    public Car() {
    }

    public Car(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


    @Override
    public void run() {
        try{
            for(int i=1;i<=30;i++) {
                if(random.nextInt(100)<10) {
                    throw new BrokenCarException(String.format(Message.ErrorMessage.BROKEN_CAR_ERROR, name));
                }
                int max = (int) speed;
                if(max<100) {
                    max=100;
                }
                int sleepTime = 100 + random.nextInt((int)(max-100));
                Thread.sleep(sleepTime);
                System.out.printf(Message.SuccessMessage.CAR_RUN_SUCCESS, name, i);
            }

            System.out.printf(Message.SuccessMessage.CAR_FINiSH_SUCCESS, name);
        } catch (BrokenCarException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            System.out.println(Message.ErrorMessage.INTERRUPTED_CAR_ERROR);
            //e.printStackTrace()
        }
    }
}

