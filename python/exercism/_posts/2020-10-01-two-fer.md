---
title: "exercism python #2 - two fer"
---

> `Two-fer` or `2-fer` is short for two for one. One for you and one for me.
> Given a name, return a string with the message: "One for X, one for me." Where X is the given name.
> However, if the name is missing, return the string: "One for you, one for me."
> 
> Here are some examples:

|Name    |String to return           |
|--------|---------------------------|
|Alice   |One for Alice, one for me. |
|Bob     |One for Bob, one for me.   |
|        |One for you, one for me.   |
|Zaphod  |One for Zaphod, one for me.|

ref: [Python 3's f-Strings: An Improved String Formatting Syntax (Guide) – Real Python](https://realpython.com/python-f-strings/#f-strings-a-new-and-improved-way-to-format-strings-in-python)

**Hint**: return a formatted string literal from the function, with a [default argument value](https://docs.python.org/3/tutorial/controlflow.html#default-argument-values) when `name` isn't given. It is possible to use [%-formatting](https://realpython.com/python-f-strings/#option-1-formatting) or [str.format()](https://realpython.com/python-f-strings/#option-2-strformat) to solve this.

``` python
# two_fer.py
def two_fer(name="you"):
    answer = f"One for {name}, one for me."
    return answer

# two_fer_test.py
import unittest

from two_fer import two_fer

# Tests adapted from `problem-specifications//canonical-data.json` @ v1.2.0

class TwoFerTest(unittest.TestCase):
    def test_no_name_given(self):
        self.assertEqual(two_fer(), "One for you, one for me.")

    def test_a_name_given(self):
        self.assertEqual(two_fer("Alice"), "One for Alice, one for me.")

    def test_another_name_given(self):
        self.assertEqual(two_fer("Bob"), "One for Bob, one for me.")

if __name__ == "__main__":
    unittest.main()
```

``` shell
> pytest two_fer_test.py
======================================= test session starts ========================================
platform linux -- Python 3.8.5, pytest-6.0.1, py-1.9.0, pluggy-0.13.1
rootdir: /home/user0/Exercism/python/two-fer
collected 3 items                                                                                  

two_fer_test.py ...                                                                          [100%]

======================================== 3 passed in 0.03s =========================================

> exercism submit two_fer.py

    Your solution has been submitted successfully.
    View it at:
    
    https://exercism.io/my/solutions/bcf0899b1a244ac698c7783e891f1558
```

