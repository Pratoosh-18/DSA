package Array;

public class ShortestNum {
    public static void main(String args[]){
        int[] num = {2454,353,434,552,64};
        int s=num[0];
        for (int i=0;i<num.length;i++){
            if(num[i]<s){
                s=num[i];
            }
        }
        System.out.println(s);
    }
}
