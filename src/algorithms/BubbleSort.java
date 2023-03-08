package algorithms;

public class BubbleSort {

    public int[] bubbleSort(int v[]){
        for(int i=0; i <= v.length - 1; i++){
            for(int j = 0; j < v.length - i -1; j++){
                if(v[j] > v[j+1]){
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
        return v;
    }

}
