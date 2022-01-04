class Student {
    private String name;
    private int id;
    private double gpa;

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int r) {
        this.id = r;
    }

    public void setGpa(double g) {
        this.gpa = g;
    }

    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public String toString() {
        return id + " " + name + " " + gpa;
    }
}

class Undergrad extends Student {
    private int year;

    void setYear(int y) {
        year = y;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return getId() + " " + getName() + " " + getGpa()+" "+year;
    }
}

class Graduate extends Student {
    private String thesisTitle;

    void setThesis(String t) {
        thesisTitle = t;
    }

    public String getThesis() {
        return thesisTitle;
    }

    public String toString() {
        return getId() + " " + getName() + " " + getGpa()+" "+thesisTitle;
    }
}

public class Lab5{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Aalok ");
        s.setGpa(8);
        s.setId(1);
        System.out.println("==>> "+s.toString());;

        Graduate s1 = new Graduate();
        Undergrad s2 = new Undergrad();

        s1.setName("Aalok Tanwar");
        s1.setGpa(8);
        s1.setId(1);
        s1.setThesis("Computer Vision");
        System.out.println("==>> "+s1.toString());

        s2.setName("Vinay");
        s2.setGpa(9);
        s2.setId(2);
        s2.setYear(2020);
        System.out.println("==>> "+s2.toString());
        
    }
}