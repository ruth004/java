public class Bike {
    private boolean state;
    private int gear = 1;
    private int currentSpeed;

    public Bike(boolean state, int gear, int speed){
        this.state = state;
        this.gear = gear;
        this.currentSpeed = speed;
    }

    public void turnOn(){
        this.state = true;
    }

    public void turnOff(){

        this.state = false;
    }

    public void accelerate(){
        if(this.gear == 1 && this.currentSpeed <= 20){
            this.currentSpeed += 1;
        } else if(this.gear == 2 && this.currentSpeed <= 30){
            this.currentSpeed += 2;
        } else if (this.gear == 3 && this.currentSpeed <= 40){
            this.currentSpeed += 3;
        } else if(this.gear == 4 && this.currentSpeed > 40){
            this.currentSpeed += 4;
        }

        if(this.currentSpeed <= 20){
            this.gear = 1;
        } else if (this.currentSpeed >= 21 && this.currentSpeed <= 30){
            this.gear = 2;
        }else if (this.currentSpeed >= 31 && this.currentSpeed <= 40){
            this.gear = 3;
        }else if (this.currentSpeed > 40){
            this.gear = 4;
        }


    }

    public void decelerate(){
        if(this.gear == 1 && this.currentSpeed <= 20 && this.currentSpeed != 0) {
            this.currentSpeed -= 1;
        }else if(this.gear == 2 && this.currentSpeed <= 30) {
            this.currentSpeed -= 2;
        }else if(this.gear == 3 && this.currentSpeed <= 40) {
            this.currentSpeed -= 3;
        }else if(this.gear == 4 && this. currentSpeed < 40) {
            this.currentSpeed -= 4;
        }

        if(this.currentSpeed <= 20) {
            this.gear = 1;
        }else if(currentSpeed >= 21 && this.currentSpeed >= 30) {
            this.gear = 2;
        }else if(currentSpeed >= 31 && this.currentSpeed >= 40) {
            this.gear = 3;
        }else if(currentSpeed > 40){
            this.gear = 4;

        }
    }

    public boolean getState() {
        return this.state;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public int getGear() {
        return this.gear;

    }
}
