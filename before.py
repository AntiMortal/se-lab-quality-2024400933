# 有代码坏味道的示例：重复代码 + 长函数 + 未使用变量
def calculate_student_score1(math, english, science):
    # 重复逻辑开始
    total = math + english + science
    average = total / 3
    print("总分：", total)
    print("平均分：", average)
    # 重复逻辑结束
    if average >= 60:
        return "及格"
    else:
        return "不及格"

def calculate_student_score2(chinese, history, geography):
    # 重复逻辑开始（和上面完全一样！）
    total = chinese + history + geography
    average = total / 3
    print("总分：", total)
    print("平均分：", average)
    # 重复逻辑结束
    if average >= 60:
        return "及格"
    else:
        return "不及格"

# 未使用变量
unused_variable = "我从来没被用过"

# 调用
calculate_student_score1(80, 75, 90)
calculate_student_score2(50, 60, 70)
