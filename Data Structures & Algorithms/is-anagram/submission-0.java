class Solution {
    public boolean isAnagram(String s, String t) {

        //now i am going to working on the code where the 
        //1 char arr se sorting and then i i convert to the arr 

        char ham1[]=s.toCharArray();
        char ham2[]=t.toCharArray();

        Arrays.sort(ham1);
        Arrays.sort(ham2);


        String sam1=new String(ham1);
        String sam2=new String(ham2);

        boolean kam=false;

        if(sam1.equals(sam2)){
            kam=true;

        }
        return kam;
    }
}
