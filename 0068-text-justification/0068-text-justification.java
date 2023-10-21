class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res=new ArrayList<>();
        int n=words.length;
        int i=0;
        while(i<n)
        {
            int letterCounts=words[i].length();
            int j=i+1;
            int space=0;
            while(j<n && words[j].length()+1+space+letterCounts<=maxWidth)
            {
                letterCounts+=words[j].length();
                space+=1;
                j++;
            }
             int remainingSpace=maxWidth-letterCounts;

                int eachspace = space == 0 ? 0 :remainingSpace / space;
                int extraspace = space == 0 ? 0 : remainingSpace % space;


            if(j==n)
            {
                eachspace=1; 
                extraspace=0;  
            }

            res.add(findline(i,j,eachspace,extraspace,words,maxWidth));

            i=j;

        }
        return res;
    }

    String findline(int i,int j,int eachspace,int extraspace,String[] words, int maxWidth)
    {
        String line="";
        for(int k=i;k<j;k++)
        {
            line+=words[k];
            if(k==j-1) 
            {
                continue;
            }
            for(int z=1;z<=eachspace;z++)
            {
                line+=" ";
            }
            if(extraspace>0)
            {
                line+=" ";
                extraspace--;
            }
        }
        while(line.length()<maxWidth)
        {
            line+=" ";
        }
        return line;
    }
}