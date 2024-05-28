# Imports
import random
import time

# Class Definition: Tank
class Tank(object):
    def __init__(self, name):
        # Initialize tank properties
        self.name = name
        self.alive = True
        self.ammo = 5
        self.armor = 60

    def __str__(self):
        # Returns a string representation of the tank's status
        if self.alive:
            return "%s (%i armor, %i shells)" % (self.name, self.armor, self.ammo)
        else:
            return "%s (DEAD)" % self.name

    def fire_at(self, enemy):
        # Fires a shell at the specified enemy tank
        if self.ammo >= 1:
            self.ammo -= 1
            print(self.name, "fires on", enemy.name)
            enemy.hit()
        else:
            print(self.name, "has no shells!")

    def hit(self):
        # Handles a hit received by the tank
        self.armor -= 20
        print(self.name, "is hit")
        if self.armor <= 0:
            self.explode()

    def explode(self):
        # Handles the tank's explosion
        self.alive = False
        print(self.name, "explodes!")

# Function: create_tanks
def create_tanks(num_tanks):
    # Creates a dictionary containing 'num_tanks' Tank objects, with unique keys for each tank
    tanks = {}
    for i in range(num_tanks):
        tank_name = input(f"Enter the name for Tank {i+1}: ")
        tanks[chr(ord('a') + i)] = Tank(tank_name)
    return tanks

# Function: print_tank_info
def print_tank_info(tanks):
    # Prints the status of all tanks in the dictionary
    for key, tank in tanks.items():
        print(f"{key}: {tank}")

# Function: main
def main():
    # Main game function
    num_tanks = int(input("How many tanks do you want to create (between 2 and 10)? "))
    if num_tanks < 2 or num_tanks > 10:
        print("Invalid number of tanks. Please choose between 2 and 10.")
        return

    # Create tanks and start the game
    tanks = create_tanks(num_tanks)
    print("\nGame starts!")

    # Randomize the order of the keys in the tanks dictionary
    player_keys = list(tanks.keys())
    random.shuffle(player_keys)

    while len(tanks) > 1:
        # Loop through players in random order
        for current_player_key in player_keys:
            current_player = tanks[current_player_key]

            # Check if the player is alive and has ammo
            if not current_player.alive or current_player.ammo == 0:
                continue

            print(f"\nIt's {current_player.name}'s turn.")
            print_tank_info(tanks)

            while True:
                # Get the target player choice
                target_key = input(f"{current_player.name}, choose a target (enter the corresponding letter): ")
                if target_key in tanks and target_key != current_player_key:
                    break
                else:
                    print("Invalid target. Choose again.")

            # Fire at the selected target player
            target_player = tanks[target_key]
            current_player.fire_at(target_player)

            # Check if the target player is dead and remove from the game
        if not target_player.alive:
            del tanks[target_key]
            player_keys.remove(target_key)  # Remove the eliminated player from active player list

            time.sleep(1)

    # Game over, print the surviving tank
    print("\nGame over!")
    print("The surviving tank is:", list(tanks.values())[0].name)

# Execute the main function if this script is run as the main program
if __name__ == "__main__":
    main()