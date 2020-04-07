#成绩评级
"""

num = input("请输入您的成绩：")
number = int(num)
if number >= 70:
    if number >= 80:
        if number >= 90:
            print("A")
        else:
            print("B")
    else:
        print("C")
else:
    print("D")

"""
num = input("请输入您的成绩：")
number = int(num)
if number >= 90:
    print("A")
elif number >= 80:
    print("B")
elif number >= 70:
    print("C")
else:
    print("D")