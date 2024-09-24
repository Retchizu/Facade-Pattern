public class TV implements HomeService{
    @Override
    public void turnOn() {
        System.out.println("Tv turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv turned off");
    }
}