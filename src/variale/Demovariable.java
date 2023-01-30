package variale;

public class Demovariable {
    public static void main(String[] args) {
        String name="pinki";
        System.out.println("Name is " +name);

        name="piku";//reuse of variable
        System.out.println("after reuse name is " +name);

        int a=4;
        int b=5;
        int sum=a+b;
        System.out.println("Value of two number  "+sum);

        int multi=a*b;
        System.out.println("multi of a and b is :"+multi);

        double divide=(double) a/b;
        System.out.println("Divide is :"+divide);

        int remainder=b%a;
        System.out.println("Remainder is :" +remainder);
        a+=b;//a=a+b
        System.out.println("a:"+a);
        int i=1;
        i++;//i=i+1
        System.out.println("Increment of i:"+i);
        int j=2;
        j--;//j=j-2
        System.out.println("Decrement of j:"+j);
    }
}
