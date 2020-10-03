---
title: 'exercism python #5 - matrix'
---
==> README.md <==
# Matrix

Given a string representing a matrix of numbers, return the rows and columns of
that matrix.

So given a string with embedded newlines like:

```text
9 8 7
5 3 2
6 6 7
```

representing this matrix:

```text
    1  2  3
  |---------
1 | 9  8  7
2 | 5  3  2
3 | 6  6  7
```

your code should be able to spit out:

- A list of the rows, reading each row left-to-right while moving
  top-to-bottom across the rows,
- A list of the columns, reading each column top-to-bottom while moving
  from left-to-right.

The rows for our example matrix:

- 9, 8, 7
- 5, 3, 2
- 6, 6, 7

And its columns:

- 9, 5, 6
- 8, 3, 6
- 7, 2, 7

In this exercise you're going to create a **class**.  _Don't worry, it's not as complicated as you think!_ 

-   [**A First Look at Classes**](https://docs.python.org/3/tutorial/classes.html#a-first-look-at-classes) from the Python 3 documentation. 
-   [**How to Define a Class in Python**](https://realpython.com/python3-object-oriented-programming/#how-to-define-a-class-in-python) from the Real Python website.  
-   [**Data Structures in Python**](https://docs.python.org/3/tutorial/datastructures.html) from the Python 3 documentation.


==> matrix.py <==
class Matrix:
    def __init__(self, matrix_string):
        rowStrings = [r.split() for r in matrix_string.splitlines()]
        self.matrix = [[int(num) for num in row] for row in rowStrings]

    def row(self, index):
        return self.matrix[index - 1]

    def column(self, index):
        return [ column[index - 1] for column in self.matrix]


==> matrix_test.py <==
import unittest

from matrix import Matrix

# Tests adapted from `problem-specifications//canonical-data.json` @ v1.3.0


class MatrixTest(unittest.TestCase):
    def test_extract_row_from_one_number_matrix(self):
        matrix = Matrix("1")
        self.assertEqual(matrix.row(1), [1])

    def test_can_extract_row(self):
        matrix = Matrix("1 2\n3 4")
        self.assertEqual(matrix.row(2), [3, 4])

    def test_extract_row_where_numbers_have_different_widths(self):
        matrix = Matrix("1 2\n10 20")
        self.assertEqual(matrix.row(2), [10, 20])

    def test_can_extract_row_from_non_square_matrix_with_no_corresponding_column(self):
        matrix = Matrix("1 2 3\n4 5 6\n7 8 9\n8 7 6")
        self.assertEqual(matrix.row(4), [8, 7, 6])

    def test_extract_column_from_one_number_matrix(self):
        matrix = Matrix("1")
        self.assertEqual(matrix.column(1), [1])

    def test_can_extract_column(self):
        matrix = Matrix("1 2 3\n4 5 6\n7 8 9")
        self.assertEqual(matrix.column(3), [3, 6, 9])

    def test_can_extract_column_from_non_square_matrix_with_no_corresponding_row(self):
        matrix = Matrix("1 2 3 4\n5 6 7 8\n9 8 7 6")
        self.assertEqual(matrix.column(4), [4, 8, 6])

    def test_extract_column_where_numbers_have_different_widths(self):
        matrix = Matrix("89 1903 3\n18 3 1\n9 4 800")
        self.assertEqual(matrix.column(2), [1903, 3, 4])


if __name__ == "__main__":
    unittest.main()
============================= test session starts ==============================
platform linux -- Python 3.8.5, pytest-6.0.1, py-1.9.0, pluggy-0.13.1 -- /usr/bin/python
cachedir: .pytest_cache
rootdir: /home/user0/Exercism/python/matrix
collecting ... collected 8 items

matrix_test.py::MatrixTest::test_can_extract_column PASSED               [ 12%]
matrix_test.py::MatrixTest::test_can_extract_column_from_non_square_matrix_with_no_corresponding_row PASSED [ 25%]
matrix_test.py::MatrixTest::test_can_extract_row PASSED                  [ 37%]
matrix_test.py::MatrixTest::test_can_extract_row_from_non_square_matrix_with_no_corresponding_column PASSED [ 50%]
matrix_test.py::MatrixTest::test_extract_column_from_one_number_matrix PASSED [ 62%]
matrix_test.py::MatrixTest::test_extract_column_where_numbers_have_different_widths PASSED [ 75%]
matrix_test.py::MatrixTest::test_extract_row_from_one_number_matrix PASSED [ 87%]
matrix_test.py::MatrixTest::test_extract_row_where_numbers_have_different_widths PASSED [100%]

============================== 8 passed in 0.03s ===============================

    Your solution has been submitted successfully.
    View it at:

    
    https://exercism.io/my/solutions/b0dd69bb52e84812bf44fc804e3d4258

