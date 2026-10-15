string = input("Input a string: ")

def vowel_counter(string1):
    count = 0
    for i in string1:
        if i in "aeiou":
            count += 1
    return count

print(vowel_counter(string))