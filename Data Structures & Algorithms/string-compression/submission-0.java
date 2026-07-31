class Solution {
    public int compress(char[] chars) {
        int k=chars.length;
        int r=1,l=0;
        StringBuilder str=new StringBuilder("");
        while(r<k){
            if(chars[l] != chars[r]){
                str.append(chars[l]);
                int len=r-l;
                if(len>1){
                    str.append(len);
                }
                l=r;
            }else{
                r++;
            }
        }
        str.append(chars[l]);

        int len = r - l;

        if (len > 1)
            str.append(len);
    for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }

        return str.length();

    }
}