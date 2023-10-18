import pytest
from compare_average import calculate_average, compare_average_lists

# Тесты для функции calculate_average
def test_calculate_average_empty_list():
    assert calculate_average([]) == 0


def test_calculate_average_non_empty_list():
    assert calculate_average([1, 2, 3, 4, 5]) == 3.0

# Тесты для функции compare_average_lists
def test_compare_average_lists_first_greater():
    assert compare_average_lists(
        [1, 2, 3], [1, 2]) == "Первый список имеет большее среднее значение"


def test_compare_average_lists_second_greater():
    assert compare_average_lists(
        [1, 2], [1, 2, 3]) == "Второй список имеет большее среднее значение"


def test_compare_average_lists_equal():
    assert compare_average_lists(
        [1, 2, 3], [1, 2, 3]) == "Средние значения равны"


# Запустить тесты с помощью pytest
if __name__ == '__main__':
    pytest.main()
