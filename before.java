公共 class before {

    // 1. 未使用变量（必报）
    // 2. 重复代码（必报）
    public static void printStudent(int age, String name) {
        int unusedValue = 999; // 未使用变量
        
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("信息打印完成");
    }

    // 完全重复的代码！！！
    public static void printTeacher(int age, String name) {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("信息打印完成");
    }

    public static void main(String[] args) {
        printStudent(20, "张三");
        printTeacher(40, "李老师");
    }
}
