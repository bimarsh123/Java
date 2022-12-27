class MyInteger {
     private int value;

     public int getValue() //getter gets value
    {
        return value;
    }
    public void setValue(int V) // setter sets value
    {
        this.value=V;
    }
    public boolean isEven(){
        return(getValue()%2==0);
    }
    public boolean isOdd(){
        return(getValue()%2!=0);
    }
    public boolean isPrime()
    {
        if(getValue()==1|| getValue()==2) {
            return true;
        }
        else{
            int i;
            for(i=2;i<getValue();i++)
            {
                if(getValue()%i==0)
                    return false;
            }

        }
        return true;
    }
    public static boolean isEven(int x) {
        return (x % 2 == 0);
    }
    public static boolean isOdd(int y) {
        return (y % 2 != 0);
    }
    public static boolean isPrime(int z) {
        if(z==1|| z==2) {
            return true;
        }
        else{
            int i;
            for(i=2;i<z;i++)
            {
                if(z%i==0)
                    return false;
            }

        }
        return true;
    }

    public static boolean isEven(MyInteger X)
    {
        return X.isEven();
    }
    public static boolean isOdd(MyInteger Y) { return Y.isOdd(); }
    public static boolean isPrime(MyInteger Z) { return Z.isPrime();}

    public boolean equals(int i)
    {
        return(getValue()==i);
    }
    public boolean equals(MyInteger I) {
         return (I.value== this.value);
     }
     public static int parseInt(char[] num) {
         int s = 0;
         for (char i : num)
             s += Character.getNumericValue(i);
         return s;
     }
     public static int parseInt(String s){
         return Integer.parseInt(s);

     }

}

public class Main {
    public static void main(String[] args) {
    MyInteger obj=new MyInteger();
    obj.setValue(3);
    System.out.println(obj.isEven());
    System.out.println(obj.isOdd());
    System.out.println(obj.isPrime());
    System.out.println(obj.isEven(3));
    System.out.println(MyInteger.isOdd(3));
    System.out.println(obj.equals(3));
    System.out.println(MyInteger.parseInt("454"));
    System.out.println(MyInteger.parseInt(new char[] {'1','2','3'}));

    }
}