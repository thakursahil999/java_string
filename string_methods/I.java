class Demo{
    int x=55;
}
class I extends Demo{
    public static void main(String[] args) {
        I a= new I();
        a.pro();
    }
    void pro(){
        System.out.println(x); //55
    }
}