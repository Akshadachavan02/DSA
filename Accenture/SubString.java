package Accenture;

public class SubString {
   public static  int lcsAsciiSum(String s1, String s2) {
        int sum = 0;
        int curr = 0;
        int len = 0;
        int n = s1.length();
        int m = s2.length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int temp = 0;
                int k = 0;
                while (i + k < n && j + k < m && s1.charAt(i + k) == s2.charAt(j + k)) {
                    temp += (int) s1.charAt(i + k);
                    k++;
                }

                if (k > len) {
                    len = k;
                    sum = temp;
                } else if (k == len && temp > curr) {
                    sum = temp;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String s1="asdfg";
        String s2="zxcvd";
        System.out.println(lcsAsciiSum(s1,s2));
    }
    
}
