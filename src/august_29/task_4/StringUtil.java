package august_29.task_4;

public class StringUtil {
    StringActions stringActions;
    StringUtil(StringActions stringActions){
        this.stringActions = stringActions;
    }

    @Override
    public String toString() {
        return "StringUtil{" +
                "stringActions=" + stringActions +
                '}';
    }


    public static void main(String[] args) {
        StringUtil stringUtil = new StringUtil(new StringActions() {
            @Override
            public String concate(String s1, String s2) {
                return s1+s2;
            }

            @Override
            public int countChars(String s) {
                return 0;
            }

            @Override
            public char findChar(char a, String b) {
                return 0;
            }
        });
        System.out.println(stringUtil.stringActions.concate("b", "a"));
    }
}
