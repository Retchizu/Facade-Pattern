public class AirConditioning implements HomeService{
    @Override
    public void turnOn() {
        System.out.println("AirConditioning turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("AirConditioning turned off.");
    }
}
