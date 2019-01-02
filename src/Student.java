import java.util.Date;

public class Student {
    String name;
    Integer matrikelnummer;
    String jahr;

    public Student(String name, Integer matrikelnummer, String jahr) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.jahr = jahr;
    }

    public Student() {
    }

    public String toString(){
        return (this.name + " " + this.matrikelnummer + " " + this.jahr);
    }
}
