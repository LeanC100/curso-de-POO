package JAVA;

public class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passegenger;
    
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    public void toPrint(){
        System.out.println("License: " + license );
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    public Integer getPassegenger() {
        return passegenger;
    }

    public void setPassegenger(Integer passegenger) {
        if (passegenger == 4) {
            this.passegenger = passegenger;
        } else {
            System.out.println("Necesitas 4 pasajeros");
        }
    }

    
}
