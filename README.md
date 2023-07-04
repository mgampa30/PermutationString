# PermutationString

# Algorithm
The generatePermutations method takes two parameters: currentPermutation and remainingString.
It checks if the remainingString is null. If so, it returns, as there is nothing more to process.
It checks if the remainingString is empty. If so, it means we have generated a complete permutation, and the currentPermutation is printed.
Inside a loop, it iterates over each character in the remainingString.
For each character, it creates a new permutation by appending the character to the currentPermutation.
It creates a new string newRemaining by removing the current character from the remainingString.
The method calls itself recursively with the new permutation (newPermutation) and the new remaining string (newRemaining).
This process continues until all possible permutations are generated.
