private static int sumUpNumbers(String inputString) {
        int cost = 0;
        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher(inputString);
        while (m.find()) {
            cost+=Integer.parseInt(m.group());
            System.out.println(m.group());
        }
        
        //variant #2
//         String[] splittingTheNumbers=inputString.split("\\D+");
//         int count=0;
//         for (String num:splittingTheNumbers){
//             if (num.length()>0) count+=Integer.parseInt(num);
//         }
//         return count;

        System.out.println(cost);
        return cost;
    }
