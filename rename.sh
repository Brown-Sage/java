#!/bin/bash

# Specify the directory where your Java files are located
directory=$pwd

# Change to the specified directory
cd "$directory" || exit

# Loop through all .java files in the directory
for file in *.java; do
    # Check if the file starts with a digit
    if [[ $file =~ ^[0-9] ]]; then
        # Extract the number and the rest of the filename
        number="${file%%[!0-9]*}"
        rest="${file#$number}"
        
        # Form the new filename
        new_filename="j${number}_${rest}"

        # Rename the file
        mv "$file" "$new_filename"

        # Print the renamed file
        echo "Renamed: $file -> $new_filename"
    fi
done
