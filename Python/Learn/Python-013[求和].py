def sum(str):
    """
    docstring
    """
    str_list = str.split(" ")
    i = int(str_list[0]);
    j = int(str_list[1]);
    return i+j;

if __name__ == "__main__":
    str = input("请输入两个数（空格分隔）：")
    print(sum(str))
