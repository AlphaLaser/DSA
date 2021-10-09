def orderAgnosticBS (arr, target) :

    start = 0
    end = len(arr) - 1
    isAsc = None

    if arr[start] < arr[end] :
        isAsc = True
    elif arr[start] > arr[end] :
        isAsc = False
    else:
        isAsc = True

    while start <= end :

        mid = ((start+end) // 2)

        if arr[mid] == target:
            return mid

        if isAsc == True :

            if target < (arr[mid]) :
                end = mid - 1

            elif target > (arr[mid]) :
                start = mid + 1

        else:

            if target > (arr[mid]):
                end = mid - 1

            elif target < (arr[mid]):
                start = mid + 1


    return False

