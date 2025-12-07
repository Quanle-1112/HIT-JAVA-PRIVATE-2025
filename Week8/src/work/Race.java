package work;

import constant.Message;
import model.Car;

public class Race {
    public void carRace() {
        Thread car1 = new Thread(new Car("VF3", 200));
        Thread car2 = new Thread(new Car("VF2", 300));
        Thread car3 = new Thread(new Car("VF1", 400));
        System.out.println(Message.SuccessMessage.CAR_START_SUCCESS);

        car1.start();
        car2.start();
        car3.start();
    }
}
