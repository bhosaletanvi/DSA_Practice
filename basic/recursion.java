public class recursion {
    public void main(){
        fun();
    }
    static int count=0;
    void fun(){
        if(count==3){
            return;
        }
        System.out.println(count);
        count++;
        fun();
    }
    
}
