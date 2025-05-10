class K1{
    public static void main(String[] args) {
        String x="He is a good Boy and He is good in playing cricket . he is a army man who is not worried of anyhthing";
        int index= 0;
        while((index = x.indexOf("is" , index) )!= -1 )
        {
            System.out.println(index++);
        }
    }
}

// 3
// 24
// 56
// 74