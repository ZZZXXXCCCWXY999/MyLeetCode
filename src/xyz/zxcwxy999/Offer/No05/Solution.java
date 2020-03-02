package xyz.zxcwxy999.Offer.No05;

class Solution {
    public String replaceSpace(String s) {
        return s.replace(" ","%20");

            }
    /*public String replaceSpace(String s) {
        int length = s.length();
        char[] array = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else {
                array[size++] = c;
            }
        }
        String newStr = new String(array, 0, size);
        return newStr;
    }*/

    /**
     * 这样一定不行！！！记住！！！
     * @param s
     * @return
     */
//    public String replaceSpace(String s) {
//        if(s.equals(" "))return "%20";
//        String []str=s.split(" ");
//        String ans=str[0];
//        for (int i = 1; i <str.length ; i++) {
//            ans+="%20"+str[i];
//        }
//        return ans;
//    }


    public static void main(String[] args) {
        Solution solution=new Solution();
        String s=" ";
        System.out.println(solution.replaceSpace(s));
    }
}