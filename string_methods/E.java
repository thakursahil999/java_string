class E{
    void pro(){
        System.out.println(this); //the this keyword give the current object where the method is call
    }
    E()
    {
        System.out.println(this); //this keyword gives the current object where the object being constructed
    }
    {
        System.out.println(this);
    }
    public static void main(String[] args) {
        E x=new E();
        x.pro();
        
    }
}

// E@2b2fa4f7
// E@2b2fa4f7
// E@2b2fa4f7
