package stack;



public class BasicStack<X> {

    private X  [] data;
    private int stackPointer;

    public  BasicStack(){
        data  = (X[])new Object[1000];
        stackPointer = 0;
    }

    public void push(X item){
        data[stackPointer++] = item;
    }

    public X pop(){
        if(stackPointer==0){
            throw new IllegalStateException("no more element in stack");
        }
        return data[--stackPointer];
    }

    public boolean contains(X item){

        boolean found  = false;

        for(int i=0; i<stackPointer;i++){
            if(data[i]==item){
                found = true;
                break;
            }
        }
        return found;
    }

    public X access(X item){
        while(stackPointer>0){
            X tmpItem =  pop();
            if(item.equals(tmpItem)){
                return tmpItem;
            }
        }

        throw new IllegalArgumentException("item is not available in stack");

    }

    public int size(){
        return stackPointer;
    }
}
