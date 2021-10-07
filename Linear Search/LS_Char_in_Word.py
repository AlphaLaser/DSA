# Linear Search Algorithm to search for a character in a word

def linear_search_char(word, char) :

    '''

    Linear Search to search for a character in a word (CASE INSENSITIVE)

    '''

    word = word.lower()
    char = char.lower()

    if len(word) == 0 :
        return False

    for i in word :
        if i == char :
            return True

    return False

