class D1{
    public static void main(String[] args) {
         String x="mississippi";

        int index=x.indexOf('s');
        System.out.println(index);

        while(index !=-1)
        {
            System.out.println(index=x.indexOf('s',++index));
        }
    }
}

// 2
// 3
// 5
// 6
// -1