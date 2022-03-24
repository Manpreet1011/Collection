public class Student implements Comparable<Student> {
    String name;
    int rollNo;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    public  Student(String name, int rollNo)
    {
        this.name=name;
        this.rollNo=rollNo;
    }
    public void display()
    {
        System.out.println("Name of Student= "+name);
        System.out.println("Roll number of Student is ="+rollNo);
    }

    @Override
    public int compareTo(Student o) {
        return o.name.compareTo(this.name);
    }
}
