from collections import Counter

import numpy as np


def repeated_letters(word):
    freq = Counter(word)
    final_list = []
    for letter in freq:
        if freq[letter] > 1:
            final_list += letter
    return final_list


def count_chars(s):
    arr = np.frombuffer(s, dtype=np.uint8)
    unique_chars, char_counts = np.unique(arr, return_counts=True)
    return dict(zip(unique_chars, char_counts))


print(repeated_letters("lkdjfkdddsjfk"))
