class BracketMatch {
    public static void main(String[] args) {
        System.out.println(bracketMatch(""));
        System.out.println(bracketMatch("{"));
        System.out.println(bracketMatch("["));
        System.out.println(bracketMatch("("));
        System.out.println(bracketMatch("}"));
        System.out.println(bracketMatch("]"));
        System.out.println(bracketMatch(")"));
        System.out.println(bracketMatch("{}"));
        System.out.println(bracketMatch("[]"));
        System.out.println(bracketMatch("public static boolean bracketMatch(String s) {this is phuqu'd [I like to bark]}"));
    }

    public static boolean bracketMatch(String s) {
        StackCustom sc = new StackCustom();
        char[] chars = s.toCharArray();
        if(chars.length != 0) {
            for(char c: chars) {
                if(c == '}') {
                    if(sc.peek() == null || sc.peek() != '{') {
                        return false;
                    }
                    else {
                        sc.pop();
                    }
                }

                if(c == ']') {
                    if(sc.peek() == null || sc.peek() != '[') {
                        return false;
                    }
                    else {
                        sc.pop();
                    }
                }

                if(c == ')') {
                    if(sc.peek() == null || sc.peek() != '(') {
                        return false;
                    }
                    else {
                        sc.pop();
                    }
                }

                if(c == '{' || c == '[' || c == '(') {
                    sc.push(c);
                }
            }

            if(sc.peek() == null) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return true;
        }
    }
}