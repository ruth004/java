public class AirConditioner {
    private String name;
    private String model;
    private int size;
    private float weight;
    private boolean state = false;
    private int temperature = 30;

    public boolean getState() {

        return state;
    }

    public void setState(boolean state) {

        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public float getWeight()
    {
        return weight;
    }

    public void setWeight(float weight) {

        this.weight = weight;
    }

    public int getTemperature() {

        return this.temperature;
    }

    public void increaseTemperature() {
        if(this.temperature > 16) {
            this.temperature = this.temperature - 1;
        }
    }

    public void setTemperature(int number) {
        this.temperature = number;
    }

    public void decreaseTemperature() {
        if(this.temperature < 30){
            this.temperature = this.temperature + 1;

        }
    }

}