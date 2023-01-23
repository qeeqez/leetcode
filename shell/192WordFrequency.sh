#!/bin/sh
### 192. Word Frequency ###

# Write a bash script to calculate the frequency of each word in a text file words.txt.

# For simplicity sake, you may assume:
# words.txt contains only lowercase characters and space ' ' characters.
# Each word must consist of lowercase characters only.
# Words are separated by one or more whitespace characters.

# Example words.txt:
# the day is sunny the the
# the sunny is is

# Expected output:
# the 4
# is 3
# sunny 2
# day 1

# Note:
# Don't worry about handling ties, it is guaranteed that each word's frequency count is unique.
# Could you write it in one-line using Unix pipes?

# Fastest Solution
tr -s " " "\n" < 192.words.txt | sort | uniq -c | sort -r | awk '{print $2 " " $1}'

# Slower Solution
grep -Eow '\w+' 192.words.txt | sort -n | uniq -c | sort -rn | awk '{print $2 " " $1}'

