class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";

        for(int i=0; i<words.length; i++){
            String str= words[i].toLowerCase();
            int row=0;

            if(r1.contains("" + str.charAt(0))) row=1;
            else if(r2.contains("" + str.charAt(0))) row=2;
            else row=3;

            boolean check = true;
            for(int j=1; j<str.length(); j++){
                if(row == 1 && !r1.contains("" + str.charAt(j))) check = false;
                else if(row == 2 && !r2.contains("" + str.charAt(j))) check = false;
                else if(row == 3 && !r3.contains("" + str.charAt(j))) check = false;
            }
            if(check) ans.add(words[i]);
        }
        return ans.toArray(new String[0]);
    }
}
