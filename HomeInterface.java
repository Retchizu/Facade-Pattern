public class HomeInterface {
    private Light light;
    private AirConditioning airConditioning;
    private TV tv;

    public HomeInterface(Light light, AirConditioning airConditioning, TV tv) {
        this.light = light;
        this.airConditioning = airConditioning;
        this.tv = tv;
    }

    public void turnOnAll(){
        light.turnOn();
        airConditioning.turnOn();
        tv.turnOn();
    }

    public void turnOffAll(){
        light.turnOff();
        airConditioning.turnOff();
        tv.turnOff();
    }
}
