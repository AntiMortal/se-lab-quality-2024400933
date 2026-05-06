public class before {
    // 坏味道：重复代码 + 未使用变量
    public static void calculateStudentScore1(int math, int english, int chinese) {
        int unused = 100; // 未使用变量，CodeQL 必报
        int sum = math + english + chinese;
        double avg = sum / 3.0;
        System.out.println("总分：" + sum);
        System.out.println("平均分：" + avg);
        if (avg >= 60) {
            System.out.println("成绩合格");
        } else {
            System.out.println("成绩不合格");
        }
    }

    // 和上面几乎完全重复的代码！
    public static void calculateStudentScore2(int math, int english, int chinese) {
        int sum = math + english + chinese;
        double avg = sum / 3.0;
        System.out.println("总分：" + sum);
        System.out.println("平均分：" + avg);
        if (avg >= 60) {
            System.out.println("成绩合格");
        } else {
            System.out.println("成绩不合格");
        }
    }

    public static void main(String[] args) {
        calculateStudentScore1(80, 75, 90);
        calculateStudentScore2(60, 50, 70);
    }
}
