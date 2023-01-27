import java.util.*;

//내 코드
import java.util.*;
 
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        //key값만 가져와서 genre에 넣어준다
        ArrayList<String> genre = new ArrayList<>();
        for(String key : map.keySet()) {
            genre.add(key);
        }
        Collections.sort(genre, (o1, o2) -> map.get(o2) - map.get(o1)); //key값에 해당하는 value를 내림차순으로 정렬한다.
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < genre.size(); i++) {
            String g = genre.get(i);
            
            //해당 장르의 음악 중에서 play횟수가 가장 큰 인덱스를 찾는다
            int max = 0;
            int firstIdx = -1;
            for(int j = 0; j < genres.length; j++) {
                if(g.equals(genres[j]) && max < plays[j]) {
                    max = plays[j];
                    firstIdx = j;
                }
            }
            
            //해당 장르의 음악 중에서 play횟수가 두번째로 큰 인덱스를 찾는다.
            max = 0;
            int secondIdx = -1;
            for(int j = 0; j < genres.length; j++) {
                if(g.equals(genres[j]) && max < plays[j] && j != firstIdx) { 
                    max = plays[j];
                    secondIdx = j;
                }
            }
            
            list.add(firstIdx);
            if(secondIdx >= 0) list.add(secondIdx); //secondIdx는 존재 할수도, 안할수도 있다.
        }
        
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}


//다른 사람 풀이
public class Solution {

    static class Music{
        String genre;
        int play;
        int idx;

        public Music(String genre, int play, int idx) {
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
    }

    public static int[] solution(String[] genres, int[] plays) {

        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i], 0)+plays[i]);
        }

        // 1. 장르 선정
        ArrayList<String> genres_ordered = new ArrayList<>();
        while(map.size()!=0){
            int max = -1;
            String max_key = "";
            for(String key : map.keySet()){
                int tmp_cnt = map.get(key);
                if(tmp_cnt>max){
                    max = tmp_cnt;
                    max_key = key;
                }
            }
            genres_ordered.add(max_key);
            map.remove(max_key);
        }
		
        // 2. 장르 내 노래 선정
        ArrayList<Music> result = new ArrayList<>();
        for(String gern : genres_ordered){
            ArrayList<Music> list = new ArrayList<>();
            for(int i=0; i<genres.length; i++){
                if(genres[i].equals(gern)){
                    list.add(new Music(gern, plays[i], i));
                }
            }
            Collections.sort(list, (o1, o2) -> o2.play - o1.play); // 내림차순 소팅
            result.add(list.get(0)); 	// 1개는 무조건 수록
            if(list.size()!=1){ 	// 더 수록할 곡이 있으면(==장르 내의 노래가 1개보다 많으면) 수록
                result.add(list.get(1));
            }
        }
        
        // print result
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i).idx;
        }
        return answer;
    }
}


