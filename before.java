// before.java （带代码坏味道，用于CodeQL扫描报错）
公共 class BeforeCode {
    // 故意留未使用变量 + 重复代码，触发CodeQL检测
    public static void main(String[] args) {
        // 未使用变量（必被检测到）
        int unusedVar = 100;
        // 重复代码（必被检测到）
        System.out.println("学生成绩统计");
        System.out.println("学生成绩统计");
        System.out.println("学生成绩统计");
    }
}
