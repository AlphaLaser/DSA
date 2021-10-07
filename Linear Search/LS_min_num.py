# Linear Search Algorithm to find out the smallest number in an array

def min_num(arr) :

    if len(arr) == 0 :
        return "Array Empty"

    min_num = arr[0]

    for i in arr :
        if  i < min_num :
                min_num = i

    return (min_num)

