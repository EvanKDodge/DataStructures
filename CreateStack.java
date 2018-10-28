class CreateStack {
    public static void main(String[] args) {
        StackCustom s = new StackCustom();
        String str = "This is a string to be reversed!";
        char[] charArray = str.toCharArray();

        for(int i=0;i < charArray.length;i++) {
            s.push(charArray[i]);
        }

        for(int i=0;i < charArray.length;i++) {
            charArray[i] = s.pop();
        }
        String str2 = new String(charArray);
        System.out.println(str2);
    }
}