import unittest


def to_jaden_case(string):
    capitalized_message = " ".join([
        word.capitalize()
        for word in string.split(" ")
    ])
    return capitalized_message


