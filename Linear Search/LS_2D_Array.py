# Linear Search Algorithm in a 2D Array

def search(arr, target) :

    '''
    Returns the position of the target if found in the 2D Array and False if not
    '''

    if len(arr)  == 0 :
        return False

    count1 = -1


    for i in arr :
        count1 += 1
        count2 = -1
        for j in i :
            count2 += 1
            if j == target :
                return (count1, count2 )

    return False

test_arr = [
    [1,2,3,4,5],
    [6,7,8],
    [9,10,11,12]
]

print(search(test_arr, 4))

