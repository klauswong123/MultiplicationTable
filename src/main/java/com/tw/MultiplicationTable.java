package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        if (isValid(start,end)){
            return generateTable(start,end);
        }
        return null;
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start,end);
    }

    public Boolean isInRange(int number) {
        return number>=1 && number<=1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start<=end;
    }

    public String generateTable(int start, int end) {
        String string="";
        for (int index=start; index<=end; index++){
            string=string.concat(generateLine(start,index)+"\r\n");
        }
        return string.trim();
    }

    public String generateLine(int start, int row) {
        String string = "";
        int temp =row;
        int temp1=start;
        for  (int index=start; index<=row; index++) {
            string=string.concat(generateSingleExpression(index,row) + "  ");
            temp=temp+1;
            temp1=temp1+1;
        }
        return string.trim();
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return multiplicand+"*"+multiplier+"="+multiplicand*multiplier;
    }


}
