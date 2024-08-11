#!/bin/bash

declare -A files
files=(
    [1012]="Area"
    [1013]="The_Greatest"
    [1014]="Consumption"
    [1015]="Distance"
    [1016]="Between_Two_Points"
    [1017]="Distance"
    [1018]="Fuel"
    [1019]="Spent"
    [1020]="Banknotes"
    [1021]="Time_Conversion"
    [1035]="Age_in_Days"
    [1036]="Banknotes_and_Coins"
    [1037]="Selection"
)

# Loop through the associative array and create the files
for number in "${!files[@]}"; do
    filename="BEE${number}_${files[$number]}.py"
    touch "$filename"
    echo "#!/usr/bin/env python3" > "$filename"
    echo "# -*- coding: utf-8 -*-" >> "$filename"
    echo "" >> "$filename"
    echo "# Problem number: $number" >> "$filename"
    echo "# Title: ${files[$number]//_/ }" >> "$filename"
    echo "" >> "$filename"
done

# Create specific files with custom names
touch "BEE1022_Test_1.py"
echo "#!/usr/bin/env python3" > "BEE1022_Test_1.py"
echo "# -*- coding: utf-8 -*-" >> "BEE1022_Test_1.py"
echo "" >> "BEE1022_Test_1.py"
echo "# Problem number: 1022" >> "BEE1022_Test_1.py"
echo "# Title: Test 1" >> "BEE1022_Test_1.py"
echo "" >> "BEE1022_Test_1.py"

touch "BEE1038_Bhaskaras_Formula.py"
echo "#!/usr/bin/env python3" > "BEE1038_Bhaskaras_Formula.py"
echo "# -*- coding: utf-8 -*-" >> "BEE1038_Bhaskaras_Formula.py"
echo "" >> "BEE1038_Bhaskaras_Formula.py"
echo "# Problem number: 1038" >> "BEE1038_Bhaskaras_Formula.py"
echo "# Title: Bhaskara's Formula" >> "BEE1038_Bhaskaras_Formula.py"
echo "" >> "BEE1038_Bhaskaras_Formula.py"

touch "BEE1039_Interval.py"
echo "#!/usr/bin/env python3" > "BEE1039_Interval.py"
echo "# -*- coding: utf-8 -*-" >> "BEE1039_Interval.py"
echo "" >> "BEE1039_Interval.py"
echo "# Problem number: 1039" >> "BEE1039_Interval.py"
echo "# Title: Interval" >> "BEE1039_Interval.py"
echo "" >> "BEE1039_Interval.py"

echo "Files created successfully."

