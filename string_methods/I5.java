class Demo{
     private int x=10;
}
class I5 extends Demo{
     int x=20;
     public static void main(String[] args) {
        I5 a = new I5();
        a.print();
     }
    void print(){
        System.out.println(x);
        System.out.println(super.x); // here memory is allocated in the object but cannot access bcz of private int x in the parent
    }
}

// I5.java:12: error: x has private access in Demo
//         System.out.println(super.x);
//                                 ^
// 1 error