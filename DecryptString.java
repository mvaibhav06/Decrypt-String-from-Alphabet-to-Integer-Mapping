class DecryptString {
    public String freqAlphabets(String s) {
        char[] temp = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String out = "";
        int i = 0;

        while(i<s.length()){
            char a = s.charAt(i);
            char b = ' ';
            char c = ' ';
            
            if(i<s.length()-2){
                b = s.charAt(i+1);
                c = s.charAt(i+2);
            }
            if(c=='#'){
                String index = "";
                index += a;
                index += b;
                int id = Integer.parseInt(index);
                out += temp[id-1];
                i = i+3;
            }else{
                String index = "";
                index += a;
                int id = Integer.parseInt(index);
                out += temp[id-1];
                i++;
            }
        }
        return out;
    }
}
