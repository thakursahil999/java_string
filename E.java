class E{
    String name;
    int age;
    E(String name,int age)
    {
        
    }
    public static void main(String[] args) {
        E x=new E("rajesh",9);
        E y=new E("rajesh",9);

        System.out.println(x == y);
        System.out.println(x.equals(y));
    }
}

// false
// false