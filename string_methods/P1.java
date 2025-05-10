class P1{
    public static void main(String[] args) {
        String a="begusaray";
        String c="begusiriy";
        String b=a.replace('a','i');
        System.out.println(a);
        System.out.println(b);
        System.out.println(c == b + "here we check are both the string have the same reference code");
    }
}

// begusaray
// begusiriy
// false  --- means the replaced string object created in non pool area
