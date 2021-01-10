public class son extends father{
    private String sex;
    private String phone;
    public son(String sex,String phone){
        super("2019102115","123456");
        this.sex=sex;
        this.phone=phone;
    }
    public String toString(){
        return "性别"+sex+"手机号码"+phone+"学号"+ID+"密码"+password;
    }
}
