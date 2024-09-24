class HomeApp {
    public static void main(String[] args){
        Light light = new Light();
        TV tv = new TV();
        AirConditioning airConditioning = new AirConditioning();

        HomeInterface homeInterface = new HomeInterface(light, airConditioning, tv );

        homeInterface.turnOnAll();
        System.out.println("--------");
        homeInterface.turnOffAll();
    }

}