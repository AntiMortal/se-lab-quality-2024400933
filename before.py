# before.py - 代码坏味道：重复代码、未使用变量
def calculate_student():
    unused_var = 100  # 未使用变量（必报）
    math = 90
    english = 85
    total = math + english
    avg = total / 2
    print("总分：", total)
    print("平均分：", avg)

def calculate_teacher():
    # 重复代码（必报）
    math = 80
    english = 95
    total = math + english
    avg = total / 2
    print("总分：", total)
    print("平均分：", avg)

calculate_student()
calculate_teacher()
