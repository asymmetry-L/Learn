#%%
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.datasets import load_iris

iris_dataset = load_iris()
X_train,X_text,y_train,y_test = train_test_split(iris_dataset['data'],iris_dataset['target'],random_state = 0)
print("X_train shape:{}".format(X_train.shape))
print("y_train shape:{}".format(y_train.shape))
# %%
print('X_test:{}'.format(X_text.shape))
print('y_test:{}'.format(y_test.shape))
# %%
iris_dataset = pd.DataFrame(X_train,columns=iris_dataset.feature_names)
grr = pd.scatter_matrix(iris_dataset,c=y_train,figsize = (15,15), marker = 'o',hist_kwds = {'bins':20},s=60,alpha=.8,cmap=mglearn.cm3})
# %%
