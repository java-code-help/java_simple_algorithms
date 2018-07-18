static String[] guessIt(String message, String[] options) {
            ArrayList<String> resultString = new ArrayList<>();
        String[] finalString;
        for (int i=0;i<options.length;i++){
            if (options[i].startsWith(message)){
                resultString.add(options[i]);
            }
        }
        int len = resultString.size();
        finalString = new String[len];
        for (int y = 0;y<len;y++){
            finalString[y] = resultString.get(y);
        }
        return finalString;
    }
    
    
    public static void main(String[] args) {
        String[] res = guessIt("prizes",
                new String[]{"abra", "pzies","prizesssssss", "prizes$", "prizes"});

        System.out.println(Arrays.toString(res));
    }
