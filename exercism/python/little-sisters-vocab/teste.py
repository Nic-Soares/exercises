# str.join() makes a new string from the iterables elements.
word = "heaviness"

if word.endswith("ness"):
    root = word[:-4]
    print(root[-1:])

    if root[-1] == "i":
        root = root[:-1] + "y"
        print(root)

    print(root)
else:
    print(root)




