# %%

import collections

Card = collections.namedtuple('Card', ['rank', 'suit'])
"""
collections.nametuple()创建简单类 适用于有少数属性且没有函数的类
:param Card 纸牌类类名
:param rank 牌数
:param suit 花色['黑桃', '方块', '梅花', '桃心']
"""
class FrenchDeck:
    ranks = [str(n) for n in range(2,11)] + list('JQKA')
    suits = '黑桃 方块 梅花 桃心'.split()
    def __init__(self) -> None:
        self._cards = [Card(rank,suit) for suit in self.suits for rank in self.ranks]

    def __len__(self):
        return len(self._cards)

    def __getitem__(self, position):
        return self._cards[position]

if __name__ == "__main__":
    beer_card = Card('7', '黑桃')
    print(beer_card)
    print(FrenchDeck())
# %%
