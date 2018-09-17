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
