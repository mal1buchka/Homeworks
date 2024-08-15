package august_15.task_2;

public class Main {
    public static void main(String[] args) {
        System.out.println(replace("foo")); // bar
        System.out.println(replace("fod"));        // ""
    }
    public static String replace(String input){
        return input.contains("foo")?input.replaceAll("foo","bar"):"";
    }
}
