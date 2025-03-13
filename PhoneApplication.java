public class PhoneApplication {
 private   int  screenSize;
private String companyName;
private String operatingSystem;
int batteryPercentage ;
   public   PhoneApplication(int screenSize,String companyName,String operatingSystem,int batteryPercentage){
        screenSize=screenSize;
        companyName=companyName;
        operatingSystem=operatingSystem;
         batteryPercentage=100;
      }
     public void setScreenSize(int screenSize){
        this.screenSize=screenSize;
      }
    public  void setcompanyName(String companyName){
        this.companyName=companyName;
    
      }
     public void setoperatingSystem(String operatingSystem){
        this.operatingSystem=operatingSystem;

      }
     public void setbatteryPercentage(int batteryPercentage){
        this.batteryPercentage=batteryPercentage;
      }
      
      
     public int getscreenSize(){
        return screenSize;
      }
      String getCompanyName(){
        return companyName;

      }
      String getoperatingSystem(){
        return operatingSystem;
      }
      int getbatteryPercentage(){
        return batteryPercentage;
      }
      void takePicture(){
        if(batteryPercentage < 10){
            System.out.println("battery is not sufficent to take picture");
        }
            else{
                System.out.println("picture is taken");

                batteryPercentage -=10;
                
            }
        }
         public   void takeVideo(){
                if(batteryPercentage <30){
                    System.out.println("battery is not sufficent to take video");
                }
                else{
                    System.out.println("video is taken");
                    batteryPercentage-=30;
                }

            }
          public  void playGame(){
                if(batteryPercentage <60){
                    System.out.println("battery is not sufficent to play  game");
                }
                else{
                    System.out.println("playing game ");
                    batteryPercentage -=60;
                }
            }
           public void charge(){
                batteryPercentage=100;
                System.out.println("battery is charged");
            }
        }

      
       
      


