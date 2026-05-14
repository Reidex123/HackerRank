
class Solution {

    public boolean checkRecord(String s) {
        if (s.length() <= 1) {
            return true;
        }

        int countA = 0;
        for (String c : s.split("")) {
            if (c.equals("A")) {
                countA++;
            }
        }

        return countA < 2 && (!s.contains("LLL"));
    }
}
