
public class Debug
{
    public static void main(String[] args)
    {
    	int value;
    	FirstClass firstClass = new FirstClass();
    	firstClass.print();
        String mango = "mango";
        String mango2 = "mango";
        String mango3 = new String("mango");
        value = mango.compareTo(mango2);
        if(mango == mango3){
         	System.out.println("Are equals");
        }
        else{
        	System.out.println("Are not equals");
        }
        
        
        
        
        System.out.println("Our value is: " + value);
        System.out.println("Strings defined:");
        System.out.println("String mango = \"mango\"");
        System.out.println("String mango2 = \"mango\"");
        System.out.println("String mango3 = new String(\"mango\")");
        System.out.println("Now, a number of operations:");
        System.out.println("mango != mango2: " + (mango != mango2));
        System.out.println("mango == mango2: " + (mango == mango2));
        System.out.println("mango3 != mango2: " + (mango3 != mango2));
        System.out.println("mango3 == mango2: " + (mango3 == mango2));
        System.out.println("mango+\" \"+ mango2: " + "\"" + mango+" "+ mango2+"\"");
        System.out.println("mango != mango2: " + (mango != mango2));
        System.out.println("mango == mango2: " + (mango == mango2));
        System.out.println("System.identityHashCode(mango): " +
            System.identityHashCode(mango));
        System.out.println("System.identityHashCode(mango2): " +
            System.identityHashCode(mango2));
        System.out.println("System.identityHashCode(mango3)" +
            System.identityHashCode(mango3));
        
        
    }
}