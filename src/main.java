
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	public  static void test() {
		NumberComplement476 test = new NumberComplement476();
		test.findComplement(4);
		MaxConsecutiveOnes485 test_1 = new MaxConsecutiveOnes485();
		int []te = {1,1,1,1,0,1,1,1,1,1,1};
		test_1.findMaxConsecutiveOnes(te);
		FindAllNumbersDisappearedinanArray448 test_2 = new FindAllNumbersDisappearedinanArray448();
		int[] arr_1 = {1,2,3,3,5,6,7,8,10,10,10,12};
		test_2.findDisappearedNumbers(arr_1);
		ConstructtheRectangle492 test_3 = new ConstructtheRectangle492();
		test_3.constructRectangle(1);
		SortCharactersByFrequency451 test_4 = new SortCharactersByFrequency451();
		String str = "ewqqrrrwqtttttt";
		String str_1 = "tree";
		test_4.frequencySort(str);
		FindAllDuplicatesinanArray442 test_5 = new FindAllDuplicatesinanArray442();
		int[] arr_2 = {2,4,1,1,2,6,9,6,8};
		test_5.findDuplicates(arr_2);
		ProductofArrayExceptSelf238 test_6= new ProductofArrayExceptSelf238();
		int[] arr_3 = {1,2,3,4};
		test_6.productExceptSelf(arr_3);
		TargetSum494 test_7 = new TargetSum494();
		int[] arr_4 = {1,1,1,1,1};
		test_7.findTargetSumWays(arr_4, 3);
	}
}
