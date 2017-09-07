package training.sati.com.training01.dao;

/**
 * Created by Dilip Kumar on 2016-10-08.
 */
public class Contacts {
    String name;
    String number;

    public Contacts(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


}
