class H{
    int x=23;
    public static void main(String[] args) {
        H g=new H();
        g.pro();
    }
    void pro(){
        int x=11;
        System.out.println(x);  //11
        System.out.println(this.x);
    }
}

// 11
// 23