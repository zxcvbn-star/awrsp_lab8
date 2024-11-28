public class Person {
    private String name;
    private String surname;
    private String sex;
    private String bornYear;
    private String job;
    private Company company;
    private String salary;
    private Address address;

    public Person(String name, String surname, String sex, String bornYear, String job,
                  Company company, String salary, Address address) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.bornYear = bornYear;
        this.job = job;
        this.company = company;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                ", bornYear='" + bornYear + '\'' +
                ", job='" + job + '\'' +
                ", company=" + company +
                ", salary='" + salary + '\'' +
                ", address=" + address +
                '}';
    }
}