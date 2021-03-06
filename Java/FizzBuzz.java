 描述：给你一个整数n. 从 1 到 n 按照下面的规则打印每个数：
    如果这个数被3整除，打印fizz.
    如果这个数被5整除，打印buzz.
    如果这个数能同时被3和5整除，打印fizz buzz.
比如 n = 15, 返回一个字符串数组：
[
  "1", "2", "fizz",
  "4", "buzz", "fizz",
  "7", "8", "fizz",
  "buzz", "11", "fizz",
  "13", "14", "fizz buzz"
]
思路：该题返回类型为ArrayList，创建ArrayList对象，进行添加操作即可。fizzbuzz的判断比较清晰。注意：ay.add(i + "");这句话很关键，前面添加的都是
String类型，此处应该也是String，int转换String方法，1.) String s = String.valueOf(i);2.) String s = Integer.toString(i);3.) String s = "" + i;

public class Solution {
    /*
     * @param : An integer
     * @return: A list of strings.
     */
    public ArrayList<String> fizzBuzz(int n) {
        // write your code here
       ArrayList<String> ay = new ArrayList<String>();
		for (int i = 1; i < n + 1; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				ay.add("fizz");
			} else if (i % 3 != 0 && i % 5 == 0) {
				ay.add("buzz");
			} else if (i % 3 == 0 && i % 5 == 0) {
				ay.add("fizz buzz");
			} else {
				ay.add(i + "");
			}
		}
		return ay;
        }
};

