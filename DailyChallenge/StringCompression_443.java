class StringCompression_443 {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.print("Pre compresion: ");
        for(int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
        int length = compressString(chars);
        System.out.print("Post compression: ");
        for(int i = 0; i < length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }

    public static int compressString(char[] chars) {
        if(chars.length == 1) {
            return 1;
        }
        char currChar = chars[0];
        int count = 1;
        StringBuilder s = new StringBuilder();
        for(int i = 1; i < chars.length; i++) {
            if(currChar != chars[i]) {
                if(count == 1) {
                    s.append(currChar);
                } else {
                    s.append(currChar);
                    s.append(count);
                }
                currChar = chars[i];
                count = 1;
            } else {
                count++;
            }
        }
        s.append(currChar);
        if(count > 1) {
            s.append(count);
        }
        s.getChars(0, s.length(), chars, 0);
        return s.length();
    }
}