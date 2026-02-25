class Solution {
    public String convertDateToBinary(String date) {
        String[] parts = date.split("-");
        StringBuilder binaryDate = new StringBuilder();

        for (int i=0; i <parts.length; i++){
            int val= Integer.parseInt(parts[i]);
            binaryDate.append(Integer.toBinaryString(val));

            if(i < parts.length - 1){
                binaryDate.append("-");
            }
        }
        return binaryDate.toString();
    }
}
