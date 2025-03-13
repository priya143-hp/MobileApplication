public class Main {
    public static void main(String[] args) {
                PhoneApplication phone=new PhoneApplication(6,"vivo","andriod",100);
        phone.takePicture();
        phone.takeVideo();
        phone.playGame();
       phone. setcompanyName("samsung");
        System.out.println(phone.getCompanyName());
    
System.out.println("Battery level: " + phone.getbatteryPercentage());
    }
}
        
