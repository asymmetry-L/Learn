str = input("请输入一个字符:")
for i in range(1,4):
	for j in range(1,4-i):
		print(" ",end="")
	for j in range(0,2*i-1):
		print(str,end="")
	print("\n")