package 方法引用.测试;

public class MethodRefDemo {
	
	 public static String stringOp(StringFunc sf, String s) {//即StringFunc 起到了将 功能的接口指向MyStringOps中的strReverse功能的作用
	        return sf.func(s);
	 }
	 
	 public static void main(String[] args) {
        String inStr = "lambda add power to Java";
        //MyStringOps::strReverse 相当于实现了接口方法func() 
        // 并在接口方法func()中作了MyStringOps.strReverse()操作
         String outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println("Original string: " + inStr);
        System.out.println("String reserved: " + outStr);
	  }
}
