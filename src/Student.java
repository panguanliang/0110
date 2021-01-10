public class Student extends User{
    private String phone;
    private int year;

    public int getYear() {
        return year;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
