import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr ={3,4,1,2,5};
        int[] arr2 ={2,3,4,5};
        int[] arr3 ={-1,-4,-8,-16,-9};
        int[] arr4 ={-2,4,-2,5,-3,4,-2,5};
        double[] arr5 = {2,3,4,5};
        double[] arr6 = {-2,4,-2,5,-3,4,-2,5};
        double[] arr7 = {-1,-4,-8,-16,-9};
        String[] arr8 = {"Hello","Goodbye","James","Steven","Google","Amazon"};

        Athlete[] aths = new Athlete[6];
        aths[0] = new Athlete("Emily",22,100,"Mag");
        aths[1] = new Athlete("Patrick",8,120,"Mag");
        aths[2] = new Athlete("Pete",25,80,"Mag");
        aths[3] = new Athlete("Ava", 12,90,"MagWest");
        aths[4] = new Athlete("Talia",11,90,"MagWest");
        aths[5] = new Athlete("Mitchell",22,99,"MagWest");
        
        assert Problems.mean(arr) == 3: "mean(arr) is inccorect";
        assert Problems.mean(arr3) == -38/5.0:"mean(arr3) is incorrect";
        assert Problems.median(arr3) ==-8:"median(arr3) is inccorect";
        assert Problems.median(arr2) == 3.5:"median(arr2) is incorrect";
        assert Problems.mode(arr4) == -2: "mode(arr4) is incorrect";
        assert Problems.max(arr) == 5: "max(arr) is incorrect";
        assert Problems.max(arr3) ==  -1:"max(arr3) is incorrect";
        assert Problems.secondMaxIndex(arr5) == 2:"secondMaxIndex(arr2) is incorrect";
        String[] ans = {"Hello","Goodbye","James"};
        assert Arrays.equals(Problems.firstN(arr8,3),ans): "firstN(arr8) is incorrect";
        int[] ans2 = {-3,4,-2,5};
        assert Arrays.equals(Problems.chopNOff(arr4, 4),ans2): "chopNOff(arr4) is incorrect";
        int[] ans3 = {-9};
        assert Arrays.equals(Problems.onlyDiv3(arr3), ans3): "onlyDiv3(arr3) is incorrect";
        int[] ans4 = {-3};
        assert Arrays.equals(Problems.onlyDiv3(arr4),ans4):"onlyDiv3(arr4) is incorrect";
        assert Problems.bigDiffConsecutive(arr3) == 8: "bigDiffConsecutive(arr3) is incorrect";
        assert Problems.bigDiff(arr7) == 15: "bigDiff(arr7) is incorrect";
        String[] names = Problems.withJersey(aths, 22);
        assert names[0].equals("Emily") && names[1].equals("Mitchell") : "withJersey(aths,22) is incorrect";
        assert Problems.schoolAvg(aths, "MagWest") == (90+90+99)/3.0:"schoolAvg(aths,\"Magwest\") is incorrect";
        int[] jNums = {8,22,25};
        Athlete[] remaining = Problems.excludeJerseys(aths, jNums);
       // System.out.println(remaining[0].getName() + remaining[1].getName());
        assert remaining[0].equals(aths[3]) && remaining[1].equals(aths[4]) && remaining.length == 2: "excludeJerseys(aths,jNums) is incorrect";


        System.out.println("### ALL ARRAY TESTS PASSED! ###");

        ArrayList<Integer>  alist = new ArrayList<Integer>();
        for(int a: arr)
            alist.add(a);
        ArrayList<Integer>  alist2 = new ArrayList<Integer>();
        for(int a: arr2)
            alist2.add(a);
        ArrayList<Integer>  alist3 = new ArrayList<Integer>();
        for(int a: arr3)
            alist3.add(a);
        ArrayList<Integer>  alist4 = new ArrayList<Integer>();
        for(int a: arr4)
            alist4.add(a);
        ArrayList<Double> alist5  = new ArrayList<>();
        for(double a: arr5)
            alist5.add(a);
        ArrayList<Double> alist6  = new ArrayList<>();
        for(double a: arr6)
                alist6.add(a);
        ArrayList<Double> alist7 = new ArrayList<>();
        for(double a: arr7)
            alist7.add(a);
        ArrayList<String> alist8 = new ArrayList<>(Arrays.asList(arr8));

        
        assert Problems.mean(alist) == 3: "mean(alist) is inccorect";
        assert Problems.mean(alist3) == -38/5.0:"mean(alist3) is incorrect";
        assert Problems.median(alist5) ==4.5:"median(alist5) is inccorect";
        assert Problems.mode(alist6) == -2: "mode(alist6) is incorrect";
        assert Problems.max(alist7) == -1: "max(alist7) is incorrect";
        assert Problems.secondMaxIndex(alist5) == 2:"secondMaxIndex(alist2) is incorrect";
        assert Problems.firstN(alist8,3).equals(Arrays.asList(ans)): "firstN(alist8) is incorrect";
        ArrayList<Integer>  ans6 = new ArrayList<>();
        for(int a: ans2)
            ans6.add(a);
        assert Problems.chopNOff(alist4, 4).equals(ans6): "chopNOff(alist4) is incorrect";
        ArrayList<Integer> ans7 = new ArrayList<>();
        for(int a: ans3)
            ans7.add(a);   
        assert Problems.onlyDiv3(alist3).equals(ans7) : "onlyDiv3(alist3) is incorrect";
        ArrayList<Integer> ans8 = new ArrayList<>();
        for(int a: ans4)
            ans8.add(a);  
        assert Problems.onlyDiv3(alist4).equals(ans8):"onlyDiv3(alist4) is incorrect";
        assert Problems.bigDiffConsecutive(alist3) == 8: "bigDiffConsecutive(alist3) is incorrect";
        assert Problems.bigDiff(alist7) == 15: "bigDiff(alist7) is incorrect";
        ArrayList<Athlete> aths2 = new ArrayList<>(Arrays.asList(aths));
        ArrayList<String> names2 = Problems.withJersey(aths2, 22);
        assert names2.get(0).equals("Emily") && names2.get(1).equals("Mitchell") : "withJersey(aths,22) is incorrect";
        assert Problems.schoolAvg(aths2, "MagWest") == (90+90+99)/3.0:"schoolAvg(aths,\"MagWest\") is incorrect";
        ArrayList<Athlete> remaining2 = Problems.excludeJerseys(aths2, jNums);
        assert remaining2.get(0).equals(aths[3]) && remaining2.get(1).equals(aths[4]) && remaining2.size() == 2: "excludeJerseys(aths,jNums) is incorrect";
        ArrayList<Athlete> top = Problems.topN(aths2, 2);
        assert top.contains(aths[0]) && top.contains(aths[1]) && top.size() == 2: "topN(aths, 2) is incorrect";
        assert Problems.bestFromEachSchool(aths2).equals("Patrick - Mag\nMitchell - MagWest");

        
        
        System.out.println("### All ArrayList test passed ###");
    }
}
