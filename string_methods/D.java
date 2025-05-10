class D{
    public static void main(String[] args) {
        
        String a="mississippi";
        int idx=a.indexOf('s');
        System.out.println(idx);

        System.out.println(a.indexOf('s',++idx));
    }
}

// 2
// 3