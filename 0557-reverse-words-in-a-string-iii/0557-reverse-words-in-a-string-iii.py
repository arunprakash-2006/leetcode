class Solution(object):
    def reverseWords(self, s):
        ans=s.split(" ")
        ans1=""
        for i in ans:
            ans2=i[::-1]
            ans1+=ans2+" "
        return ans1.strip()

        
      
       
       

       
        