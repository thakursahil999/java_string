class D2{
    public static void main(String[] args) {
         String x="mississippi";
         int index=0;
         while((index=x.indexOf('s',index)) !=-1)
         {
            System.out.println(index++);
         }
    }
}

// 2
// 3
// 5
// 6
