class Demo{
    int x=55;
}
class I2 extends Demo{
    int x=10;
    public static void main(String[] args) {
        I2 a= new I2();
        a.pro();
    }
    void pro(){
        int x=22;
        System.out.println(x); //22

    }
}