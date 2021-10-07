# Linear Search Algorithm to search for an integer within a range in an array

def linear_search_range(arr, ind1, ind2, target) :

    '''

    arr : Input the Array

    If range is in the form 3:20,
    ind1 = 3
    ind2 = 20

    target : The no. you want to search for

    '''

    new_arr = arr[ind1 : (ind2 + 1)]

    if len(new_arr) == 0 :
        return False

    for i in new_arr :
        if i == target :
            return True

    return False

