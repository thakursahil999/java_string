class Demo{
    int x=55;
}
class I3 extends Demo{
    int x=10;
    public static void main(String[] args) {
        I3 a= new I3();
        a.pro();
    }
    void pro(){
        int x=22;
        System.out.println(x); // 22
        System.out.println(this.x); // 10  
        System.out.println(super.x); // 55 

    }
}