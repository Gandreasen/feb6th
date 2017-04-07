/**
 * https://www.youtube.com/watch?v=T8dNBmK40d0
 * 
 * Static can be referenced at any time.
 * NonStatic can only be reference if you have an instance of the class created.
 */
public class Duck
{
    // instance variables - replace the example below with your own
    private int  size;
    private static int numOfDucks;
    
    int getSize(){
        return size;
    }
    
    void setSize(int size){
        this.size = size;
    }
    
    Duck(){
        numOfDucks++;
    }
    
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            Duck d = new Duck();
            d.setSize(10);
            System.out.println("Size of duck is " + d.getSize());
            System.out.println("Number of duck is " + numOfDucks);
    
    
    }
        
}
}
