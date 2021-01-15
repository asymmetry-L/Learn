#%%
from sklearn.datasets import load_iris

iris_dataset = load_iris()
print('鸢尾花数据集中的键为:\n{}'.format(iris_dataset.keys()))
#%%
print(iris_dataset['DESCR'][19:1208])
# %%
print('目标品种:\n{}'.format(iris_dataset['target_names']))
# %%
