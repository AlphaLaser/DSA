# Linear Search Algorithm to search for a wor in a sentence

def linear_search_word(sentence , word ) :

    '''

    Linear Search to search for a word in a sentence (CASE INSENSITIVE)

    '''

    if len(sentence) == 0 :
        return False

    sentence = sentence.lower()

    words = sentence.split(" ")
    for i in words :
        if i == (word.lower()) :
            return True

    return False

