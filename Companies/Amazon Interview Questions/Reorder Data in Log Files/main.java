//Question Link: Reorder Data in Log Files

class Solution {
    public String[] reorderLogFiles(String[] logs) {

        if (logs.length ==0 )return logs;

    Arrays.sort (logs, (a,b) -> {

        String[] arrA = a.split(" ", 2);
        String[] arrB = b.split(" ", 2);

        boolean aDigit = Character.isDigit(arrA[1].charAt(0));
        boolean bDigit = Character.isDigit(arrB[1].charAt(0));
        if (aDigit && bDigit) return 0;
        if (aDigit ) return 1;
        if (bDigit ) return -1;

        int res = arrA[1].compareTo(arrB[1]);
        if (res ==0) {
            res = arrA[0].compareTo(arrB[0]);
        }
        return res;
    })  ;
        return logs;
        }
    }
