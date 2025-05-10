class Demo{
     private int x=10;
     int pro()
     {
        return x;
     }
}
class I6 extends Demo{
     int x=20;
     public static void main(String[] args) {
        I6 a = new I6();
        a.print();
     }
    void print(){
        System.out.println(x); // 20 
        System.out.println(pro()); // 10
    }
}