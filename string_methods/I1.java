class Demo{
    int x=55;
}
class I1 extends Demo{
    int x=10;
    public static void main(String[] args) {
        I1 a= new I1();
        a.pro();
    }
    void pro(){
        System.out.println(x); //10

    }
}