from typing import List


def shaker_sort(vector: List[int]):
    swapped = True
    beginning = 0
    end = len(vector) - 1
    while swapped:
        swapped = False
        swapped = loop(vector, swapped, end)

        if not swapped:
            break

        swapped = False
        end -= 1


        for i in range(end, beginning, -1):
            if vector[i] < vector[i - 1]:
                vector[i], vector[i - 1] = vector[i - 1], vector[i]
                swapped = True

        beginning += 1

def bubble_sort(vector: List[int], swapped: bool = True):

    end = len(vector) - 1

    while swapped:
        swapped = False
        swapped = loop(vector, swapped, end)

        if not swapped:
            break

        end -= 1


def loop(vector: List[int], swapped: bool, end: int)-> bool:
    for i in range(end):
        if vector[i] > vector[i + 1]:
            vector[i], vector[i + 1] = vector[i + 1], vector[i]
            swapped = True

    return swapped