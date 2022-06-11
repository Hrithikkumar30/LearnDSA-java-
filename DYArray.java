public class DYArray{
    private int[] items;
    private int count;
    public  DYArray (int length){
        items = new int [length];
    }

    public void add(int item){
        // if array is full then resize it
        if(count == items.length){
            // create a new array twice of size
            int[] newitems = new int[items.length*2];
            // copy all the existing item of array to new array
            for(int i = 0; i < count; i++){
                newitems[i] = items[i];
            }
            // set items to array
            items = newitems;
            // add new item to tne end
            items[count] = item;
            count++ ;
        }
        }
    public void removeAt(int index){
        // validate the index should be greater than zero
        if(index<0|| index>= count)
            throw new IndexOutOfBoundsException("Index out of bounds");

            // shift all the items to left by one
        for (int i = index; i < count-1; i++){
            items[i] = items[i+1];
        count--;
        }
        
    

    }
    public int indexOf(int item){
        // if found then return
        // otherwise -1
        for(int i = 0; i < count; i++){
            if(items[i] == item){
                return i;
            }
        }
        return -1;
        
    }


    public void print(){
        for (int i =0;i<count;i++)
            System.out.println(items[i]);
    }

public static void main(String[] args) {
    DYArray dy = new DYArray(3);
    dy.add(10);
    dy.print();
}}