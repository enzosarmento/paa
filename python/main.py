import random

from algorithms.sorts import shaker_sort, bubble_sort


def main():
    vector = [random.randint(1, 100) for _ in range(10)]
    print(vector)
    shaker_sort(vector)
    print(vector)

if __name__ == "__main__":
    main()

