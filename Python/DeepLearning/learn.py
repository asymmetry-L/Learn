#%%
from ast import increment_lineno
import numpy as np
from scipy.sparse import data
x = np.array([[1,2,3],[4,5,6]])
print('x:\n{}'.format(x))
# %%
from scipy import sparse
# 创建一个二维NumPy数组，对角线为1，其余为零(4阶单位矩阵)
eye = np.eye(4)
print('x:\n{}'.format(eye))
# %%
# 将NumPy数组转换为CSR格式的SciPy稀疏矩阵
# 只保存非零元素（稀疏率=0元素个数/矩阵元素数量）
sparse_matrix = sparse.csr_matrix(eye)
print('SciPy sparse CSR matrix:\n{}'.format(sparse_matrix))
# %%
data = np.ones(4)
row_indices = np.arange(4)
col_indices = np.arange(4)
eye_coo = sparse.coo_matrix((data,(row_indices,col_indices)))
print('COO representation:\n{}'.format(eye_coo))
# %%
import matplotlib.pyplot as plt
# 在-10和10之间生成一个数列，共100个数
x = np.linspace(-10, 10, 100)
y = np.sin(x)
plt.plot(x,y,marker="x")
# 画出坐标为(x, y)记号为x的曲线
# %%
import pandas as pd
from IPython.display import display

data = {'Name':['John','Anna','Peter'],'Loction':['New York','Paris','London'],'age':[23,14,16]}
display_pandas = pd.DataFrame(data)
display(display_pandas)
# %%
