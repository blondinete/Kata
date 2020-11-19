def filter_list(list_to_filter):
    new_list = []
    for element in list_to_filter:
        if type(element) == int:
            new_list.append(element)
    return new_list


def filter_list_best_practice(list_to_filter):
    """return a new list with the strings filtered out"""
    return [i for i in list_to_filter if not isinstance(i, str)]
