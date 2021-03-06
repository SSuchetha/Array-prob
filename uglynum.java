class Solution 
{
    public boolean isUgly(int num) 
    {
        if (num == 0) 
            return false;
        while (num != 1) 
        {
            if (num % 2 == 0) 
                num = num / 2;
            else if (num % 3 == 0) 
                num = num / 3;
            else if (num % 5 == 0) 
                num = num / 5;
            else
                return false;
        }
        return true;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isUgly(n))
            System.out.println("Ugly");
        else
            System.out.println("Not ugly");
    }
}
