package extend;

public class Variables {
    private int[] values = new int[26];

    public Integer getValue(String varName) {
        // check variable name
        if (!validateVarName(varName)) {
            return null;
        }
        // transform 'a' -> 0
        int idx = varName.charAt(0) - 'a';
        // return value
        return values[idx];
    }

    public void setValue(String varName, String varValue) {
        // check variable name
        if (!validateVarName(varName)) {
            return;
        }
        // transform 'a' -> 0
        int idx = varName.charAt(0) - 'a';
        // transform "123" -> 123
        int value;
        try {
            value = Integer.valueOf(varValue);
        } catch (NumberFormatException e) {
            System.out.println("Error: invalid value");
            return;
        }
        // assign value
        values[idx] = value;
    }

    private boolean validateVarName(String varName) {
        // check variable name length
        if (varName.length() == 0) {
            System.out.println("Error: variable name is empty");
            return false;
        }
        char firstChar =varName.charAt(0);
        if (!(Character.isLetter(firstChar))){
            System.out.println("Error: variable name is invalid");
            return false;
        }
        for (int i=1;i<varName.length();i++){
            char currentChar=varName.charAt(i);
            if (Character.isLetterOrDigit(currentChar)||currentChar=='_'){
                System.out.println("Eror: variable name contains invalid characters");
                return false;
            }
        }
        return true;
    }
}
