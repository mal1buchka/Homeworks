package august_29.task_5;

import august_29.task_4.StringActions;

public class Main {
    StringActions stringActions;
    Main(StringActions stringActions){
        this.stringActions = stringActions;
    }

    public static void main(String[] args) {
        Main main = new Main(new StringActions() {
            @Override
            public String concate(String s1, String s2) {
                return null;
            }

            @Override
            public int countChars(String s) {
                return s.length();
            }

            @Override
            public char findChar(char a, String b) { // Здесь я узнал, что char не может null вернуть)
                return b.indexOf(a) != -1?a:'\0';
            }
        });
        System.out.println(main.stringActions.findChar('a', "mlik"));
        System.out.println(main.stringActions.countChars("malik"));
    }
}
