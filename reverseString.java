static String reverse(String string){
        //method 1
        char[] stringAsByteArr = string.toCharArray();
        char[] result = new char[stringAsByteArr.length];
        for (int i=0;i<stringAsByteArr.length;i++){
            result[i] = stringAsByteArr[stringAsByteArr.length-i-1];

        }
        return String.valueOf(result);



    }
    
    
    
    
    //method 2
    void reverse2(){            
//        char[] try1 = string.toCharArray();
//
//        for (int i = try1.length-1; i>=0; i--)
//            System.out.print(try1[i]);
    }
    
    //method3
    // String testB = new StringBuilder("testing").reverse().toString();
    
   
