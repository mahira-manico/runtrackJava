package Day2;

public class Person {
    public String name; //public can be used and modified by anyone
    public String surname;
    protected String birthdate; //protected can be used and modified only by children or the class herself
    protected String placeOfBrith;
    private String address; //with private types and protected types, we need getters and setters to modify the value
    private long phoneNumber;

    public Person(String name,String surname,String birthdate, String placeOfBrith,String address,long phoneNumber){
        this.name=name;
        this.surname=surname;
        this.birthdate=birthdate;
        this.placeOfBrith=placeOfBrith;
        this.address=address;
        this.phoneNumber=phoneNumber;
    }

    public String getAddress(){
        return address;
    }
    public long getNumber(){
        return phoneNumber;
    }

    public void setAddress(String newAddress) {
        if (newAdress.length() <= 10) {
            this.address = newAdress;
        } else {
            System.out.println("Address is too short!");
        }
    }

    public void setPhoneNumber(long newPhoneNumber) {
        if (newPhoneNumber.length() < 10) {
            this.phoneNumber = newPhoneNumber;
        } else {
            System.out.println("Phone number is too short or too long!");
        }
    }

    }









}
