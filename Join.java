public class Join {

    public static void main(String[] args) {
        System.out.println(123456 + 65432l);

        //'k'当成int, 初始化StringBuilder的容量
        StringBuilder sb = new StringBuilder('k');
        sb.append('o');
        System.out.println(sb.toString());
    }
}
