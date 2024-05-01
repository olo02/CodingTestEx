using System;
using System.Linq;

public class Solution {
    public string solution(string[] cards1, string[] cards2, string[] goal) {
        string answer = "Yes";
        foreach(var word in goal)
        {
            if(cards1.Length > 0 && cards1[0].Equals(word))
            {
                cards1 = cards1.Skip(1).ToArray();
            }
            else if(cards2.Length > 0 && cards2[0].Equals(word))
            {
                cards2 = cards2.Skip(1).ToArray();
            }
            else
            {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}