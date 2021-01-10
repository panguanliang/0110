public class son extends father{
    private String sex;
    private String phone;
    public son(String sex,String phone){
        super("2019102115","123456");
        this.sex=sex;
        this.phone=phone;
    }
    public String toString(){
        return "性别："+sex+"\n手机号码"+phone+"\n学号:"+ID+"\n密码:"+password;
    }
}
