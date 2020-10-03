---
title: 'exercism python #4 - highscores'
---
Exercism #4
    Your solution has been submitted successfully.
    View it at:

    
    https://exercism.io/my/solutions/30770ae4fb07446fb9b21bf77dfa2ebf

============================= test session starts ==============================
platform linux -- Python 3.8.5, pytest-6.0.1, py-1.9.0, pluggy-0.13.1 -- /usr/bin/python
cachedir: .pytest_cache
rootdir: /home/user0/Exercism/python
collecting ... collected 29 items

hello-world/hello_world_test.py::HelloWorldTest::test_say_hi PASSED      [  3%]
high-scores/high_scores_test.py::HighScoresTest::test_latest_score PASSED [  6%]
high-scores/high_scores_test.py::HighScoresTest::test_personal_best PASSED [ 10%]
high-scores/high_scores_test.py::HighScoresTest::test_personal_top_highest_to_lowest PASSED [ 13%]
high-scores/high_scores_test.py::HighScoresTest::test_personal_top_three_from_a_list_of_scores PASSED [ 17%]
high-scores/high_scores_test.py::HighScoresTest::test_personal_top_when_there_are_less_than_3 PASSED [ 20%]
high-scores/high_scores_test.py::HighScoresTest::test_personal_top_when_there_is_a_tie PASSED [ 24%]
high-scores/high_scores_test.py::HighScoresTest::test_personal_top_when_there_is_only_one PASSED [ 27%]
raindrops/raindrops_test.py::RaindropsTest::test_2_to_the_power_3_does_not_make_a_raindrop_sound_as_3_is_the_exponent_not_the_base PASSED [ 31%]
raindrops/raindrops_test.py::RaindropsTest::test_the_sound_for_105_is_pling_plang_plong_as_it_has_factors_3_5_and_7 PASSED [ 34%]
raindrops/raindrops_test.py::RaindropsTest::test_the_sound_for_10_is_plang_as_it_has_a_factor_5 PASSED [ 37%]
raindrops/raindrops_test.py::RaindropsTest::test_the_sound_for_14_is_plong_as_it_has_a_factor_of_7 PASSED [ 41%]
raindrops/raindrops_test.py::RaindropsTest::test_the_sound_for_15_is_pling_plang_as_it_has_factors_3_and_5 PASSED [ 44%]
raindrops/raindrops_test.py::RaindropsTest::test_the_sound_for_1_is_1 PASSED [ 48%]
raindrops/raindrops_test.py::RaindropsTest::test_the_sound_for_21_is_pling_plong_as_it_has_factors_3_and_7 PASSED [ 51%]
raindrops/raindrops_test.py::RaindropsTest::test_the_sound_for_25_is_plang_as_it_has_a_factor_5 PASSED [ 55%]
raindrops/raindrops_test.py::RaindropsTest::test_the_sound_for_27_is_pling_as_it_has_a_factor_3 PASSED [ 58%]
raindrops/raindrops_test.py::RaindropsTest::test_the_sound_for_3125_is_plang_as_it_has_a_factor_5 PASSED [ 62%]
raindrops/raindrops_test.py::RaindropsTest::test_the_sound_for_35_is_plang_plong_as_it_has_factors_5_and_7 PASSED [ 65%]
raindrops/raindrops_test.py::RaindropsTest::test_the_sound_for_3_is_pling PASSED [ 68%]
raindrops/raindrops_test.py::RaindropsTest::test_the_sound_for_49_is_plong_as_it_has_a_factor_7 PASSED [ 72%]
raindrops/raindrops_test.py::RaindropsTest::test_the_sound_for_52_is_52 PASSED [ 75%]
raindrops/raindrops_test.py::RaindropsTest::test_the_sound_for_5_is_plang PASSED [ 79%]
raindrops/raindrops_test.py::RaindropsTest::test_the_sound_for_6_is_pling_as_it_has_a_factor_3 PASSED [ 82%]
raindrops/raindrops_test.py::RaindropsTest::test_the_sound_for_7_is_plong PASSED [ 86%]
raindrops/raindrops_test.py::RaindropsTest::test_the_sound_for_9_is_pling_as_it_has_a_factor_3 PASSED [ 89%]
two-fer/two_fer_test.py::TwoFerTest::test_a_name_given PASSED            [ 93%]
two-fer/two_fer_test.py::TwoFerTest::test_another_name_given PASSED      [ 96%]
two-fer/two_fer_test.py::TwoFerTest::test_no_name_given PASSED           [100%]

============================== 29 passed in 0.05s ==============================
==> high_scores.py <==
def latest(scores):
    return scores.pop()


def personal_best(scores):
    return max(scores)


def personal_top_three(scores):
    return sorted(scores, reverse=True)[:3]


==> high_scores_test.py <==
import unittest

from high_scores import latest, personal_best, personal_top_three

# Tests adapted from `problem-specifications//canonical-data.json` @ v4.0.0


class HighScoresTest(unittest.TestCase):
    def test_latest_score(self):
        scores = [100, 0, 90, 30]
        expected = 30
        self.assertEqual(latest(scores), expected)

    def test_personal_best(self):
        scores = [40, 100, 70]
        expected = 100
        self.assertEqual(personal_best(scores), expected)

    def test_personal_top_three_from_a_list_of_scores(self):
        scores = [10, 30, 90, 30, 100, 20, 10, 0, 30, 40, 40, 70, 70]
        expected = [100, 90, 70]
        self.assertEqual(personal_top_three(scores), expected)

    def test_personal_top_highest_to_lowest(self):
        scores = [20, 10, 30]
        expected = [30, 20, 10]
        self.assertEqual(personal_top_three(scores), expected)

    def test_personal_top_when_there_is_a_tie(self):
        scores = [40, 20, 40, 30]
        expected = [40, 40, 30]
        self.assertEqual(personal_top_three(scores), expected)

    def test_personal_top_when_there_are_less_than_3(self):
        scores = [30, 70]
        expected = [70, 30]
        self.assertEqual(personal_top_three(scores), expected)

    def test_personal_top_when_there_is_only_one(self):
        scores = [40]
        expected = [40]
        self.assertEqual(personal_top_three(scores), expected)


if __name__ == "__main__":
    unittest.main()
