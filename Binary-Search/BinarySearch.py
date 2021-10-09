# Binary Search algorithm to search for a value in a sorted array

def binarySearch (arr, target) :
    '''

    Returns the index of the element if found else returns False

    '''

     
    start = 0
    end = len(arr) - 1

    while start <= end :

        mid = ((start+end) // 2)

        if target < (arr[mid]) :
            end = mid - 1

        elif target > (arr[mid]) :
            start = mid + 1

        else:
            return mid


    return False

