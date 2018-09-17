//counter SAME chars
public static int countChar(String str, char ch){
        int count=0;
        while (str.indexOf(ch)!=-1){
            count++;
            str=str.substring((str.indexOf(ch)+1));
        }
        return count;
    }
    public static void lineEncoding(String str){
       str = str.replace(" ", "");
       while (str.length() > 0){
           char ch = str.charAt(0);
           int count = countChar(str, ch);
           System.out.println(ch + " " + count);
           str = str.replace(""+ch,"");
       }
    }
//counter EACH char
static String lineEncoding(String s) {
        s += "#";
        int cnt = 1;
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                cnt++;
            } else {
                if (cnt > 1) {
                    result.append(cnt);
                }
                result.append(s.charAt(i-1));
                cnt=1;
            }
        }
        return result.toString();
    }
