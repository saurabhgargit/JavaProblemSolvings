//package Queue;
//
//public class BasicQueue<X> {
//    private X[] data;
//    private int front;
//    private int end;
//
//    public BasicQueue(){
//        this(1000);
//    }
//
//    public BasicQueue(int size){
//
//        data = (X[])new Object[size];
//        front = -1;
//        end = -1;
//    }
//
//    public int size(){
//
//        if(front== -1 && end ==-1){
//            return 0;
//        }
//        else{
//            return end  - front + 1;
//        }
//    }
//
//    public void enQueue(X item){
//         data[front++] = item;
//    }
//
//    public X deQueue(){
//
//    }
//
//
//
//}
