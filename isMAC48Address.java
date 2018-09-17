static boolean isMac48(String input){
        boolean condition = false;
        String regex = "[A-Fa-f0-9]+";
        Pattern pattern = Pattern.compile(regex);
        String[] toCheck = input.split("-");
        for (int i = 0; i < toCheck.length; i++) {
            if (!pattern.matcher(toCheck[i]).lookingAt()){
                condition = false;
                System.out.println("false here " + toCheck[i]);
                return condition;
            } else {
                condition = true;
                System.out.println("true here "+toCheck[i]);
            }
        }
        return condition;
    }
