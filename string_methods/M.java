class M{
    public static void main(String[] args) {
        String x="He is a good Boy and He is good in playing cricket . 1 he is a army man who is not worried of anyhthing";
        int index=x.length(); //*********** 
        while((index=x.lastIndexOf('o',index)) !=-1)
        {
            System.out.println(index--); //********** 
        }
    }
}

// 91
// 84
// 80
// 74
// 29
// 28
// 14
// 10
