private static int sumUpNumbers(String inputString) {
        int cost = 0;
        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher(inputString);
        while (m.find()) {
            cost+=Integer.parseInt(m.group());
            System.out.println(m.group());
        }

        System.out.println(cost);
        return cost;
    }
