
public class AddTwoStringNumbers {
	
	public static void main(String[] args) {
		String num1="132";
		String num2="20";
		String result = addStrings(num1, num2);
		System.out.println("result : " + result);
	}
	
	public static String addStrings(String num1, String num2) {
        if(num1 == null || num2 == null) return null;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int l1 = num1.length()-1;
        int l2 = num2.length()-1;
        
        while(l1>=0 || l2>=0) {
        	
        	System.out.println("num1.charAt(l1) : " + num1.charAt(l1));
        	System.out.println("num2.charAt(l1)-'0': " + (num1.charAt(l1) - '0'));
            int n1 = l1>=0 ? num1.charAt(l1)-'0' : 0;
            System.out.println("num1.charAt(l2) : " + num2.charAt(l2));
            System.out.println("num1.charAt(l2)-'0': " + + (num2.charAt(l2) - '0'));
            int n2 = l2>=0 ? num2.charAt(l2)-'0' : 0;
            int sum = n1 + n2 + carry;
            System.out.println("sum : " + sum);
            carry = sum > 9 ? 1 : 0;
            sb.insert(0, sum%10);
            System.out.println("sb string : " + sb.toString());
            l1--;
            l2--;
        }
        
        if(carry == 1) sb.insert(0, 1);
        
        return sb.toString();
    }
}
