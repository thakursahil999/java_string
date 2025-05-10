class Demo{
    void pro()
    {
        System.out.println("pro() in parent (Demo)");
    }
}
class I4 extends Demo{
    void pro()
    {
        System.out.println("pro() in child(I4)");
    }
    void info()
    {
        pro();
        super.pro();
    }
    public static void main(String[] args) {
        I4 x= new I4();
        x.info();
    }
}

// pro() in child(I4)
// pro() in parent (Demo)

// pro() in child(I4)