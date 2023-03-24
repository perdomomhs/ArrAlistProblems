import java.util.ArrayList;
public class FRQ {

    public static ArrayList<Integer> getCubeTosses(NumberCube cube, int numTosses){
        ArrayList<Integer> alist = new ArrayList<>();
        for(int i =0; i < numTosses;i++){
            alist.add(cube.toss());
        }
        return alist;
    }

    public static int getLongRun(ArrayList<Integer> values){
        int currentLen =0;
        int maxLen = 0;
        int maxStart = -1;
        for(int i =0; i< values.size() - 1 ; i++){
            if(values.get(i) ==values.get(i+1)){
                currentLen++;
                if(currentLen>maxLen){
                    maxLen = currentLen;
                    maxStart = i- currentLen;
                }
            }else{
                currentLen = 0;
            }
        }
        return maxStart;
    }

    public int removeVariety(String cookieVar){
        int count = 0;
        int boxesRemoved = 0;
        for(CookieOrder co: this.orders){
            if(cookieVar.euqals(co.getVariety())){
                count++;
                boxesRemoved  += co.getNumBoxes();
            }
        }
        CookieOrder[] newOrders = new CookieOrder[this.orders.length - count];
        int i =0;
        for(int x =0; x<this.orders.length;x++){
            if(!cookieVar.equals(this.orders[x].getVariety())){
                newOrders[i] = this.orders[x];
                i++;
            }
        }
        this.orders = newOrders;
        return boxesRemoved;

    }
    
}
