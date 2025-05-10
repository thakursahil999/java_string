class F{
    F()
    {
        System.out.println(this + "reference code of the current object");
    }
    {
        System.out.println(this);
    }
    public static void main(String[] args) {
        F x= new F();
        System.out.println(x + "reference code of object F");
    }
}

// F@2b2fa4f7
// F@2b2fa4f7reference code of the current object
// F@2b2fa4f7reference code of object F
