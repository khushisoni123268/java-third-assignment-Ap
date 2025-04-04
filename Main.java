class Main {
    public static void main(String[] args)
    {
        int var1,var2;
        var1=70;
        var2=110;
       System.out.println("Before swapping:");
       System.out.println("A=" + var1);
       System.out.println("B=" + var2);
       var1=var1+var2;
       var2=var1-var2;
       var1=var1-var2;
       System.out.println("After Swapping:");
       System.out.println("A=" + var1); 
       System.out.println("B=" + var2); 

    }
}
/*
 *output
 * Before swapping:
A=70
B=110
After Swapping:
A=110
B=70
 */
