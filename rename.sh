#!/bin/bash

# Array of ordered file names
files=(
    "helloworld.java"
    "increment.java"
    "forloop.java"
    "whileloop.java"
    "dowhileloop.java"
    "ifelse.java"
    "breakinloop.java"
    "continueinloop.java"
    "typecasting1.java"
    "array.java"
    "arrayloop.java"
    "multidimensionalarr.java"
    "method.java"
    "method1.java"
    "method3.java"
    "Constructor.java"
    "inheritancebyme.java"
    "inheritancebyme2.java"
    "methodoverriding.java"
    "abstractclass.java"
    "interfaces.java"
    "DynamicMethoDispatch.java"
    "polymorphismininterfaces.java"
    "cwh_45_inheritance.java"
    "cwh_59_polymorphism.java"
    "multithreading.java"
    "threads.java"
    "threadbyrunnableinterface.java"
    "cwh_73_thread_constructor.java"
    "trycatch.java"
    "nestedtrycatch.java"
    "finallyfunc.java"
    "rockpaper.java"
    "random.java"
    "random2.java"
    "random3.java"
    "random4.java"
    "random6.java"
    "random7.java"
    "random8.java"
    "random9.java"
    "random10.java"
    "random11.java"
    "random12.java"
    "random13.java"
    "random45.java"
    "date.java"
    "date1.java"
    "string.java"
    "pyramid.java"
    "varArgs.java"
    "base.java"
    "constructorinineheri.java"
    "college.java"
    "allinonepackage.java"
    "ArrayLista.java"
    "Arraylist.java"
    "arraylist1.java"
    "arraydeque1.java"
    "fbvfshjmkh.java"
    "bkchodi.java"
    "dk.java"
    "tempCodeRunnerFile.java"
    "infloop.java"
    "multiplevarinloop.java"
    "Recursion.java"
)

# Directory where your Java files are located
directory="/home/aryan/Programming/java"

# Change to the directory
cd "$directory" || exit

# Rename each file with a number prefix
for i in "${!files[@]}"; do
    original_file="${files[$i]}"
    new_file="$((i + 1))${original_file}"

    if [[ -f "$original_file" ]]; then
        mv "$original_file" "$new_file"
        echo "Renamed $original_file to $new_file"
    else
        echo "File $original_file does not exist, skipping..."
    fi
done
