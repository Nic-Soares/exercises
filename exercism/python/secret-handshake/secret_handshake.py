def commands(binary_str):
    actions = ["jump", "close your eyes", "double blink", "wink"]
    code = list(binary_str)
    
    result = []
    
    if int(code[4]):
        result.append(actions[3])
    if int(code[3]):
        result.append(actions[2])
    if int(code[2]):
        result.append(actions[1])
    if int(code[1]):
        result.append(actions[0])
    if int(code[0]):
        result.reverse()

    return result

commands("01111")
