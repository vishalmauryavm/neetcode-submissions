class Solution {
    public int countSeniors(String[] details) {

        int count=0;
        String age = "";
        for (int i=0;i<details.length;i++){
            age=details[i].substring(11,13);
            if(Integer.parseInt(age) > 60){
                count++;
            }
        }
        return count;
    }
}