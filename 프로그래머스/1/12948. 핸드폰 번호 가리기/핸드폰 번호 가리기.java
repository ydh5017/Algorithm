class Solution {
    public String solution(String phone_number) {
        String back = phone_number.substring(phone_number.length()-4, phone_number.length());
        String front = "";
        for (int i = 0; i < phone_number.length()-4; i++) {
            front += "*";
        }
        return front+back;
    }
}