class Solution {
    public int numUniqueEmails(String[] emails) {
        int n = emails.length;
        String localname = "";
        String domainname = "";
        String sanitize = "";
        HashSet<String> hs = new HashSet<>(); 
        for (int i=0;i<n;i++){
            String [] splited =emails[i].split("@");
            localname=splited[0];
            if(localname.contains(".")){
                localname=localname.replace(".","");
            }
            if(localname.contains("+")){
                String [] arr = localname.split("\\+");
                localname = arr[0];
            }
            domainname=splited[1];
            sanitize = localname+ "@" +domainname;
            hs.add(sanitize);
        }
        
        return hs.size();
    }
}