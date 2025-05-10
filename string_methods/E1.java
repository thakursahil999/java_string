class E1{
    static void pro()
    {
        System.out.println(this);  //static method belongs to the class  not to the current object
    }
    static {
        System.out.println(this);
    }
    E1()
    {
        System.out.println(this);
    }
    public static void main(String[] args) {
        E1 x= new E1();
    }
}

// E1.java:4: error: non-static variable this cannot be referenced from a static context
//         System.out.println(this);
//                            ^
// E1.java:7: error: non-static variable this cannot be referenced from a static context
//         System.out.println(this);
//                            ^
// 2 errors