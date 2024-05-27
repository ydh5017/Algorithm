class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0;
        int y = 0;
        
        char[][] arr = new char[park.length][park[0].length()];
        
        for(int i = 0; i < park.length; i++){
            arr[i] = park[i].toCharArray();
            
            if(park[i].contains("S")){
                y = i;
                x = park[i].indexOf("S");
            }
        }
        for(String s : routes){
            String way = s.split(" ")[0];
            int len = Integer.parseInt(s.split(" ")[1]);
            
            int nx = x;
            int ny = y;
            
            for(int i = 0; i < len; i++){
                if(way.equals("E")){
                    nx++;
                }
                if(way.equals("W")){
                    nx--;
                }
                if(way.equals("S")){
                    ny++;
                }
                if(way.equals("N")){
                    ny--;
                }
                if(nx >=0 && ny >=0 && ny < arr.length && nx < arr[0].length){
                    if(arr[ny][nx] == 'X'){
                        break;
                    }
                    if(i == len-1){
                        x = nx;
                        y = ny;
                    }
                }
            }
        }
        int[] answer = {y, x};
        return answer;
    }
}