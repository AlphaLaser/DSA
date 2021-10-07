# Linear Search on an array

def linear_search(arr, target) :

    '''

    Returns True if target is in the array . Returns False if it is not

    '''


    if len(arr) == 0 :
        return False

    for i in arr :
        if i == target :
            return True

    return False


