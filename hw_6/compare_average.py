def calculate_average(numbers):
    if len(numbers) == 0:
        return 0
    return sum(numbers) / len(numbers)


def compare_average_lists(list1, list2):
    avg1 = calculate_average(list1)
    avg2 = calculate_average(list2)

    if avg1 > avg2:
        return "Первый список имеет большее среднее значение"
    elif avg2 > avg1:
        return "Второй список имеет большее среднее значение"
    else:
        return "Средние значения равны"


# Ввод списков чисел
list1 = [int(x) for x in input(
    "Введите числа первого списка, разделенные пробелом: ").split()]
list2 = [int(x) for x in input(
    "Введите числа второго списка, разделенные пробелом: ").split()]

result = compare_average_lists(list1, list2)
print(result)
