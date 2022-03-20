# Bubble Sort

def bubble(arr):

    # To ignore the elements at final indices with each pass
    x = 1

    # Iteration for each Pass
    for i in range(len(arr) - 1):
        j = 0

        # Iteration for each swap in the pass
        for j in range(len(arr) - x) :

            # Swap Conditional
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
            else:
                pass


            j += 1
        x += 1

    return arr

