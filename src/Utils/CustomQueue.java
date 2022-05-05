package Utils;

public class CustomQueue {
    private static final int INITIAL_CAPACITY = 5;
    private CustomCollection collection = new CustomCollection(INITIAL_CAPACITY);

    public void enqueue(float element){
        collection.add(element);
    }

    public void dequeue(){
        collection.delete(0);
    }

    public void showAll(){
        for (int i = 0; i < collection.length(); i++) {
            System.out.println(collection.getElement(i));
        }
    }

    public float sumAll(){
        float sum = 0;
        for (int i = 0; i < collection.length(); i++) {
            sum = sum + (float) collection.getElement(i);
        }
        return sum;
    }
}
