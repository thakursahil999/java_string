class K{
    public static void main(String[] args) {
        String x="He is a good Boy and He is good in playing cricket";
        int index= x.indexOf("is");
        System.out.println(index);
        System.out.println(x.indexOf("is" , ++index));
    }
}


// 3
// 24
