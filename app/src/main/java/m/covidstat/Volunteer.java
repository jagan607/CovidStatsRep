package m.covidstat;

public class Volunteer {

    private String name, phone , description;

    public Volunteer(){

    }

    public Volunteer(String name, String phone , String description){
        this.name = name;
        this.phone = phone;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
