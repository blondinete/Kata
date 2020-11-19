from nose.tools import assert_equal
from kyu7.list_filtering import filter_list

try:
    list_to_filter = filter_list
except NameError:
    pass

assert_equal(filter_list([1, 2, 'a', 'b']), [1, 2])
assert_equal(filter_list([1, 'a', 'b', 0, 15]), [1, 0, 15])
assert_equal(filter_list([1, 2, 'aasf', '1', '123', 123]), [1, 2, 123])
