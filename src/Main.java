import easy.*;


public class Main {

    public static void main(String[] args) {
        /**
         * @Description  第一题的测试部分，给定一组整数，返回和为一个特定的target的两个数的索引
         */
        solution001 solution001 = new solution001();
        int [] int001 = {2,7,11,15};
        int target001 = 9;
        int [] res = solution001.twoSum(int001,target001);
        System.out.println(res[0]+", "+res[1]);
    }
}
