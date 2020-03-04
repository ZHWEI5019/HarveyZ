public class IdentityCardNo{
    public static IdentityCardNo instance = null;
    public String no;

    private  IdentityCardNo(){

    }

    public static IdentityCardNo getInstance(){
        if(instance == null) {
            System.out.println("1");
            instance = new IdentityCardNo();
            instance.setIdentityCardNo("111111");
        }else {
            System.out.println("2");
        }
        return instance;
    }

    public void setIdentityCardNo(String no) {
        this.no = no;
    }

    public String getIdentityCardNo() {
        return this.no;
    }

    public static void main(String[] args){
        IdentityCardNo no1,no2;
        no1=IdentityCardNo.getInstance();
        no2=IdentityCardNo.getInstance();
        System.out.println("身份证号码是否一致：" + (no1==no2));
        
        String str1,str2;
        str1=no1.getIdentityCardNo();
        str2=no1.getIdentityCardNo();
        System.out.println("第一次号码：" + str1);
        System.out.println("第二次号码：" + str2);
        System.out.println("内容是否相等：" + str1.equalsIgnoreCase(str2));
        System.out.println("是否是相同对象：" + (str1==str2));

    }
}