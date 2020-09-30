---
title: 'exercism python #3 - raindrops'
---

## Raindrops

Your task is to convert a number into a string that contains raindrop sounds corresponding to certain potential factors. A factor is a number that evenly divides into another number, leaving no remainder. The simplest way to test if a one number is a factor of another is to use the [modulo operation](https://en.wikipedia.org/wiki/Modulo_operation).

The rules of `raindrops` are that if a given number:

- has 3 as a factor, add 'Pling' to the result.
- has 5 as a factor, add 'Plang' to the result.
- has 7 as a factor, add 'Plong' to the result.
- _does not_ have any of 3, 5, or 7 as a factor, the result should be the digits of the number.

## Examples

- 28 has 7 as a factor, but not 3 or 5, so the result would be "Plong".
- 30 has both 3 and 5 as factors, but not 7, so the result would be "PlingPlang".
- 34 is not factored by 3, 5, or 7, so the result would be "34".

## Solution

[lists]()
[dictionaries]() 

``` python
# raindrops.py

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

# def convert(number):
#     answer = ""
#     if number % 3 == 0:
#         answer += "Pling"
#     if number % 5 == 0:
#         answer += "Plang"
#     if number % 7 == 0:
#         answer += "Plong"
#     if number % 3 != 0 and number % 5 != 0 and number % 7 != 0:
#         answer = str(number)
#     return answer

# raindrops_test.py

import unittest

from raindrops import convert

# Tests adapted from `problem-specifications//canonical-data.json` @ v1.1.0

class RaindropsTest(unittest.TestCase):
    def test_the_sound_for_1_is_1(self):
        self.assertEqual(convert(1), "1")

    def test_the_sound_for_3_is_pling(self):
        self.assertEqual(convert(3), "Pling")

    def test_the_sound_for_5_is_plang(self):
        self.assertEqual(convert(5), "Plang")

    def test_the_sound_for_7_is_plong(self):
        self.assertEqual(convert(7), "Plong")

    def test_the_sound_for_6_is_pling_as_it_has_a_factor_3(self):
        self.assertEqual(convert(6), "Pling")

    def test_2_to_the_power_3_does_not_make_a_raindrop_sound_as_3_is_the_exponent_not_the_base(
        self
    ):
        self.assertEqual(convert(8), "8")

    def test_the_sound_for_9_is_pling_as_it_has_a_factor_3(self):
        self.assertEqual(convert(9), "Pling")

    def test_the_sound_for_10_is_plang_as_it_has_a_factor_5(self):
        self.assertEqual(convert(10), "Plang")

    def test_the_sound_for_14_is_plong_as_it_has_a_factor_of_7(self):
        self.assertEqual(convert(14), "Plong")

    def test_the_sound_for_15_is_pling_plang_as_it_has_factors_3_and_5(self):
        self.assertEqual(convert(15), "PlingPlang")

    def test_the_sound_for_21_is_pling_plong_as_it_has_factors_3_and_7(self):
        self.assertEqual(convert(21), "PlingPlong")

    def test_the_sound_for_25_is_plang_as_it_has_a_factor_5(self):
        self.assertEqual(convert(25), "Plang")

    def test_the_sound_for_27_is_pling_as_it_has_a_factor_3(self):
        self.assertEqual(convert(27), "Pling")

    def test_the_sound_for_35_is_plang_plong_as_it_has_factors_5_and_7(self):
        self.assertEqual(convert(35), "PlangPlong")

    def test_the_sound_for_49_is_plong_as_it_has_a_factor_7(self):
        self.assertEqual(convert(49), "Plong")

    def test_the_sound_for_52_is_52(self):
        self.assertEqual(convert(52), "52")

    def test_the_sound_for_105_is_pling_plang_plong_as_it_has_factors_3_5_and_7(self):
        self.assertEqual(convert(105), "PlingPlangPlong")

    def test_the_sound_for_3125_is_plang_as_it_has_a_factor_5(self):
        self.assertEqual(convert(3125), "Plang")

if __name__ == "__main__":
    unittest.main()
```

``` shell
$ pytest -v raindrops_test.py
============================= test session starts ==============================
platform linux -- Python 3.8.5, pytest-6.0.1, py-1.9.0, pluggy-0.13.1 -- /usr/bin/python
cachedir: .pytest_cache
rootdir: /home/user0/Exercism/python/raindrops
collecting ... collected 18 items

raindrops_test.py::RaindropsTest::test_2_to_the_power_3_does_not_make_a_raindrop_sound_as_3_is_the_exponent_not_the_base PASSED [  5%]
raindrops_test.py::RaindropsTest::test_the_sound_for_105_is_pling_plang_plong_as_it_has_factors_3_5_and_7 PASSED [ 11%]
raindrops_test.py::RaindropsTest::test_the_sound_for_10_is_plang_as_it_has_a_factor_5 PASSED [ 16%]
raindrops_test.py::RaindropsTest::test_the_sound_for_14_is_plong_as_it_has_a_factor_of_7 PASSED [ 22%]
raindrops_test.py::RaindropsTest::test_the_sound_for_15_is_pling_plang_as_it_has_factors_3_and_5 PASSED [ 27%]
raindrops_test.py::RaindropsTest::test_the_sound_for_1_is_1 PASSED       [ 33%]
raindrops_test.py::RaindropsTest::test_the_sound_for_21_is_pling_plong_as_it_has_factors_3_and_7 PASSED [ 38%]
raindrops_test.py::RaindropsTest::test_the_sound_for_25_is_plang_as_it_has_a_factor_5 PASSED [ 44%]
raindrops_test.py::RaindropsTest::test_the_sound_for_27_is_pling_as_it_has_a_factor_3 PASSED [ 50%]
raindrops_test.py::RaindropsTest::test_the_sound_for_3125_is_plang_as_it_has_a_factor_5 PASSED [ 55%]
raindrops_test.py::RaindropsTest::test_the_sound_for_35_is_plang_plong_as_it_has_factors_5_and_7 PASSED [ 61%]
raindrops_test.py::RaindropsTest::test_the_sound_for_3_is_pling PASSED   [ 66%]
raindrops_test.py::RaindropsTest::test_the_sound_for_49_is_plong_as_it_has_a_factor_7 PASSED [ 72%]
raindrops_test.py::RaindropsTest::test_the_sound_for_52_is_52 PASSED     [ 77%]
raindrops_test.py::RaindropsTest::test_the_sound_for_5_is_plang PASSED   [ 83%]
raindrops_test.py::RaindropsTest::test_the_sound_for_6_is_pling_as_it_has_a_factor_3 PASSED [ 88%]
raindrops_test.py::RaindropsTest::test_the_sound_for_7_is_plong PASSED   [ 94%]
raindrops_test.py::RaindropsTest::test_the_sound_for_9_is_pling_as_it_has_a_factor_3 PASSED [100%]

============================== 18 passed in 0.04s ==============================

$ exercism submit raindrops.py

Your solution has been submitted successfully.
View it at:

https://exercism.io/my/solutions/36815234aec34fb2b0a7501b710c0e69
```

