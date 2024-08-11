'''
You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.

Implement the function which takes an array containing the names of people that like an item. It must return the display text as shown in the examples:

[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
Note: For 4 or more names, the number in "and 2 others" simply increases.


'''

def likes(names):
    likes = len(names)
    
    if likes == 0:
        return "no one likes this"
    elif likes == 1:
        return f"{names[0]} likes this"
    elif likes == 2:
        return f"{names[0]} and {names[1]} like this"
    elif likes == 3:
        return f"{names[0]}, {names[1]} and {names[2]} like this"
    else:
        return f"{names[0]}, {names[1]} and {likes - 2} others like this"

# Exemplos de teste
print(likes([]))                      # Output: "no one likes this"
print(likes(["Peter"]))               # Output: "Peter likes this"
print(likes(["Jacob", "Alex"]))       # Output: "Jacob and Alex like this"
print(likes(["Max", "John", "Mark"])) # Output: "Max, John and Mark like this"
print(likes(["Alex", "Jacob", "Mark", "Max"]))  # Output: "Alex, Jacob and 2 others like this"
