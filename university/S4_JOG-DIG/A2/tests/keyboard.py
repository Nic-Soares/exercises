from pynput import keyboard

def on_key_release(key):
    try:
        print(f'Tecla liberada: {key.char}')
    except AttributeError:
        print(f'Tecla especial liberada: {key}')

def main():
    with keyboard.Listener(on_release=on_key_release) as listener:
        listener.join()

if __name__ == "__main__":
    main()
