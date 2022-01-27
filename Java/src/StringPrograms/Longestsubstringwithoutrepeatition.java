package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class Longestsubstringwithoutrepeatition {
    public static void main(String[] args){
        String s=new String("madhukiranpinnu");
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        String lonestsubstring=null;
        int longestsubstringlength=0;
        char[] ch=new char[s.length()];
        for(int i=0;i<s.length();i++){
            char t=ch[i];
            if(!map.containsKey(t)){
                map.put(t,i);
            }
            else
            {
                i=map.get(t);
                map.clear();
            }
            if(map.size()>longestsubstringlength){
                longestsubstringlength=map.size();
                lonestsubstring=map.keySet().toString();
            }
        }
        System.out.println(lonestsubstring);
        System.out.println(longestsubstringlength);
    }
}
