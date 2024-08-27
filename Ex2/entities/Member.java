package Ex2.entities;

public class Member extends Family {
    private String name;
    private String dob;
    private String job;

    public Member(int id, int address, String name, String dob, String job) {
        super(id, address);
        this.name = name;
        this.dob = dob;
        this.job = job;
    }


}
