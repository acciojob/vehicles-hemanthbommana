package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name,isManual);
    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed()+rate; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        //int newSpeed = getCurrentSpeed() + rate; // calculate new speed

        if (newSpeed <= 0) {
            // Stop the car, set gear as 1
            stop();
            setCurrentSpeed(0);
            changeGear(1);
        }
        else {
            // Change the gear based on the new speed
            if (newSpeed >= 1 && newSpeed <= 50) {
                changeGear(1);
            } else if (newSpeed <= 100) { // 51–100
                changeGear(2);
            } else if (newSpeed <= 150) { // 101–150
                changeGear(3);
            } else if (newSpeed <= 200) { // 151–200
                changeGear(4);
            } else if (newSpeed <= 250) { // 201–250
                changeGear(5);
            } else { // > 250
                changeGear(6);
            }

            // Finally update the speed and keep the same direction
            changeSpeed(newSpeed, getCurrentDirection());
        }
    
    }

}
