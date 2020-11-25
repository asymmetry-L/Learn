def binary_search(search_list, expectation):
    """
    二分法查找数组
    查找次数 = log n
    n = len(search_list)
    :param search_list 需要查找的数组
    :param expectation 期望找到的值
    """
    low = 0
    high = len(search_list)-1  #数组索引从0开始
    while low <= high:
        mid = (low + high)//2
        print(search_list[mid])
        if search_list[mid] < expectation:
            low = mid + 1
        elif search_list[mid] > expectation:
            high = mid - 1
        elif search_list[mid] == expectation:
            return search_list[mid]
            # return mid # => 期望值在数组中的索引

        else:
            return -1   # => -1 数组中没有期望值


if __name__ == "__main__":
    num_list = []
    for item in range(128):
        num_list.append(item)
    print("数组长度:" + str(len(num_list)))
    print("1231" + str(binary_search(num_list, 0)))