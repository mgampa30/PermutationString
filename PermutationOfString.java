class Main {
    private static void generatePermutations(String currentPermutation, String remainingString) {
        if (remainingString == null) {
            return;
        }

        if (remainingString.length() == 0) {
            System.out.println(currentPermutation);
        }

        for (int i = 0; i < remainingString.length(); i++) {
            String newPermutation = currentPermutation + remainingString.charAt(i);

            String newRemaining = remainingString.substring(0, i) +
                    remainingString.substring(i + 1);

            generatePermutations(newPermutation, newRemaining);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        generatePermutations("", str);
    }
}
