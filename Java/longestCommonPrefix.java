// https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Prefijo se inicializa en la primera palabra del array
        String prefix = strs[0];

        // Ciclo que recorre el array comenzando desde el segundo elemento
        for (int i = 1; i < strs.length; i++) {
            // Ciclo que va recortando el prefijo hasta que se encuentre en la palabra
            // 0 -> Se encontró el prefijo en la posicicón cero, por ende, el prefijo se encuentra en la palabra
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}