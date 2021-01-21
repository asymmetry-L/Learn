#%%
from sklearn.datasets import load_iris

iris_dataset = load_iris()
print('鸢尾花数据集中的键为:\n{}'.format(iris_dataset.keys()))
#%%
print(iris_dataset['DESCR'][19:1208])
# %%
print('目标品种:\n{}'.format(iris_dataset['target_names']))
# %%
print('特征字段:\n{}'.format(iris_dataset['feature_names']))
# 花萼长度，花萼宽度，花瓣长度，花瓣宽度
# %%
print('数据类型:\n{}'.format(type(iris_dataset['data'])))
# %%
print('数据模型:\n{}'.format(iris_dataset['data'].shape))
# 150朵花的测量数据，包含4种特征
# %%
print('前五朵花的数据:\n{}'.format(iris_dataset['data'][:5]))
# %%
print('目标数据数据类型:\n{}'.format(type(iris_dataset['target'])))
# %%
print('目标形状:{}'.format(iris_dataset['target'].shape))
# %%
print('目标:\n{}'.format(iris_dataset['target']))
# %%
 