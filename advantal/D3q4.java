package advantal;
class cstmException extends Exception{
    public cstmException(String str){

        super(str);

    }
}
class A extends cstmException {
    
    public A(String str)
    {
        super(str);
    }

    
}

public class D3q4{
    public static void main(String[] args) {
        int j = 12;
        int k = 18;
        int l;
        
        try{
            l = j/k;
            if(l<=0){
                throw new A ("done");
            }
        }
        catch(A e){
            System.out.println("let it be " + e);
        } 
    }
}
