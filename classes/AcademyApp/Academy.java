package AcademyApp;

public class Academy {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Academy(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Academy() {
    }

    public void displayInfo() {
        System.out.println("Academy name: " + name + ", address: " + address);
    }
}
