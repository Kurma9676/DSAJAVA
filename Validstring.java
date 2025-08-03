class Validstring {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));

            if (!Character.isLetterOrDigit(ch)) {
                return false; // invalid character
            }

            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
        }

        return hasVowel && hasConsonant;
    }
}
