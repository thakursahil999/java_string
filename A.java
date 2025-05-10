class A{
    String name="mohan"; // create String object in String constant pool
    String name1=new String("rohan"); // new keyword create objet in non pool area
    public static void main(String[] args) {
        A x=new A();
        System.out.println(x.name + "    String constant pool");
        System.out.println(x.name1 + "   string object in non pool");
    }

}