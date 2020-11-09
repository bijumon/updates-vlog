---
title: Solutions to Exercism Python Track
updated_at: 2020-11-09 10:28 IST
---

1. Hello World 

``` python
# hello_world.py

def hello():
    return 'Hello, World!'
```

https://exercism.io/my/solutions/04bcc66509104f5c91ccb6cc39280a64

2. Two Fer

``` python
def two_fer(name="you"):
    answer = f"One for {name}, one for me."
    return answer
```

https://exercism.io/my/solutions/bcf0899b1a244ac698c7783e891f1558

3. Raindrops

``` python
def convert(number):
    answer = []
    raindrops = {3:"Pling", 5:"Plang", 7:"Plong"}
    if number % 3 == 0:
        answer += raindrops[3]
    if number % 5 == 0:
        answer += raindrops[5]
    if number % 7 == 0:
        answer += raindrops[7]
    return ''.join(answer) or str(number)
```

https://exercism.io/my/solutions/36815234aec34fb2b0a7501b710c0e69

4. High Scores

``` python
def latest(scores):
    return scores.pop()


def personal_best(scores):
    return max(scores)


def personal_top_three(scores):
    return sorted(scores, reverse=True)[:3]

```

https://exercism.io/my/solutions/30770ae4fb07446fb9b21bf77dfa2ebf

5. Matrix

``` python
class Matrix:
    def __init__(self, matrix_string):
        rowStrings = [r.split() for r in matrix_string.splitlines()]
        self.matrix = [[int(num) for num in row] for row in rowStrings]

    def row(self, index):
        return self.matrix[index - 1]

    def column(self, index):
        return [ column[index - 1] for column in self.matrix]

```

https://exercism.io/my/solutions/b0dd69bb52e84812bf44fc804e3d4258

